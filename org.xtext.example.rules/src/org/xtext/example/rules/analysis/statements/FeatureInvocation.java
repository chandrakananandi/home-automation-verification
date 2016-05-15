package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;

public class FeatureInvocation {
	private String target;
	private String methodName;
	private ArrayList<String> arguments;

	public FeatureInvocation(){
		
	}
	public FeatureInvocation(String target, String methodName, ArrayList<String> arguments) {
		this.target = target;
		this.methodName = methodName;
		this.arguments = arguments;
	}

	public String getMethodName() {
		return methodName;
	}

	public String getTarget() {
		return target;
	}

	public ArrayList<String> getArguments() {
		return arguments;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public void setTarget(String target) {
		this.target= target;
	}

	public void setArgument(ArrayList<String> arguments) {
		this.arguments=arguments;
	}
}
