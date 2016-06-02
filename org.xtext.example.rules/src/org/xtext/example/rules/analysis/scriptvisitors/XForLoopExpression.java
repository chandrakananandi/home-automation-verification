package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XForLoopExpressionImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XForLoopExpression extends org.eclipse.xtext.xbase.impl.XForLoopExpressionImpl implements Expression {

	private XForLoopExpressionImpl expression;

	public XForLoopExpression(XForLoopExpressionImpl exp) {
		expression = exp;
	}

	public XForLoopExpressionImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
