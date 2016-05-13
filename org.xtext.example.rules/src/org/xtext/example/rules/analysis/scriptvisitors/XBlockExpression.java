package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XBlockExpressionImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XBlockExpression extends org.eclipse.xtext.xbase.impl.XBlockExpressionImpl implements Expression {

	private XBlockExpressionImpl expression;

	public XBlockExpression(XBlockExpressionImpl exp) {
		expression = exp;
	}

	public XBlockExpressionImpl getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
