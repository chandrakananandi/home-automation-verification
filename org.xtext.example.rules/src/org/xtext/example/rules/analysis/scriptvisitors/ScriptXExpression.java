package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * 
 * @author cnandi
 *
 */
public class ScriptXExpression extends XExpressionImpl implements Expression {

	private XExpression expression;

	public ScriptXExpression(XExpression exp) {
		expression = exp;
	}

	public XExpression getExpression() {
		return expression;
	}

	@Override
	public <R> R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);
		 
	}

}
