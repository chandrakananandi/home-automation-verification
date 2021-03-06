package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.impl.XAssignmentImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XAssignment extends org.eclipse.xtext.xbase.impl.XAssignmentImpl implements Expression {

	private XAssignmentImpl expression;

	public XAssignment(XAssignmentImpl exp) {
		expression = exp;
	}

	public XAssignmentImpl getExpression() {
		return expression;
	}

	@Override
	public <R>R accept(ExpressionVisitor<R> expressionVisitor) {
		return expressionVisitor.visit(this);

	}
}
