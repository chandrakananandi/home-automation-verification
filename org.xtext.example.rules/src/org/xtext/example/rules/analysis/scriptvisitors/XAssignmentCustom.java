package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XAssignmentImplCustom;

public class XAssignmentCustom extends org.eclipse.xtext.xbase.impl.XAssignmentImplCustom implements Expression {

	private XAssignmentImplCustom expression;

	public XAssignmentCustom(XAssignmentImplCustom object) {
		expression = object;
	}

	public XAssignmentImplCustom getExpession() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
