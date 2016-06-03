package org.xtext.example.rules.analysis;

import java.util.ArrayList;
import java.util.List;

public class ItemInformation {

	private String itemName= new String();
	private String itemType =new String();
	private List<GroupInformation> groups=new ArrayList<GroupInformation>();
	private List<String> groupNames=new ArrayList<String>();
	List<GroupInformation> recursivegroups=new ArrayList<GroupInformation>();
	
	public String getItemName(){
		return itemName;
	}
	
	public List<GroupInformation> getGroups() {
		return groups;
	}
	
	public List<String> getGroupNames() {
		List<String>names=new ArrayList<String>();
		for(GroupInformation g: recursivegroups) {
			names.add(g.getGroupName());
		}
		return names;
	}


	public String getItemType(){
		return itemType;
	}	
	public ItemInformation(String itemName, String itemType, List<GroupInformation> groups) {
		this.itemName=itemName;
		this.itemType=itemType;
		this.groups=groups;
		for(GroupInformation g: groups) {
			groupNames.add(g.getGroupName());
		}
	}
}

