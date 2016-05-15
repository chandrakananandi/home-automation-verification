package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XFeatureCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XFeatureCall extends org.eclipse.xtext.xbase.impl.XFeatureCallImpl implements Expression {

	private XFeatureCallImpl expression;

	public XFeatureCall(XFeatureCallImpl exp) {
		expression = exp;
	}

	public XFeatureCallImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
