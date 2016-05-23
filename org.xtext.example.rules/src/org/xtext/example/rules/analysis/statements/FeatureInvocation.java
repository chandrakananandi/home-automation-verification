package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;
import java.util.List;

public class FeatureInvocation {
	private String target;
	private String methodName;
	private List<String> arguments=new ArrayList<String>();

	public FeatureInvocation(){
		
	}
	public FeatureInvocation(String target, String methodName, List<String> arguments) {
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

	public List<String> getArguments() {
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
