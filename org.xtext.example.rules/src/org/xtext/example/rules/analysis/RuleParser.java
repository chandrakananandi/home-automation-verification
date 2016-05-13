package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.XExpression;
import org.xtext.example.rules.RulesStandaloneSetupGenerated;
import org.xtext.example.rules.analysis.scriptvisitors.ScriptExpressionSwitch;
import org.xtext.example.rules.analysis.statements.BinaryCondition;
import org.xtext.example.rules.analysis.statements.Condition;
import org.xtext.example.rules.analysis.statements.IfThenElse;
import org.xtext.example.rules.analysis.statements.UnaryCondition;
import org.xtext.example.rules.rules.Rule;

/**
 * 
 * @author cnandi
 *
 */
public class RuleParser {
	protected String rule_file_name;
	protected List<RuleInformation> rule_database = new ArrayList<RuleInformation>();

	public RuleParser(String file_name) {
		rule_file_name = file_name;
	}

	public String getRuleFileName() {
		return rule_file_name;
	}

	public void analyseRules() throws IOException {

		RulesStandaloneSetupGenerated ruleSetup = new RulesStandaloneSetupGenerated();
		ruleSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet
				.getResource(URI.createURI("src/org/xtext/example/rules/analysis/" + getRuleFileName()), true);
		TreeIterator<EObject> eobjects = resource.getAllContents();
		ArrayList<Rule> rules = new ArrayList<Rule>();

		while (eobjects.hasNext()) {
			EObject eobj = eobjects.next();
			if (eobj.getClass().getSimpleName().equals("RuleImpl")) {
				Rule rule = (Rule) eobj;
				ScriptExpressionSwitch expressionSwitch = new ScriptExpressionSwitch();
				rules.add(rule);
				ConflictAvoidanceChecker.ast_writer.println("rule name: " + rule.getName());
				for (EObject obj : rule.getScript().eContents()) {
					generateSimplerAST(obj, expressionSwitch);
				}
				ConflictAvoidanceChecker.ast_writer.println("rule end");
			}
		}

		ConflictAvoidanceChecker.ast_writer.close();

		for (Rule rule : rules) {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/cnandi/openHABworkspace/org.xtext.example.rules/ast-output.txt"));
			ScriptContent scriptContent = analyseSimplerAST(rule.getName(), br);
			RuleInformation rule_information = new RuleInformation(rule.getName(), rule.getEventtrigger(),
					scriptContent);
			rule_database.add(rule_information);
			br.close();
		}

	}

	public void generateSimplerAST(EObject scriptNode, ScriptExpressionSwitch expressionSwitch) {
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
		ScriptContent scriptContent = extractScriptInformation(script);
		return scriptContent;
	}

	public ScriptContent extractScriptInformation(ArrayList<String> script) {
		ArrayList<String> then_part = new ArrayList<String>();
		ArrayList<String> else_part = new ArrayList<String>();
		ArrayList<String> binary_condition = new ArrayList<String>();
		ArrayList<String> unary_condition = new ArrayList<String>();
		ArrayList<String> feature_part = new ArrayList<String>();
		ArrayList<String> member_feature_part = new ArrayList<String>();

		if (script.size() > 0) {
			int i = 0;
			String if_tracker;
			String feature_tracker;
			String member_feature_tracker;
			while (i < script.size()) {
				if (script.get(i).contains("If then else:")) {

					if_tracker = script.get(i).split(":")[1].trim();
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
						BinaryCondition binaryCondition = manipulateBinaryCondition(binary_condition);
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
							}

							else if (script.get(k).contains("else part:" + if_tracker)) {
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
							UnaryCondition unaryCondition = manipulateUnaryCondition(unary_condition);
						}
					}
				}
				if (script.get(i).contains("Feature name:")) {
					feature_tracker = script.get(i).split(":")[1].trim();
					i++;
					int j=i;
					while(j<script.size()){
						if(!script.get(j).contains("Feature ends:"+feature_tracker)){
							feature_part.add(script.get(j));
							j++;
						} else {
							break;
						}
					}
					i=j;
				}
				
				if (script.get(i).contains("Member feature name:")) {
					member_feature_tracker = script.get(i).split(":")[1].trim();
					i++;
					int j=i;
					while(j<script.size()){
						if(!script.get(j).contains("Member feature ends:"+member_feature_tracker)){
							member_feature_part.add(script.get(j));
							j++;
						} else {
							break;
						}
					}
					i=j;
				}
				i++;
			}
		}
		System.out.println();

		return null;
	}

	public BinaryCondition manipulateBinaryCondition(ArrayList<String> binary_condition) {

		return null;
	}

	public UnaryCondition manipulateUnaryCondition(ArrayList<String> unary_condition) {
		// TODO: implement this later.
		return null;
	}

}
