package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom;

/**
 * 
 * @author cnandi
 *
 */
public class XFeatureCallCustom extends org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom implements Expression {

	private XFeatureCallImplCustom expression;

	public XFeatureCallCustom(XFeatureCallImplCustom exp) {
		expression = exp;
	}

	public XFeatureCallImplCustom getExpression() {
		return expression;
	}
	
	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}


}