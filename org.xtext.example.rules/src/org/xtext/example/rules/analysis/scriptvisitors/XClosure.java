package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XClosureImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XClosure extends org.eclipse.xtext.xbase.impl.XClosureImpl implements Expression {

	private XClosureImpl expression;

	public XClosure(XClosureImpl exp) {
		expression = exp;
	}

	public XClosureImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}

}
