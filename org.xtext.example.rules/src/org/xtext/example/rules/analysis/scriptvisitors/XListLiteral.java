package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XListLiteralImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XListLiteral extends org.eclipse.xtext.xbase.impl.XListLiteralImpl implements Expression {

	private XListLiteralImpl expression;

	public XListLiteral(XListLiteralImpl exp) {
		expression = exp;
	}

	public XListLiteralImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
