package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XInstanceOfExpressionImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XInstanceOfExpression extends org.eclipse.xtext.xbase.impl.XInstanceOfExpressionImpl
		implements Expression {

	private XInstanceOfExpressionImpl expression;

	public XInstanceOfExpression(XInstanceOfExpressionImpl exp) {
		expression = exp;
	}

	public XInstanceOfExpressionImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
