package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XConstructorCallImpl;
import org.eclipse.xtext.xbase.impl.XConstructorCallImplCustom;

/**
 * 
 * @author cnandi
 *
 */
public class XConstructorCallCustom extends org.eclipse.xtext.xbase.impl.XConstructorCallImplCustom
		implements Expression {

	private XConstructorCallImplCustom expression;

	public XConstructorCallCustom(XConstructorCallImplCustom exp) {
		expression = exp;
	}

	public XConstructorCallImplCustom getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}