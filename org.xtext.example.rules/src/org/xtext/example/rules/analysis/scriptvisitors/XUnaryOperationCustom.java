package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XUnaryOperationImpl;
import org.eclipse.xtext.xbase.impl.XUnaryOperationImplCustom;

/**
 * 
 * @author cnandi
 *
 */
public class XUnaryOperationCustom extends org.eclipse.xtext.xbase.impl.XUnaryOperationImplCustom
		implements Expression {

	private XUnaryOperationImplCustom expression;

	public XUnaryOperationCustom(XUnaryOperationImplCustom exp) {
		expression = exp;
	}

	public XUnaryOperationImplCustom getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
