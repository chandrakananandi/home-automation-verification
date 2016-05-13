package org.xtext.example.rules.analysis.statements;

public class Assignment {
	private String lhs;
	private String rhs;

	public Assignment(String lhs, String rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public String getLhs() {
		return lhs;
	}

	public String getRhs() {
		return rhs;
	}
}