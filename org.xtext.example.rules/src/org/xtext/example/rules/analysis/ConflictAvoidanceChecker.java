package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * 
 * @author cnandi
 *
 */
public class ConflictAvoidanceChecker {

	public static PrintWriter ast_writer;
	static {
		try {
			ast_writer = new PrintWriter("ast-output.txt");
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		String rule_file = "sample_rule1.rules";
		String item_file= "sample_item1.items";
		File conflict_file = new File("/home/cnandi/openHABworkspace/org.xtext.example.rules/src/org/xtext/example/rules/analysis/files/sample_conflict.conflicts");
		
		SpecificationParser specParser = new SpecificationParser();
		specParser.parseConflicts(conflict_file);
		
		ItemParser itemParser=new ItemParser(item_file);
		itemParser.analyseItems();
		
		RuleParser ruleParser = new RuleParser(rule_file);
		ruleParser.analyseRules();
		checkConflictDueToTooFewTriggers(ruleParser, itemParser);
		
	}

	public void parseRuleForConflictingStates(File rule_file) {
		String line = null;
		try {
			FileReader fileReader = new FileReader(rule_file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(".state")) {

				}
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("cannot open file " + rule_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("unable to read file " + rule_file);
			e.printStackTrace();
		}
	}

	public static void checkConflictDueToTooFewTriggers(RuleParser ruleParser, ItemParser itemParser) {
		int count=0;
		int buggy_count=0;
		for(RuleInformation rule_info: ruleParser.getRuleSet()) {
			
			ArrayList<String>missing_triggers=new ArrayList<String>();
			for(String member_state: ruleParser.getMemeberStates().get(rule_info.getName())) {				
				if(itemParser.getItemNames().contains(member_state)) {	
					if(rule_info.getTriggerItemNames().contains(member_state)){
						continue;
					}				
					else {	
						missing_triggers.add(member_state);						
					}				
				}
			}
			
			if(missing_triggers.size()>0) {
				count++;
				buggy_count ++;
				System.out.println("rule:" + rule_info.getName());
				for(String missing_trigger: missing_triggers){
					System.out.println("missing: "+ missing_trigger);
				}			
			}
			
			else {
				count++;
				System.out.println("rule:" + rule_info.getName());
				System.out.println("no missing trigger");
			}
			System.out.println("------------------------------");	
			
		}
		System.out.println("total rules: "+count);
		System.out.println("total buggy rules: "+ buggy_count);
	}
}
