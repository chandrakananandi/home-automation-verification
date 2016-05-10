package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XBlockExpressionImplCustom;
/**
 * 
 * @author cnandi
 *
 */
public class XBlockExpressionCustom extends org.eclipse.xtext.xbase.impl.XBlockExpressionImplCustom implements Expression {

private XBlockExpressionImplCustom expression;
	
	public XBlockExpressionCustom(XBlockExpressionImplCustom exp) {
		expression = exp;
	}
	
	public XBlockExpressionImplCustom getExpression(){
		return expression;
	}
	
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
