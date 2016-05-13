package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;

public class IfThenElse {
	private Condition condition;
	private Then then_part;
	private Else else_part;

	public IfThenElse(Condition c, Then then_part, Else else_part) {
		this.condition = c;
		this.then_part = then_part;
		this.else_part = else_part;
	}

	public Condition getCondition() {
		return condition;
	}

	public Then getThen() {
		return then_part;
	}

	public Else getElse() {
		return else_part;
	}
}

class Then {
	private ArrayList<MethodInvocation> methodInvocations;
	private ArrayList<Assignment> assignments;
	private ArrayList<IfThenElse> conditionals;

	public Then(ArrayList<MethodInvocation> methodInvocations, ArrayList<Assignment> assignments,
			ArrayList<IfThenElse> conditionals) {
		this.methodInvocations = methodInvocations;
		this.assignments = assignments;
		this.conditionals = conditionals;
	}

	public ArrayList<MethodInvocation> getMethodInvocations() {
		return methodInvocations;
	}

	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	public ArrayList<IfThenElse> getIfThenElse() {
		return conditionals;
	}
}

class Else {
	ArrayList<MethodInvocation> methodInvocations;
	ArrayList<Assignment> assignments;
	ArrayList<IfThenElse> conditionals;
}
