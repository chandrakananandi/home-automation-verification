package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

/**
 * 
 * @author cnandi
 *
 */
public class XReturnExpression extends org.eclipse.xtext.xbase.impl.XReturnExpressionImpl implements Expression {

	private XExpression expression;

	public XReturnExpression(XExpression exp) {
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
