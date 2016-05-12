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
	protected List<RuleInformation> rule_database=new ArrayList<RuleInformation>();
	
	public RuleParser(String file_name){
		rule_file_name=file_name;
	}
	
	public String getRuleFileName(){
		return rule_file_name;
	}
	public void analyseRules() throws IOException{
			
		RulesStandaloneSetupGenerated ruleSetup=new RulesStandaloneSetupGenerated();
		ruleSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet=new ResourceSetImpl();
		Resource resource=resourceSet.getResource(URI.createURI("src/org/xtext/example/rules/analysis/"+getRuleFileName()), true);
		TreeIterator<EObject> eobjects=resource.getAllContents();
		ArrayList<Rule>rules=new ArrayList<Rule>();		
		
		while(eobjects.hasNext()){			
			EObject eobj=eobjects.next();
			if (eobj.getClass().getSimpleName().equals("RuleImpl")){
				Rule rule= (Rule) eobj;
				ScriptExpressionSwitch expressionSwitch=new ScriptExpressionSwitch();
				rules.add(rule);
				ConflictAvoidanceChecker.ast_writer.println("rule name: "+rule.getName());
				for(EObject obj: rule.getScript().eContents()){
					generateSimplerAST(obj,expressionSwitch);
				}	
				ConflictAvoidanceChecker.ast_writer.println("rule end");				
			}				
		}		
		
		ConflictAvoidanceChecker.ast_writer.close();

		for(Rule rule: rules){
			BufferedReader br=new BufferedReader(new FileReader("/home/cnandi/openHABworkspace/org.xtext.example.rules/ast-output.txt"));
			ScriptContent scriptContent=analyseSimplerAST(rule.getName(), br);
			RuleInformation rule_information=new RuleInformation(rule.getName(), rule.getEventtrigger(), scriptContent);
			rule_database.add(rule_information);
			br.close();
		}
		
	}
	
	public void generateSimplerAST(EObject scriptNode, ScriptExpressionSwitch expressionSwitch){			
		if (scriptNode instanceof XExpression){
			expressionSwitch.caseXExpression((XExpression) scriptNode);	
		}		
	}
	
	public ScriptContent analyseSimplerAST(String ruleName, BufferedReader astFileReader) throws IOException{
		String line;
		ArrayList<String> script=new ArrayList<String>();
		while((line = astFileReader.readLine())!=null){
			if(line.contains(ruleName)){	
				while(!(line = astFileReader.readLine()).equals("rule end")){
					script.add(line);	
				}
			}
			else {
				continue;
			}
		}
		ScriptContent scriptContent=extractScriptInformation(script);		
		return scriptContent;
	}
	
	public ScriptContent extractScriptInformation(ArrayList<String> script){
		int i=0;
		while(i<script.size()){
			if(script.get(i).equals("If then else:")){
				i = i+2;
				if(script.get(i).equals("Binary operation:")) {
					i++;
					ArrayList<String> binary_condition=new ArrayList<String>();
					
					int j=i;
					while(j<script.size()){
						if(!script.get(j).equals("then part:")){
							System.out.println(script.get(j));
							binary_condition.add(script.get(j));
							j++;
						}
					}
					BinaryCondition binaryCondition=manipulateBinaryCondition(binary_condition);						
				}	
				else if(script.get(i).equals("Unary operation:")) {
					i++;
					ArrayList<String> unary_condition=new ArrayList<String>();
					int k=i;
					while(k<script.size()){
						if(!script.get(i).equals("then part:")){
							unary_condition.add(script.get(i));						
						}
						k++;
					}
					UnaryCondition unaryCondition=manipulateUnaryCondition(unary_condition);
				}
				i++;
			}
		}

		return null;
	}
	
	public BinaryCondition manipulateBinaryCondition(ArrayList<String>binary_condition){
		
		return null;
	}
	
	public UnaryCondition manipulateUnaryCondition(ArrayList<String>unary_condition){
		return null;
	}
}

