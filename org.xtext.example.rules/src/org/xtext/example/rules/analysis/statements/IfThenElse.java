package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;

public class IfThenElse {
	private Operation condition;
	private Then then_part;
	private Else else_part;

	public IfThenElse(Operation c, Then then_part, Else else_part) {
		this.condition = c;
		this.then_part = then_part;
		this.else_part = else_part;
	}

	public Operation getCondition() {
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
	private ArrayList<FeatureInvocation> featureInvocations;
	private ArrayList<MemberFeatureInvocation> memberFeatureInvocations;
	private ArrayList<Assignment> assignments;
	private ArrayList<IfThenElse> conditionals;

	public Then(ArrayList<FeatureInvocation> featureInvocations, ArrayList<MemberFeatureInvocation> memberFeatureInvocations, ArrayList<Assignment> assignments,
			ArrayList<IfThenElse> conditionals) {
		this.featureInvocations = featureInvocations;
		this.memberFeatureInvocations=memberFeatureInvocations;
		this.assignments = assignments;
		this.conditionals = conditionals;
	}

	public ArrayList<FeatureInvocation> getFeatureInvocations() {
		return featureInvocations;
	}
	public ArrayList<MemberFeatureInvocation>getMemberFeatureInvocations(){
		return memberFeatureInvocations;
	}

	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	public ArrayList<IfThenElse> getIfThenElse() {
		return conditionals;
	}
}

class Else {
	private ArrayList<FeatureInvocation> featureInvocations;
	private ArrayList<MemberFeatureInvocation> memberFeatureInvocations;
	private ArrayList<Assignment> assignments;
	private ArrayList<IfThenElse> conditionals;

	public Else(ArrayList<FeatureInvocation> featureInvocations, ArrayList<MemberFeatureInvocation> memberFeatureInvocations, ArrayList<Assignment> assignments,
			ArrayList<IfThenElse> conditionals) {
		this.featureInvocations = featureInvocations;
		this.memberFeatureInvocations=memberFeatureInvocations;
		this.assignments = assignments;
		this.conditionals = conditionals;
	}

	public ArrayList<FeatureInvocation> getFeatureInvocations() {
		return featureInvocations;
	}
	public ArrayList<MemberFeatureInvocation>getMemberFeatureInvocations(){
		return memberFeatureInvocations;
	}

	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	public ArrayList<IfThenElse> getIfThenElse() {
		return conditionals;
	}
}
