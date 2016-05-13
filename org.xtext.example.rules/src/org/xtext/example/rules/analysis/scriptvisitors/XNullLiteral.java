package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

/**
 * 
 * @author cnandi
 *
 */
public class XNullLiteral extends org.eclipse.xtext.xbase.impl.XNullLiteralImpl implements Expression {

	private XExpression expression;

	public XNullLiteral(XExpression exp) {
		expression = exp;
	}

	public XExpression getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
