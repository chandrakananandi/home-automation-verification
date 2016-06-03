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

import com.sun.javafx.css.Rule;

import org.xtext.example.rules.analysis.constants.Constants;

/**
 * 
 * @author cnandi
 *
 */

// NOTE: rules with loops are not handled right now
public class ConflictAvoidanceChecker {

	Map<String, ArrayList<String>> suggested_triggers=new HashMap<String,ArrayList<String>>();
	static Set<String>side_effect_free_actions_output_states=new HashSet<String>();
		
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
		File conflict_file = new File("./src/org/xtext/example/rules/analysis/resources/sample_conflict.conflicts");
		File config_file= new File("./src/org/xtext/example/rules/analysis/resources/sample_config1.homecfg");
		
		long time_start=System.currentTimeMillis();
		parseConfiguration(config_file);
		
		//SpecificationParser specParser = new SpecificationParser();
		//specParser.parseConflicts(conflict_file);
		
		ItemParser itemParser=new ItemParser(item_file);
		itemParser.analyseItems();
		
		RuleParser ruleParser = new RuleParser(rule_file);
		ruleParser.analyseRules();
		
		generateTriggers(ruleParser, itemParser);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		checkConflictDueToTooFewTriggers(ruleParser, itemParser);
		long time_end=System.currentTimeMillis();
		
		System.out.println("Time:" + (time_end-time_start));
		
	}

	public void parseRuleForConflictingStates(File rule_file) {
		String line = null;
		try {
			FileReader fileReader = new FileReader(rule_file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(".state")) {
					//TODO: nothing happens. This method is useless but keeping for now in case I need it in future.
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
					side_effect_free_actions_output_states.add(line);
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
	// Can suggest event-based triggers, not System or Time based ones.
	public static void generateTriggers(RuleParser ruleParser, ItemParser itemParser){
		int count=0;
		for(RuleInformation rule_info: ruleParser.getRuleSet()) {	
			Set<String>suggested_triggers=new HashSet<String>();
			String redundant_trigger_suggestion=null;
			String dependent_trigger_suggestion=null;
			for(String member_state: ruleParser.getMemberStates().get(rule_info.getName())) {	
				// handling groups of items
				if(itemParser.getGroupNames().contains(member_state)) {
					suggested_triggers.addAll(itemParser.getGroupItemMap().get(member_state));
				}
				if(itemParser.getItemNames().contains(member_state)) {						
					suggested_triggers.add(member_state);				
					//dependent_trigger_suggestion=eliminateIsolatedDependentTriggers(member_state, rule_info, ruleParser);
					redundant_trigger_suggestion=eliminateRedundantTriggers(member_state);
				}
				if(redundant_trigger_suggestion!=null){
					suggested_triggers.remove(redundant_trigger_suggestion);
				}
				if(dependent_trigger_suggestion !=null){
					suggested_triggers.remove(dependent_trigger_suggestion);
				}
			}
						
			if(suggested_triggers.size()>0) {			
				count ++;
				System.out.println("rule:" + rule_info.getName());
				System.out.println("number of suggested triggers:" + suggested_triggers.size());
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
		System.out.println("total rules with suggested triggers: "+ count);
	}
	
	public static void checkConflictDueToTooFewTriggers(RuleParser ruleParser, ItemParser itemParser) {
		int count=0;
		int buggy_count=0;
		for(RuleInformation rule_info: ruleParser.getRuleSet()) {	
			count++;
			Set<String>missing_triggers=new HashSet<String>();
			String redundant_trigger_suggestion=null;
			String dependent_trigger_suggestion=null;
			for(String member_state: ruleParser.getMemberStates().get(rule_info.getName())) {			
				// handling groups of items
				if(itemParser.getGroupNames().contains(member_state)) {
					missing_triggers.addAll(itemParser.getGroupItemMap().get(member_state));
				}
				
				if(itemParser.getItemNames().contains(member_state)) {				
					if(!rule_info.getTriggerItemNames().contains(member_state)){
						missing_triggers.add(member_state);	
					}					
					dependent_trigger_suggestion=eliminateDependentTriggers(member_state, rule_info, ruleParser);					
					redundant_trigger_suggestion=eliminateRedundantTriggers(member_state);
				}
		
				if(redundant_trigger_suggestion!=null){
					missing_triggers.remove(redundant_trigger_suggestion);
				}
				if(dependent_trigger_suggestion !=null){
					missing_triggers.remove(dependent_trigger_suggestion);
				}
			}	
			
			int event_based_trigger_counter=0;
			for(String trigger_type: rule_info.getTriggerTypes()) {
				if (trigger_type.equals(Constants.SYSTEM_SHUTDOWN)) {
					continue;
				} else if (trigger_type.equals(Constants.SYSTEM_STARTUP)) {
					continue;
				} else if (trigger_type.equals(Constants.TIMER_EVENT)) {
					continue;
				} else {
					event_based_trigger_counter++;
				}
			}
			
			if (event_based_trigger_counter ==0) {
				missing_triggers.clear();
			}
				
			if(missing_triggers.size()>0) {				
				buggy_count ++;
				System.out.println("rule:" + rule_info.getName());
				System.out.println("number of missing triggers:" + missing_triggers.size());
				for(String missing_trigger: missing_triggers){
					System.out.println("missing trigger: "+ missing_trigger);
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
		
	// if member state is an argument of an output action (those in the homecfg file) only, it is not needed to be a trigger. Also, if it is an output state listed in
	// homecfg and does not appear in more than one rule, then it does not need to be a trigger.
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
			if(side_effect_free_actions_output_states.contains(feature.getMethodName())) {
				
				if(feature.getArguments().contains(member_state)) {
					side_effect_free_occurences++;								
				} else {
					continue;
				}	
			}			
		}
		if(all_occurence == side_effect_free_occurences && all_occurence != 0) {
			eliminate_member = member_state;		
		}
		if(side_effect_free_actions_output_states.contains(member_state)){
			eliminate_member = member_state;
			return eliminate_member;
		}		
		return eliminate_member;
	}
	
	public static String eliminateDependentTriggers(String member_state, RuleInformation rule_info, RuleParser ruleParser) {
		
		String dependent_trigger=null;
		boolean dependent=isDependent(member_state, rule_info, ruleParser);
		// not dependent
		if(!dependent) {
			dependent_trigger=null;
		} if(dependent) {
			dependent_trigger=member_state;
		}
		return dependent_trigger;
	}
	
	public static boolean isDependent(String member_state, RuleInformation rule_info, RuleParser ruleParser) {
	   if(ruleParser.getMemberStatesInAssignmentLHSs().get(rule_info.getName()).contains(member_state) &&
			   !ruleParser.getMemberStates().get(rule_info.getName()).contains(member_state)) {			    	
		   return true;
		} else {
			return false;
		}
	}	
}
