package org.xtext.example.rules.analysis.statements;

public class UnaryOperation implements Operation {
	private String operator;
	private String operand1;

	public UnaryOperation(String operator, String operand1) {
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