package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom;

public class XMemberFeatureCallCustom extends org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom implements Expression {
	private XMemberFeatureCallImplCustom expression;
	
	public XMemberFeatureCallCustom(XMemberFeatureCallImplCustom exp) {
		expression =exp;
	}
	
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}
	public XMemberFeatureCallImplCustom getExpression() {
		return expression;
	}

}

