package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XUnaryOperationImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XUnaryOperation extends org.eclipse.xtext.xbase.impl.XUnaryOperationImpl implements Expression {

	private XUnaryOperationImpl expression;

	public XUnaryOperation(XUnaryOperationImpl exp) {
		expression = exp;
	}

	public XUnaryOperationImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
