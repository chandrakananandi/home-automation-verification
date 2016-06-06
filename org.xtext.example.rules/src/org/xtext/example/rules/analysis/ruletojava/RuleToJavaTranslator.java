package org.xtext.example.rules.analysis.ruletojava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.XExpression;
import org.xtext.example.rules.RulesStandaloneSetupGenerated;
import org.xtext.example.rules.rules.impl.RuleImpl;
import org.xtext.example.script.script.impl.ScriptImpl;

public class RuleToJavaTranslator {
	
	public static void ruleToJavaTranslator (String rule_file_name) throws FileNotFoundException{
		RulesStandaloneSetupGenerated ruleSetup = new RulesStandaloneSetupGenerated();
		ruleSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.
				getResource(URI.createURI("src/org/xtext/example/rules/analysis/resources/" + rule_file_name), true);
		TreeIterator<EObject> eobjects = resource.getAllContents();	
		while(eobjects.hasNext()) {
			EObject eobj=eobjects.next();	
			if(eobj.getClass().getSimpleName().equals("RuleImpl")) {
				String java_file_name=createClassNameFromRuleName(((RuleImpl)eobj).getName());
				PrintWriter writer=new PrintWriter(new File("src/org/xtext/example/rules/analysis/codegen/"+ java_file_name+".java"));
				while(eobjects.hasNext()) {
					eobj=eobjects.next();				
					if(eobj.getClass().getSimpleName().equals("ScriptImpl")) {
						generateClassCode(writer, java_file_name, ((ScriptImpl)eobj).getExpressions());
						break;
					}						
				}
				writer.close();
			}
		}		
	}
	
	public static String createClassNameFromRuleName(String rule_name) {
		String class_name="";
		List<String> words=new ArrayList<String>();
		words.addAll(Arrays.asList(rule_name.split(" ")));
		for(String word: words) {
			class_name=class_name.concat(word.replace(word.charAt(0), Character.toUpperCase(word.charAt(0))));
		}
		return class_name;
	}
	
	public static void generateClassCode(PrintWriter writer, String java_file_name, List<XExpression>script) {
		writer.println("package org.xtext.example.rules.analysis.codegen;\n");
		writer.println("public class " + java_file_name + " {");
		
		writer.println("}");
	}
}
