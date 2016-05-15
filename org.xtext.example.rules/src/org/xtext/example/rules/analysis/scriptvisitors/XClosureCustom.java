package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XClosureImplCustom;

public class XClosureCustom extends org.eclipse.xtext.xbase.impl.XClosureImplCustom implements Expression {

	private XClosureImplCustom expression;

	public XClosureCustom(XClosureImplCustom exp) {
		expression = exp;
	}

	public XClosureImplCustom getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
