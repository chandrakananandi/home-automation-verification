package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
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
import org.xtext.example.rules.rules.Rule;
/**
 * 
 * @author cnandi
 *
 */
public class RuleParser {
	protected String rule_file_name; 
	protected List<String> rule_names=new ArrayList<String>();
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
		
		while(eobjects.hasNext()){			
			EObject eobj=eobjects.next();
			if (eobj.getClass().getSimpleName().equals("RuleImpl")){
				Rule rule= (Rule) eobj;
				ScriptExpressionSwitch expressionSwitch=new ScriptExpressionSwitch();
				ConflictAvoidanceChecker.ast_writer.println("rule name: "+rule.getName());
				for(EObject obj: rule.getScript().eContents()){
					scriptAnalyser(obj,expressionSwitch);
				}	
				ConflictAvoidanceChecker.ast_writer.println("\n");				
			}				
		}		
		BufferedReader br=new BufferedReader(new FileReader("/home/cnandi/openHABworkspace/org.xtext.example.rules/ast-output.txt"));
		
		while(eobjects.hasNext()){
			EObject eobj=eobjects.next();
			if(eobj.getClass().getSimpleName().equals("RuleImpl")){
				Rule rule=(Rule) eobj;				
				ScriptContent scriptContent=analyseAST(br);
				RuleInformation rule_information=new RuleInformation(rule.getName(), rule.getEventtrigger(), scriptContent);
				rule_database.add(rule_information);
				
			}
		}
	}	
	
	public void scriptAnalyser(EObject scriptNode, ScriptExpressionSwitch expressionSwitch){			
		if (scriptNode instanceof XExpression){
			expressionSwitch.caseXExpression((XExpression) scriptNode);	
		}		
	}
	
	public ScriptContent analyseAST(BufferedReader astFileReader) throws IOException{
		System.out.println("bla");
		System.out.println(astFileReader.lines().count());
		return null;
	}
}

