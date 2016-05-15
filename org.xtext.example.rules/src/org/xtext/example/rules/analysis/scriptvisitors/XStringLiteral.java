package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XStringLiteralImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XStringLiteral extends org.eclipse.xtext.xbase.impl.XStringLiteralImpl implements Expression {

	private XStringLiteralImpl expression;

	public XStringLiteral(XStringLiteralImpl exp) {
		expression = exp;
	}

	public XStringLiteralImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}


}
