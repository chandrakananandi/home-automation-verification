package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XNumberLiteralImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XNumberLiteral extends org.eclipse.xtext.xbase.impl.XNumberLiteralImpl implements Expression {

	private XNumberLiteralImpl expression;

	public XNumberLiteral(XNumberLiteralImpl exp) {
		expression = exp;
	}

	public XNumberLiteralImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}


}
