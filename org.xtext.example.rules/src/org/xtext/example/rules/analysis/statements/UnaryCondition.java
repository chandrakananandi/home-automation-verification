package org.xtext.example.rules.analysis.statements;

public class UnaryCondition implements Condition {
	private String operator;
	private String operand1;

	public UnaryCondition(String operator, String operand1) {
		this.operator = operator;
		this.operand1 = operand1;
	}

	public String getOperator() {
		return operator;
	}

	public String getOperand() {
		return operand1;
	}
}