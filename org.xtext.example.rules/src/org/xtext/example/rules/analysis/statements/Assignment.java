package org.xtext.example.rules.analysis.statements;

import java.util.ArrayList;
import java.util.List;

public class Assignment {
	private String lhs;
	private List<String> rhs=new ArrayList<String>();

	public Assignment() {
		
	}
	public Assignment(String lhs, ArrayList<String> rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public String getLhs() {
		return lhs;
	}

	public List<String> getRhs() {
		return rhs;
	}
	
	public void setLhs(String lhs){
		this.lhs=lhs;
	}
	public void setRhs(List<String> rhs){
		this.rhs=rhs;
	}
}