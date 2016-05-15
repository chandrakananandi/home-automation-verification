package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XBinaryOperationImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XBinaryOperation extends org.eclipse.xtext.xbase.impl.XBinaryOperationImpl implements Expression {

	private XBinaryOperationImpl expression;

	public XBinaryOperation(XBinaryOperationImpl exp) {
		expression = exp;
	}

	public XBinaryOperationImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}
}
