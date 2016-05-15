package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;

public class MemberFeatureInvocation {
	private String memberFeatureName;
	private String featureName;
	private ArrayList<String> arguments;
	
	public MemberFeatureInvocation(){
		
	}

	public MemberFeatureInvocation( String memberFeaureName, String featureName, ArrayList<String> arguments) {

		this.memberFeatureName = memberFeaureName;
		this.featureName=featureName;
		this.arguments = arguments;
	}

	public String getMemberName() {
		return memberFeatureName;
	}
	
	public String getFeatureName(){
		return featureName;
	}



	public ArrayList<String> getArguments() {
		return arguments;
	}
	
	public void setMemberName(String methodName) {
		this.memberFeatureName = methodName;
	}


	public void setFeatureName(String feature){
		this.featureName=feature;
	}
	public void setArgument(ArrayList<String> arguments) {
		this.arguments=arguments;
	}
}
