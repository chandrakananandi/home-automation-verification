package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
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
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
