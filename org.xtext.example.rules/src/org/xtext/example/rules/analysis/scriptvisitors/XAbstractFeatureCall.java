package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XAbstractFeatureCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XAbstractFeatureCall extends org.eclipse.xtext.xbase.impl.XAbstractFeatureCallImpl implements Expression {

	private XAbstractFeatureCallImpl expression;

	public XAbstractFeatureCall(XAbstractFeatureCallImpl exp) {
		expression = exp;
	}

	public XAbstractFeatureCallImpl getExpression() {
		return expression;
	}

	@Override
	public <R> R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);
	}
}
