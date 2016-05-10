package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

/**
 * 
 * @author cnandi
 *
 */
public class XBasicForLoopExpression extends org.eclipse.xtext.xbase.impl.XBasicForLoopExpressionImpl
		implements Expression {

private XExpression expression;
	
	public XBasicForLoopExpression(XExpression exp) {
		expression = exp;
	}
	
	public XExpression getExpression(){
		return expression;
	}
	
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);
	}
}
