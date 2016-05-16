package org.xtext.example.rules.analysis;

public class ItemInformation {

	private String itemName= new String();
	private String itemType =new String();
	
	public String getItemName(){
		return itemName;
	}
	
	public String getItemType(){
		return itemType;
	}
	
	public ItemInformation(String itemName, String itemType) {
		this.itemName=itemName;
		this.itemType=itemType;
	}
}

