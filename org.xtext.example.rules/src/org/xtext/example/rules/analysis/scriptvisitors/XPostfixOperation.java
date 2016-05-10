package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

/**
 * 
 * @author cnandi
 *
 */
public class XPostfixOperation extends org.eclipse.xtext.xbase.impl.XPostfixOperationImpl implements Expression {

private XExpression expression;
	
	public XPostfixOperation(XExpression exp) {
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
