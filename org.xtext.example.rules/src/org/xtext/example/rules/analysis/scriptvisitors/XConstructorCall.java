package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XConstructorCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XConstructorCall extends org.eclipse.xtext.xbase.impl.XConstructorCallImpl implements Expression {

	private XConstructorCallImpl expression;

	public XConstructorCall(XConstructorCallImpl exp) {
		expression = exp;
	}

	public XConstructorCallImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}
}
