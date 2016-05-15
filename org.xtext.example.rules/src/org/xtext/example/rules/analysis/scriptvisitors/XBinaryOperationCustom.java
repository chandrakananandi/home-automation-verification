package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XBinaryOperationImplCustom;

/**
 * 
 * @author cnandi
 *
 */
public class XBinaryOperationCustom extends org.eclipse.xtext.xbase.impl.XBinaryOperationImplCustom
		implements Expression {

	private XBinaryOperationImplCustom expression;

	public XBinaryOperationCustom(XBinaryOperationImplCustom exp) {
		expression = exp;
	}

	public XBinaryOperationImplCustom getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}
}
