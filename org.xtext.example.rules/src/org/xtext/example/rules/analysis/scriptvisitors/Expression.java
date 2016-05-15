package org.xtext.example.rules.analysis.scriptvisitors;

public interface Expression {
	public <R> R accept(ExpressionVisitor<R> visitor);

}
