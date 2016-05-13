package org.xtext.example.rules.analysis;

import java.util.List;

import org.xtext.example.rules.analysis.statements.Assignment;
import org.xtext.example.rules.analysis.statements.IfThenElse;
import org.xtext.example.rules.analysis.statements.MemberFeatureInvocation;
import org.xtext.example.rules.analysis.statements.FeatureInvocation;

public class ScriptContent {
	private List<IfThenElse> conditional_statements;
	private List<Assignment> assignments;
	private List<FeatureInvocation> feature_invocations;
	private List<MemberFeatureInvocation> member_feature_invocations;

	public void addIfThenElse(IfThenElse conditional) {
		conditional_statements.add(conditional);
	}

	public void addAssignment(Assignment assignment) {
		assignments.add(assignment);
	}

	public void addFeatureInvocation(FeatureInvocation featureInvocation) {
		feature_invocations.add(featureInvocation);
	}
	
	public void addMemberfeatureInvocation(MemberFeatureInvocation memberFeatureInvocation) {
		member_feature_invocations.add(memberFeatureInvocation);
	}


}
