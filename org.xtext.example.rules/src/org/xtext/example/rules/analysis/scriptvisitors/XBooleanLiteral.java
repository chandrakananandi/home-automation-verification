package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XBooleanLiteralImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XBooleanLiteral extends org.eclipse.xtext.xbase.impl.XBooleanLiteralImpl implements Expression {

	private XBooleanLiteralImpl expression;

	public XBooleanLiteral(XBooleanLiteralImpl exp) {
		expression = exp;
	}

	public XBooleanLiteralImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
