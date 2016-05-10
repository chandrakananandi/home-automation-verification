package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

/**
 * 
 * @author cnandi
 *
 */
public class ScriptXExpression extends org.eclipse.xtext.xbase.impl.XExpressionImpl implements Expression {

private XExpressionImpl expression;
	
	public ScriptXExpression(XExpressionImpl exp) {
		expression = exp;
	}
	
	public XExpressionImpl getExpression(){
		return expression;
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}
}
