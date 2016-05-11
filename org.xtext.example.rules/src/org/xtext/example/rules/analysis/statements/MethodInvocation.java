package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;

public class MethodInvocation {
	private String target;
	private String methodName;
	private ArrayList<String>arguments;
	
	public MethodInvocation(String target, String methodName, ArrayList<String>arguments) {
		this.target=target;
		this.methodName=methodName;
		this.arguments=arguments;
	}
	
	public String getMethodName(){
		return methodName;
	}
	
	public String getTarget(){
		return target;
	}
	
	public ArrayList<String> getArguments(){
		return arguments;
	}
}
