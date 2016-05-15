package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XIfExpressionImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XIfExpression extends org.eclipse.xtext.xbase.impl.XIfExpressionImpl implements Expression {

	private XIfExpressionImpl expression;

	public XIfExpression(XIfExpressionImpl exp) {
		expression = exp;
	}

	public XIfExpressionImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}


}
