package org.xtext.example.rules.analysis;

import java.util.List;

import org.xtext.example.rules.analysis.statements.Assignment;
import org.xtext.example.rules.analysis.statements.IfThenElse;
import org.xtext.example.rules.analysis.statements.MethodInvocation;


public class ScriptContent {
	private List<IfThenElse> conditional_statements;
	private List<Assignment> assignments;
	private List<MethodInvocation>method_invoations;

	public void addIfThenElse(IfThenElse conditional){
		conditional_statements.add(conditional);
	}
	
	public void addAssignment(Assignment assignment){
		assignments.add(assignment);
	}
	
	public void addMethodInvocation(MethodInvocation methodInvocation){
		method_invoations.add(methodInvocation);
	}
		
}
