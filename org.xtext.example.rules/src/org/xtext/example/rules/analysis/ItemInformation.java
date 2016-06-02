package org.xtext.example.rules.analysis;

import java.util.ArrayList;
import java.util.List;

public class ItemInformation {

	private String itemName= new String();
	private String itemType =new String();
	private List<String> groups=new ArrayList<String>();
	
	public String getItemName(){
		return itemName;
	}
	
	public List<String> getGroups() {
		return groups;
	}
	
	public String getItemType(){
		return itemType;
	}	
	public ItemInformation(String itemName, String itemType, List<String> groups) {
		this.itemName=itemName;
		this.itemType=itemType;
		this.groups=groups;
	}
}

