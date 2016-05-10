package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom;

/**
 * 
 * @author cnandi
 *
 */
public class XFeatureCallCustom extends org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom implements Expression {

	private XFeatureCallImplCustom expression;
	
	public XFeatureCallCustom(XFeatureCallImplCustom exp) {
		expression=exp;		
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}
	
	public XFeatureCallImplCustom getExpression(){
		return expression;
	}

}