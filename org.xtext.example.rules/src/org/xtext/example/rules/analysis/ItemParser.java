package org.xtext.example.rules.analysis;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.example.items.ItemsStandaloneSetupGenerated;
import org.xtext.example.items.items.impl.ModelNormalItemImpl;

public class ItemParser {
	
	String item_file_name;
	List<ItemInformation> item_database = new ArrayList<ItemInformation>();
	List<String> group_names=new ArrayList<String>();
	
	public ItemParser(String file_name){
		item_file_name=file_name;
	}
	
	public List<String> getGroupsNames() {
		return group_names;
	}
	
	public String getItemFileName(){
		return item_file_name;
	}
	
	public List<ItemInformation> getItemSet(){
		return item_database;
	}
	
	public ArrayList<String> getItemNames(){
		ArrayList<String> item_names=new ArrayList<String>();
		for(ItemInformation item_info: this.getItemSet()){
			item_names.add(item_info.getItemName());
		}
		return item_names;
	}
	
	public void analyseItems(){
		ItemsStandaloneSetupGenerated itemSetup=new ItemsStandaloneSetupGenerated();
		itemSetup.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet=new ResourceSetImpl();
		Resource resource= resourceSet.getResource(URI.createURI("src/org/xtext/example/rules/analysis/resources/"+ getItemFileName()), true);
		TreeIterator<EObject> eobjects = resource.getAllContents();
		while(eobjects.hasNext()){
			EObject obj=eobjects.next();
			if(obj instanceof ModelNormalItemImpl){
				for(String group: ((ModelNormalItemImpl)obj).getGroups()) {
					group_names.add(group);
				}
				ItemInformation item=new ItemInformation(((ModelNormalItemImpl) obj).getName(), ((ModelNormalItemImpl) obj).getType(), 
						((ModelNormalItemImpl) obj).getGroups());
				item_database.add(item);
			}
		}
	}
}
