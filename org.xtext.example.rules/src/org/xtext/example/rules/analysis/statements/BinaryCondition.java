package org.xtext.example.rules.analysis.statements;

public class BinaryCondition implements Condition{
	private String operator;
	private String operand1;
	private String operand2;
	
	public BinaryCondition(String operator, String operand1, String operand2) {
		this.operator=operator;
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	public String getOperator(){
		return operator;
	}
	
	public String getOperand1(){
		return operand1;
	}
	
	public String getOperand2(){
		return operand2;
	}
}
