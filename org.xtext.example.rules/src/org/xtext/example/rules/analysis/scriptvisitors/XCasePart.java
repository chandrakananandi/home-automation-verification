package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

/**
 * 
 * @author cnandi
 *
 */
public class XCasePart extends org.eclipse.xtext.xbase.impl.XCasePartImpl implements Expression {

	private XExpression expression;

	public XCasePart(XExpression exp) {
		expression = exp;
	}

	public XExpression getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
