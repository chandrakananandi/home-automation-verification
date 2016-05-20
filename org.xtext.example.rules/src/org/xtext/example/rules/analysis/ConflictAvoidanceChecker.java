package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.xtext.example.rules.analysis.scriptvisitors.ExpressionVisitorImpl;
import org.xtext.example.rules.analysis.statements.FeatureInvocation;

/**
 * 
 * @author cnandi
 *
 */
public class ConflictAvoidanceChecker {

	Map<String, ArrayList<String>> suggested_triggers=new HashMap<String,ArrayList<String>>();
	static Set<String>side_effect_free_actions=new HashSet<>();
	
	public static PrintWriter ast_writer;
	static {
		try {
			ast_writer = new PrintWriter("ast-output.txt");
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		String rule_file = "sample_rule.rules";
		String item_file= "sample_item1.items";
		File conflict_file = new File("./src/org/xtext/example/rules/analysis/resources/sample_conflict.conflicts");
		File config_file= new File("./src/org/xtext/example/rules/analysis/resources/sample_config1.homecfg");
		
		parseConfiguration(config_file);
		
		SpecificationParser specParser = new SpecificationParser();
		specParser.parseConflicts(conflict_file);
		
		ItemParser itemParser=new ItemParser(item_file);
		itemParser.analyseItems();
		
		RuleParser ruleParser = new RuleParser(rule_file);
		ruleParser.analyseRules();
		
		generateTriggers(ruleParser, itemParser);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
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
			System.err.println("cannot find file " + rule_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("unable to read file " + rule_file);
			e.printStackTrace();
		}
	}

	public static void parseConfiguration(File config_file){
		String line=null; 
		try {
			FileReader fileReader = new FileReader(config_file);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			while((line=bufferedReader.readLine())!=null){
				if(line.startsWith("#")) {
					continue;
				}
				else if(!line.isEmpty()){					
					side_effect_free_actions.add(line);
				}
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("cannot find file " + config_file);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("unable to read file" + config_file);
			e.printStackTrace();
		}
	}
	
	public static void generateTriggers(RuleParser ruleParser, ItemParser itemParser){
		for(RuleInformation rule_info: ruleParser.getRuleSet()) {	
			Set<String>suggested_triggers=new HashSet<String>();
			String redundant_trigger_suggestion=null;
			for(String member_state: ruleParser.getMemeberStates().get(rule_info.getName())) {				
				if(itemParser.getItemNames().contains(member_state)) {	
					suggested_triggers.add(member_state);											
					redundant_trigger_suggestion=eliminateRedundantTriggers(member_state);
				}
				if(redundant_trigger_suggestion!=null){
					suggested_triggers.remove(redundant_trigger_suggestion);
				}
			}	
			
			if(suggested_triggers.size()>0) {				
				System.out.println("rule:" + rule_info.getName());
				for(String suggested_trigger: suggested_triggers){
					System.out.println("suggested trigger: "+ suggested_trigger);
				}			
			}
			
			else {
				
				System.out.println("rule:" + rule_info.getName());
				System.out.println("no suggested triggers");
			}
			System.out.println("------------------------------");		
		}
	}
	
	public static void checkConflictDueToTooFewTriggers(RuleParser ruleParser, ItemParser itemParser) {
		int count=0;
		int buggy_count=0;
		for(RuleInformation rule_info: ruleParser.getRuleSet()) {	
			count++;
			Set<String>missing_triggers=new HashSet<String>();
			String redundant_trigger_suggestion=null;
			for(String member_state: ruleParser.getMemeberStates().get(rule_info.getName())) {				
				if(itemParser.getItemNames().contains(member_state)) {	
					if(rule_info.getTriggerItemNames().contains(member_state)){
						continue;
					}				
					else {	
						missing_triggers.add(member_state);						
					}		
					redundant_trigger_suggestion=eliminateRedundantTriggers(member_state);
				}
				if(redundant_trigger_suggestion!=null){
					missing_triggers.remove(redundant_trigger_suggestion);
				}
			}	
			
			if(missing_triggers.size()>0) {				
				buggy_count ++;
				System.out.println("rule:" + rule_info.getName());
				for(String missing_trigger: missing_triggers){
					System.out.println("missing: "+ missing_trigger);
				}			
			}
			
			else {
				
				System.out.println("rule:" + rule_info.getName());
				System.out.println("no missing trigger");
			}
			System.out.println("------------------------------");			
		}
		
		System.out.println("total rules: "+count);
		System.out.println("total potential buggy rules: "+ buggy_count);
	}
	
	
	// if member state is an argument of an output action (those in the homecfg file), it is not needed to be a trigger.
	public static String eliminateRedundantTriggers(String member_state) {
		String eliminate_member=null;
		int side_effect_free_occurences=0;
		int all_occurence=0;
		for(FeatureInvocation feature: ExpressionVisitorImpl.feature_invocations) {
			if (feature.getArguments().contains(member_state)) {
				all_occurence++;
			}
		}
		for(FeatureInvocation feature: ExpressionVisitorImpl.feature_invocations) {
			if(side_effect_free_actions.contains(feature.getMethodName())) {
				if(feature.getArguments().contains(member_state)) {
					side_effect_free_occurences++;								
				}
				else {
					continue;
				}	
			}			
		}
		if(all_occurence <=side_effect_free_occurences) {
			eliminate_member = member_state;		
		}
		return eliminate_member;
	}
}
