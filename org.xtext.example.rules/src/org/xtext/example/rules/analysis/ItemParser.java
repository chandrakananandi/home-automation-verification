package org.xtext.example.rules.analysis;


import java.security.acl.Group;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.example.items.ItemsStandaloneSetupGenerated;
import org.xtext.example.items.items.impl.ModelGroupItemImpl;
import org.xtext.example.items.items.impl.ModelNormalItemImpl;

public class ItemParser {
	
	String item_file_name;
	List<ItemInformation> item_database = new ArrayList<ItemInformation>();
	List<GroupInformation> group_database = new ArrayList<GroupInformation>();
	Set<String> group_names=new HashSet<String>();
	Map<String, ArrayList<String>> group_item_map=new HashMap<String, ArrayList<String>>();
	
	public ItemParser(String file_name){
		item_file_name=file_name;
	}
	
	public Set<String> getGroupNames() {
		return group_names;
	}
	
	public String getItemFileName(){
		return item_file_name;
	}
	
	public List<ItemInformation> getItemSet(){
		return item_database;
	}
	
	public Map<String, ArrayList<String>> getGroupItemMap() {
		return group_item_map;
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
			if(obj instanceof ModelGroupItemImpl) {
				GroupInformation group=new GroupInformation(((ModelGroupItemImpl)obj).getName());
				group_names.add(((ModelGroupItemImpl)obj).getName());
				for(String parent: ((ModelGroupItemImpl)obj).getGroups()) {
					GroupInformation parent_group = new  GroupInformation(parent);
					group.addParentGroup(parent_group);
				}			
				group_database.add(group);
			}
			
			
			if(obj instanceof ModelNormalItemImpl) {
				List<GroupInformation>groups=new ArrayList<GroupInformation>();
				for(String group: ((ModelNormalItemImpl)obj).getGroups()) {
					GroupInformation g_info=new GroupInformation(group);
					group_names.add(group);
					groups.add(g_info);
				}
				ItemInformation item=new ItemInformation(((ModelNormalItemImpl) obj).getName(), ((ModelNormalItemImpl) obj).getType(), groups);
				item_database.add(item);
			}
		}
		
		for(ItemInformation item: item_database) {
			for(GroupInformation group: item.getGroups()) {
				if(group_database.contains(group)) {
					reachability(item, group_database.get(group_database.indexOf(group)));
				}
			}
		}
		
		
		extractGroupInformation();
	}
	
	//depth first search
	public void reachability (ItemInformation item, GroupInformation group) {
		if (group==null) {
			return;
		}	
		group.visited=true;	
		item.recursivegroups.add(group);
		for(GroupInformation g: group.getParentGroups()) {
			if(g.visited==false) {
				reachability(item , group_database.get(group_database.indexOf(g)));
			}			
		}
	}
	
	public void extractGroupInformation() {
		for(String group: this.getGroupNames()) {
			ArrayList<String> items=new ArrayList<String>();
			for(ItemInformation item: item_database) {
				if(item.getGroupNames().contains(group)) {
					items.add(item.getItemName());
				}
			}
			group_item_map.put(group, items);
		}
	}
}
