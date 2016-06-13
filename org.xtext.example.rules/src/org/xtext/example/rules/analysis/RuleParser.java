package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.XExpression;
import org.xtext.example.rules.RulesStandaloneSetupGenerated;
import org.xtext.example.rules.analysis.scriptvisitors.ExpressionVisitorImpl;
import org.xtext.example.rules.analysis.scriptvisitors.ScriptExpressionSwitch;
import org.xtext.example.rules.analysis.statements.Assignment;
import org.xtext.example.rules.rules.Rule;

import com.google.common.hash.HashCode;

/**
 * 
 * @author cnandi
 *
 */
public class RuleParser {
	String rule_file_name;
	ArrayList<RuleInformation> rule_database = new ArrayList<RuleInformation>();
	ArrayList<Rule> rules = new ArrayList<Rule>();
	Hashtable<String,Set<String>> member_features_involved = new Hashtable<String,Set<String>>();
	Hashtable<String, ArrayList<String>> features_involved=new Hashtable<String,ArrayList<String>>();
	Hashtable<String, ArrayList<String>> postupdates_involved=new Hashtable<String,ArrayList<String>>();
	Hashtable<String, Set<String>> assignment_left_hand_sides=new Hashtable<String, Set<String>>();
	
	public RuleParser(String file_name) {
		rule_file_name = file_name;
	}

	public String getRuleFileName() {
		return rule_file_name;
	}	
	
	public ArrayList<Rule> getRules(){
		return rules;
	}
	
	public ArrayList<RuleInformation> getRuleSet(){
		return rule_database;
	}
	
	public Hashtable<String,Set<String>> getMemberStates(){
		return member_features_involved;
	}
	
	public Hashtable<String,ArrayList<String>> getFeatures() {
		return features_involved;
	}
	
	public Hashtable<String,ArrayList<String>> getPostUpdateFirstArguments() {
		return postupdates_involved;
	}
	
	public Hashtable<String, Set<String>> getMemberStatesInAssignmentLHSs() {
		return assignment_left_hand_sides;
	}
	
	public void analyseRules() throws IOException {
		RulesStandaloneSetupGenerated ruleSetup = new RulesStandaloneSetupGenerated();
		ruleSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI("src/org/xtext/example/rules/analysis/resources/" + getRuleFileName()), true);
		TreeIterator<EObject> eobjects = resource.getAllContents();	
			
		while (eobjects.hasNext()) {
			EObject eobj = eobjects.next();
			//System.err.println(eobj.getClass());
			if (eobj.getClass().getSimpleName().equals("RuleImpl")) {
				Rule rule = (Rule) eobj;
				int member_feature_start_index=0;
				int member_invocation_start_index=0;
				int feature_invocation_start_index=0;
				int postupdate_first_argument_start_index=0;
				int assignments_start_index=0;
			
				if(ExpressionVisitorImpl.member_states_involved.size()==0){
					member_feature_start_index = 0;
				}
				if(ExpressionVisitorImpl.feature_invocations.size()==0) {
					feature_invocation_start_index=0;
				}
				if(ExpressionVisitorImpl.member_feature_invocations.size()==0) {
					member_feature_start_index=0;
				}
				
				if(ExpressionVisitorImpl.first_arguments_of_postUpdate.size() == 0){
					postupdate_first_argument_start_index=0;
				}
				
				if(ExpressionVisitorImpl.assignments_and_variable_declarations.size()==0) {
					assignments_start_index = 0;
				}
				
				if(ExpressionVisitorImpl.member_states_involved.size()>0){
					member_feature_start_index=ExpressionVisitorImpl.member_states_involved.size();
				}
				
				if(ExpressionVisitorImpl.feature_invocations.size()>0){
					feature_invocation_start_index=ExpressionVisitorImpl.feature_invocations.size();
				}
				
				if(ExpressionVisitorImpl.member_feature_invocations.size()>0){
					member_invocation_start_index=ExpressionVisitorImpl.member_feature_invocations.size();
				}
				
				if(ExpressionVisitorImpl.first_arguments_of_postUpdate.size()>0){
					postupdate_first_argument_start_index=ExpressionVisitorImpl.first_arguments_of_postUpdate.size();
				}
				
				if(ExpressionVisitorImpl.assignments_and_variable_declarations.size()>0) {
					assignments_start_index=ExpressionVisitorImpl.assignments_and_variable_declarations.size();
				}
				
				ScriptExpressionSwitch<EObject> expressionSwitch = new ScriptExpressionSwitch<EObject>();
				
				rules.add(rule);
				ConflictAvoidanceChecker.ast_writer.println("rule name: " + rule.getName());
								
				for (EObject obj : rule.getScript().eContents()) {
					
					generateSimplerAST(obj, expressionSwitch);					
				}
				
				int member_feature_end_index=ExpressionVisitorImpl.member_states_involved.size();
				int feature_invocation_end_index=ExpressionVisitorImpl.feature_invocations.size();
				int member_invocation_end_index=ExpressionVisitorImpl.member_feature_invocations.size();
				int postupdate_first_argument_end_index=ExpressionVisitorImpl.first_arguments_of_postUpdate.size();
				int assignments_stop_index=ExpressionVisitorImpl.assignments_and_variable_declarations.size();
				
				Set<String>member_states=new HashSet<String>();
				for(int x=member_feature_start_index; x<member_feature_end_index;x++){
					member_states.add(ExpressionVisitorImpl.member_states_involved.get(x));
				}
								
				for(int x=feature_invocation_start_index; x<feature_invocation_end_index;x++){
					member_states.add(ExpressionVisitorImpl.feature_invocations.get(x).getMethodName());
					if(ExpressionVisitorImpl.feature_invocations.get(x).getTarget()!=null) {
						member_states.add(ExpressionVisitorImpl.feature_invocations.get(x).getTarget());
					}
					if(ExpressionVisitorImpl.feature_invocations.get(x).getArguments().size()!=0) {
						for(String argument: ExpressionVisitorImpl.feature_invocations.get(x).getArguments()) {
							member_states.add(argument);
						}
					}
				}
				
				for(int x=member_invocation_start_index; x<member_invocation_end_index;x++) {
					member_states.add(ExpressionVisitorImpl.member_feature_invocations.get(x).getMemberName());
					if(ExpressionVisitorImpl.member_feature_invocations.get(x).getFeatureName()!=null) {
						member_states.add(ExpressionVisitorImpl.member_feature_invocations.get(x).getFeatureName());
					}
					if(ExpressionVisitorImpl.member_feature_invocations.get(x).getArguments().size()!=0) {
						for(String argument: ExpressionVisitorImpl.member_feature_invocations.get(x).getArguments()) {
							member_states.add(argument);
						}
					}
				}
				
				ArrayList<String> post_update_first_argument=new ArrayList<String>();
				for(int x=postupdate_first_argument_start_index; x<postupdate_first_argument_end_index;x++) {
					post_update_first_argument.add(ExpressionVisitorImpl.first_arguments_of_postUpdate.get(x));
				}
				
				Set<String>discardable_member_states_in_assignments=new HashSet<String>();
				Set<String>keepable_member_states_in_assignments=new HashSet<String>();
				// remove member_states that appear in an LHS first and then in an RHS: this means they are written to before reading from.
				for(int y=assignments_start_index+1;y<assignments_stop_index;y++) {
					for(int x=assignments_start_index;x<y;x++) {
						for(String rhs: ExpressionVisitorImpl.assignments_and_variable_declarations.get(y).getRhs()) {							
							if(ExpressionVisitorImpl.assignments_and_variable_declarations.get(x).getLhs().equals(rhs)) {
								discardable_member_states_in_assignments.add(rhs);
							}
						}
					}
				}
				
				for(int y=assignments_start_index;y<assignments_stop_index;y++) {
					discardable_member_states_in_assignments.add(ExpressionVisitorImpl.assignments_and_variable_declarations.get(y).getLhs());
				}
				
				// Not adding any member state to this list which only appear on LHS. 
				for(int y=assignments_start_index;y<assignments_stop_index;y++) {
					for(String rhs:ExpressionVisitorImpl.assignments_and_variable_declarations.get(y).getRhs()) {
						if(!discardable_member_states_in_assignments.contains(rhs)) {
							keepable_member_states_in_assignments.add(rhs);
						}
					}
				}
				
				member_states.addAll(keepable_member_states_in_assignments);							
				member_features_involved.put(rule.getName(), member_states);		
				postupdates_involved.put(rule.getName(), post_update_first_argument);
				assignment_left_hand_sides.put(rule.getName(), discardable_member_states_in_assignments);
				ConflictAvoidanceChecker.ast_writer.println(rule.getName()+" :rule end");							
			}			
		}
		
		ConflictAvoidanceChecker.ast_writer.close();		
		for (Rule rule : rules) {
			BufferedReader br = new BufferedReader(new FileReader("/home/cnandi/openHABworkspace/org.xtext.example.rules/ast-output.txt"));
			List<String> scriptContent = analyseSimplerAST(rule.getName(), br);		
			RuleInformation rule_information = new RuleInformation(rule.getName(), rule.getEventtrigger(), scriptContent);
			rule_database.add(rule_information);
			br.close();			
		}
	}

	public void generateSimplerAST(EObject scriptNode, ScriptExpressionSwitch<EObject> expressionSwitch) {
		if (scriptNode instanceof XExpression) {
			expressionSwitch.caseXExpression((XExpression) scriptNode);
		}		
	}

	public List<String> analyseSimplerAST(String ruleName, BufferedReader astFileReader) throws IOException {
		String line =new String();
		ArrayList<String> script = new ArrayList<String>();
		while ((line = astFileReader.readLine()) != null) {
			if (line.contains("rule name: "+ruleName)) {
				line=astFileReader.readLine();
				while (!line.equals(ruleName +" :rule end")) {
					script.add(line);
					line= astFileReader.readLine();					
					if(line.equals(ruleName+" :rule end")) {
						return script;
					}
				}
			}
		}		
		return script;
	}
}
