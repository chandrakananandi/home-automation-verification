package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom;

public class XMemberFeatureCallCustom extends org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom implements Expression {
	private XMemberFeatureCallImplCustom expression;

	public XMemberFeatureCallCustom(XMemberFeatureCallImplCustom exp) {
		expression = exp;
	}

	
	public XMemberFeatureCallImplCustom getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

	
}
