package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XFeatureCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XFeatureCall extends org.eclipse.xtext.xbase.impl.XFeatureCallImpl implements Expression {

private XFeatureCallImpl expression;
	
	public XFeatureCall(XFeatureCallImpl exp) {
		expression = exp;
	}
	
	public XFeatureCallImpl getExpression(){
		return expression;
	}
	
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
