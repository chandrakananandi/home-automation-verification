package org.xtext.example.rules.analysis;


import java.util.ArrayList;
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
	ArrayList<ItemInformation> item_database = new ArrayList<ItemInformation>();
	
	public ItemParser(String file_name){
		item_file_name=file_name;
	}
	
	public String getItemFileName(){
		return item_file_name;
	}
	
	public ArrayList<ItemInformation> getItemSet(){
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
				ItemInformation item=new ItemInformation(((ModelNormalItemImpl) obj).getName(), ((ModelNormalItemImpl) obj).getType());
				item_database.add(item);
			}
		}
	}
}
