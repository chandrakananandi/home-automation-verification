package org.xtext.example.rules.analysis;

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
	protected List<String> rule_names=new ArrayList<String>();
	protected List<RuleInformation> rule_database=new ArrayList<RuleInformation>();
	
	public void analyseRules(){
		RulesStandaloneSetupGenerated ruleSetup=new RulesStandaloneSetupGenerated();
		ruleSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet=new ResourceSetImpl();
		Resource resource=resourceSet.getResource(URI.createURI("src/org/xtext/example/rules/analysis/sample_rule.rules"), true);
		
		TreeIterator<EObject> eobjects=resource.getAllContents();
		while(eobjects.hasNext()){			
			EObject eobj=eobjects.next();
			if (eobj.getClass().getSimpleName().equals("RuleImpl")){
				Rule rule= (Rule) eobj;
				RuleInformation rule_information=new RuleInformation(rule.getName(), rule.getEventtrigger(), rule.getScript());
				rule_database.add(rule_information);
				ScriptExpressionSwitch expressionSwitch=new ScriptExpressionSwitch();
				System.out.println("size: "+rule.getScript().eContents().size());
				if(rule.getScript().eAllContents().hasNext()){
					scriptAnalyser(rule.getScript().eAllContents().next(),expressionSwitch);
				}
			}			
		}		
	}
	
	public void scriptAnalyser(EObject scriptNode, ScriptExpressionSwitch expressionSwitch){			
		if (scriptNode instanceof XExpression){
			//if(scriptNode.eAllContents().hasNext()){
				//System.out.println(scriptNode.eAllContents().next());
				//scriptAnalyser(scriptNode.eAllContents().next(), expressionSwitch);
			//}
			expressionSwitch.caseXExpression((XExpression) scriptNode);	
		}
	}
}

