package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XConstructorCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XConstructorCall extends org.eclipse.xtext.xbase.impl.XConstructorCallImpl implements Expression {

private XConstructorCallImpl expression;
	
	public XConstructorCall(XConstructorCallImpl exp) {
		expression = exp;
	}
	
	public XConstructorCallImpl getExpression(){
		return expression;
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
