package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XNullLiteralImplCustom;

public class XNullLiteralCustom extends org.eclipse.xtext.xbase.impl.XNullLiteralImplCustom implements Expression {

	private XNullLiteralImplCustom expression;

	public XNullLiteralCustom(XNullLiteralImplCustom exp) {
		expression = exp;
	}

	public XNullLiteralImplCustom getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
