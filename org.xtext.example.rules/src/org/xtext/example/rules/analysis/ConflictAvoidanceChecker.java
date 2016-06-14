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
import org.xtext.example.rules.analysis.ruletojava.RuleToJavaTranslator;

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
		File config_file= new File("./src/org/xtext/example/rules/analysis/resources/sample_config2.homecfg");
		
		long time_start=System.currentTimeMillis();
		parseConfiguration(config_file);
		
		RuleToJavaTranslator.ruleToJavaTranslator(rule_file);
		
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
		int conflict_count=0;
		for(RuleInformation rule_info: ruleParser.getRuleSet()) {	
			Set<String>suggested_triggers=new HashSet<String>();
			String redundant_trigger_suggestion=null;
			String dependent_trigger_suggestion=null;
			for(String member_state: ruleParser.getMemberStates().get(rule_info.getName())) {	
				// handling groups of items
				if(itemParser.getGroupNames().contains(member_state)) {
					suggested_triggers.addAll(itemParser.getGroupItemMap().get(member_state));
				}
				
				// check if the member state is indeed a device and not just a local variable
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
			
			for(String t: suggested_triggers) {
				rule_info.addGeneratedTrigger(t);
			}
			
			HashMap<String, HashSet<String>> conflicting_rules  = findConflictingRulesForATrigger(rule_info, ruleParser, suggested_triggers);
					
			if(suggested_triggers.size()>0) {			
				count ++;
				System.out.println("rule:" + rule_info.getName());
				System.out.println("number of suggested triggers:" + suggested_triggers.size());
				for(String suggested_trigger: suggested_triggers){
					System.out.println("suggested trigger: "+ suggested_trigger);
					if(conflicting_rules.containsKey(suggested_trigger)) {
						System.out.println(Constants.CONFLICT + suggested_trigger + " in rules: "+conflicting_rules.get(suggested_trigger));
					}
				}			
			}
			
			else {				
				System.out.println("rule:" + rule_info.getName());
				System.out.println("no suggested triggers");
			}
			System.out.println("------------------------------");	
			if(!conflicting_rules.isEmpty()) {
				conflict_count++;
			}
		}
		System.out.println("total rules with suggested triggers: "+ count);
		System.out.println("total number of rules with potential conflicts:" + conflict_count);
	}
	
	/**
	 * Go through all other rules apart from rule_info and check if a trigger in rule_info appears in the LHS of any assignment in any 
	 * of those. If this is the case, then that means that another rule is trying to set the value of this trigger item and the user should be
	 * made aware of this conflict in the rules.
	 * @param rule_info
	 * @param ruleParser
	 * @param triggers
	 * @return mapping of triggers with all the rules that have potential conflicts.
	 */
	public static HashMap<String, HashSet<String>> findConflictingRulesForATrigger(RuleInformation rule_info, 
			RuleParser ruleParser, Set<String> triggers) {		
		String conflicting_trigger=new String();
		HashMap<String, HashSet<String>> conflict_map=new HashMap<String, HashSet<String>>();
		for(String trigger: triggers) {
			HashSet<String> rules=new HashSet<String>();
			if ((ruleParser.getMemberStatesInAssignmentLHSs().get(rule_info.getName()).contains(trigger) ||
				ruleParser.getPostUpdateFirstArguments().get(rule_info.getName()).contains(trigger))) {			
				for(RuleInformation rule: ruleParser.getRuleSet()) {
					if(!rule.equals(rule_info) && rule.getTriggerTypes().contains("ChangedEventTriggerImpl")) {	
						if (ruleParser.getMemberStatesInAssignmentLHSs().get(rule.getName()).contains(trigger) ||
								ruleParser.getPostUpdateFirstArguments().get(rule.getName()).contains(trigger)) {							
							conflicting_trigger=trigger;
							rules.add(rule.getName());							
							conflict_map.put(conflicting_trigger, rules);
						}
					}
				}
			}
		}				 
		return conflict_map;	
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
				
				// check if the member state is indeed a device and not just a local variable
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
		String dependent_trigger = null;
		boolean dependent = isDependent(member_state, rule_info, ruleParser);
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
