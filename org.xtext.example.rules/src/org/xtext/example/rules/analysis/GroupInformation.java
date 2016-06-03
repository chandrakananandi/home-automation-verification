package org.xtext.example.rules.analysis;

import java.util.ArrayList;
import java.util.List;

public class GroupInformation {
	private String groupName =new String();
	private List<GroupInformation> parent_groups=new ArrayList<GroupInformation>();
	boolean visited = false;	
	public String getGroupName(){
		return groupName;
	}
	
	public List<GroupInformation> getParentGroups() {
		return parent_groups;
	}
	
	public void addParentGroup(GroupInformation group) {
		parent_groups.add(group);
	}
	
	public GroupInformation(String groupName) {
		this.groupName=groupName;		
	}
	
	@Override
	public boolean equals(Object group1){
		if(group1 instanceof GroupInformation) {
			if(this.getGroupName().equals(((GroupInformation) group1).getGroupName())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){ 
		return this.getGroupName().hashCode();
	}
}
