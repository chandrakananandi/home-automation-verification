package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

/**
 * 
 * @author cnandi
 *
 */
public class XTryCatchFinallyExpression extends org.eclipse.xtext.xbase.impl.XTryCatchFinallyExpressionImpl
		implements Expression {

	private XExpression expression;

	public XTryCatchFinallyExpression(XExpression exp) {
		expression = exp;
	}

	public XExpression getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}


}
