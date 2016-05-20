package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
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
import org.xtext.example.rules.analysis.statements.BinaryCondition;
import org.xtext.example.rules.analysis.statements.FeatureInvocation;
import org.xtext.example.rules.analysis.statements.IfThenElse;
import org.xtext.example.rules.analysis.statements.MemberFeatureInvocation;
import org.xtext.example.rules.analysis.statements.UnaryCondition;
import org.xtext.example.rules.rules.Rule;

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
	
	public void analyseRules() throws IOException {
		RulesStandaloneSetupGenerated ruleSetup = new RulesStandaloneSetupGenerated();
		ruleSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI("src/org/xtext/example/rules/analysis/resources/" + getRuleFileName()), true);
		TreeIterator<EObject> eobjects = resource.getAllContents();	
			
		
		while (eobjects.hasNext()) {
			EObject eobj = eobjects.next();
			if (eobj.getClass().getSimpleName().equals("RuleImpl")) {
				Rule rule = (Rule) eobj;
				int member_feature_start_index=0;
				int member_invocation_start_index=0;
				int feature_invocation_start_index=0;;
				if(ExpressionVisitorImpl.member_states_involved.size()==0){
					member_feature_start_index = 0;
				}
				if(ExpressionVisitorImpl.feature_invocations.size()==0) {
					feature_invocation_start_index=0;
				}
				if(ExpressionVisitorImpl.member_feature_invocations.size()==0) {
					member_feature_start_index=0;
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
				
				ScriptExpressionSwitch<EObject> expressionSwitch = new ScriptExpressionSwitch<EObject>();
				
				rules.add(rule);
				ConflictAvoidanceChecker.ast_writer.println("rule name: " + rule.getName());
								
				for (EObject obj : rule.getScript().eContents()) {
					generateSimplerAST(obj, expressionSwitch);					
				}
				
				int member_feature_end_index=ExpressionVisitorImpl.member_states_involved.size();
				int feature_invocation_end_index=ExpressionVisitorImpl.feature_invocations.size();
				int member_invocation_end_index=ExpressionVisitorImpl.member_feature_invocations.size();
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
				
				for(int x=member_invocation_start_index; x<member_invocation_end_index;x++){
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
				
				member_features_involved.put(rule.getName(), member_states);							
				ConflictAvoidanceChecker.ast_writer.println("rule end");			
			}
		}
		
		ConflictAvoidanceChecker.ast_writer.close();		
		
		for (Rule rule : rules) {
			BufferedReader br = new BufferedReader(new FileReader("/home/cnandi/openHABworkspace/org.xtext.example.rules/ast-output.txt"));
			ScriptContent scriptContent = analyseSimplerAST(rule.getName(), br);
			RuleInformation rule_information = new RuleInformation(rule.getName(), rule.getEventtrigger(), scriptContent);
			rule_database.add(rule_information);
			br.close();			
		}		
		
		//for(String s: ExpressionVisitorImpl.member_states_involved) {
			//System.out.println(s);
		//}
		
		/*for(MemberFeatureInvocation m: ExpressionVisitorImpl.member_feature_invocations) {
			System.out.println("member name: " + m.getMemberName());
			System.out.println("member feature name: "+m.getFeatureName());
			if(m.getArguments().size()>0) {
				for(String s: m.getArguments()){
					System.out.println("member argument: " +s);
				}
			}
		}
		for(FeatureInvocation m: ExpressionVisitorImpl.feature_invocations) {
			System.out.println("feature name: " + m.getMethodName());
			System.out.println("feature taregt name: "+m.getTarget());
			if(m.getArguments().size()>0) {
				for(String s: m.getArguments()){
					System.out.println("feature argument: " +s);
				}
			}
		}		*/
		
	}

	public void generateSimplerAST(EObject scriptNode, ScriptExpressionSwitch<EObject> expressionSwitch) {
		if (scriptNode instanceof XExpression) {
			expressionSwitch.caseXExpression((XExpression) scriptNode);
		}		
	}

	public ScriptContent analyseSimplerAST(String ruleName, BufferedReader astFileReader) throws IOException {
		String line;
		ArrayList<String> script = new ArrayList<String>();
		while ((line = astFileReader.readLine()) != null) {
			if (line.contains(ruleName)) {
				while (!(line = astFileReader.readLine()).equals("rule end")) {
					script.add(line);
				}
			}
		}
		//ScriptContent scriptContent = extractScriptInformation(script);
		//return scriptContent;
		return null;
	}

	public ScriptContent extractScriptInformation(ArrayList<String> script) {
		ArrayList<String> then_part = new ArrayList<String>();
		ArrayList<String> else_part = new ArrayList<String>();
		ArrayList<String> binary_condition = new ArrayList<String>();
		ArrayList<String> unary_condition = new ArrayList<String>();
		ArrayList<String> feature_part = new ArrayList<String>();
		ArrayList<String> member_feature_part = new ArrayList<String>();

		if(script.size()>1){
			int i = 0;
			String if_tracker;
			String feature_tracker;
			String member_feature_tracker;
			while (i < script.size()) {
				if (script.get(i).contains("If then else:")) {

					if_tracker = script.get(i).split(":")[1].trim();
					//System.out.println("IF TRACkER: "+if_tracker);
					i = i + 2;
					if (script.get(i).equals("Binary operation:")) {
						i++;

						int j = i;
						while (j < script.size()) {
							if (!script.get(j).contains("then part:" + if_tracker)) {
								binary_condition.add(script.get(j));
								j++;
							} else if (script.get(j).contains("then part:" + if_tracker)) {
								int m = j + 1;
								while (!script.get(m).contains("then part ends here:" + if_tracker)) {
									if (!script.get(m).contains("then part ends here:" + if_tracker)) {
										then_part.add(script.get(m));
										m++;
									} else {
										break;
									}
								}
								j = m;
								i = m;
							} else if (script.get(j).contains("else part:" + if_tracker)) {
								int m = j + 1;
								while (!script.get(m).contains("else part ends here:" + if_tracker)) {
									if (!script.get(m).contains("else part ends here:" + if_tracker)) {
										else_part.add(script.get(m));
										m++;
									}
								}
								j = m;
								i = m;
							}
						}
						//BinaryCondition binaryCondition = manipulateBinaryCondition(binary_condition);
					} else if (script.get(i).equals("Unary operation:")) {
						i++;
						int k = i;
						while (k < script.size()) {
							if (!script.get(k).equals("then part:" + if_tracker)) {
								unary_condition.add(script.get(k));
								k++;
							} else if (script.get(k).equals("then part:" + if_tracker)) {
								int m = k + 1;
								while (!script.get(m).contains("then part ends here:" + if_tracker)) {
									if (!script.get(m).contains("then part ends here:" + if_tracker)) {
										then_part.add(script.get(m));
										m++;
									}
								}
								k = m;
								i = m;
							} else if (script.get(k).contains("else part:" + if_tracker)) {
								int m = k + 1;
								while (!script.get(m).contains("else part ends here:" + if_tracker)) {
									if (!script.get(m).contains("else part ends here:" + if_tracker)) {
										else_part.add(script.get(m));
										m++;
									}
								}
								k = m;
								i = m;
							}
							//UnaryCondition unaryCondition = manipulateUnaryCondition(unary_condition);
						}
					}
				}
				if (script.get(i).contains("Feature name:")) {
					feature_tracker = script.get(i).split(":")[1].trim();
					i++;
					int j = i;
					while (j < script.size()) {
						if (!script.get(j).contains("Feature ends:" + feature_tracker)) {
							feature_part.add(script.get(j));
							j++;
						} else {
							break;
						}
					}
					i = j;
				}

				if (script.get(i).contains("Member feature name:")) {
					member_feature_tracker = script.get(i).split(":")[1].trim();
					i++;
					int j = i;
					while (j < script.size()) {
						if (!script.get(j).contains("Member feature ends:" + member_feature_tracker)) {
							member_feature_part.add(script.get(j));
							j++;
						} else {
							break;
						}
					}
					i = j;
				}
				i++;
			}
		}
		
		if(script.size()<1){
			return null;
		}
		extractScriptInformation(binary_condition);
		extractScriptInformation(unary_condition);
		extractScriptInformation(then_part);
		extractScriptInformation(else_part);
		extractScriptInformation(member_feature_part);
		extractScriptInformation(feature_part);
		return null;
	}

	public BinaryCondition manipulateBinaryCondition(ArrayList<String> binary_condition) {
		return null;
	}

	public IfThenElse manipulateConditional(ArrayList<String> conditional) {
		return null;
	}

	public FeatureInvocation manipulateFeatureCall(ArrayList<String> feature_call) {
		return null;
	}

	public MemberFeatureInvocation manipulateMemberFeatureCall(ArrayList<String> member_feature_call) {
		return null;
	}

	public UnaryCondition manipulateUnaryCondition(ArrayList<String> unary_condition) {
		// TODO: implement this later.
		return null;
	}

}
