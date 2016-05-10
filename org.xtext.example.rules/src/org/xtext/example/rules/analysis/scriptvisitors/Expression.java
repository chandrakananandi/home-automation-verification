package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;

public interface Expression {
	public void accept(ExpressionVisitor visitor);

}
