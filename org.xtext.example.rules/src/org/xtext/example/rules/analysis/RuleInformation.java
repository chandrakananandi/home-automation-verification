package org.xtext.example.rules.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.rules.analysis.constants.Constants;
import org.xtext.example.rules.rules.EventTrigger;
import org.xtext.example.rules.rules.impl.ChangedEventTriggerImpl;
import org.xtext.example.rules.rules.impl.CommandEventTriggerImpl;
import org.xtext.example.rules.rules.impl.TimerTriggerImpl;
import org.xtext.example.rules.rules.impl.UpdateEventTriggerImpl;

/**
 * 
 * @author cnandi
 *
 */
public class RuleInformation {

	private String name;
	private EList<EventTrigger> triggers;
	//private ScriptContent action;
	private List<String> action=new ArrayList<String>();
	
	public RuleInformation(String name, EList<EventTrigger> triggers, List<String> script) {
		this.name = name;
		this.triggers = triggers;
		this.action = script;
	}

	public EList<EventTrigger> getTriggers() {
		return this.triggers;
	}

	public ArrayList<String> getTriggerTypes() {
		ArrayList<String> trigger_types = new ArrayList<String>();
		for (EventTrigger trigger : triggers) {
			trigger_types.add(trigger.getClass().getSimpleName());
		}
		return trigger_types;
	}

	@Override
	public boolean equals(Object rule1){
		if(rule1 instanceof RuleInformation) {
			if(this.getName().equals(((RuleInformation) rule1).getName())) {
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
		return this.getName().hashCode();
	}
		
	public HashMap<String, String> getTriggerParameters(EventTrigger trigger) {
		HashMap<String, String> parameters = new HashMap<String, String>();
		if (trigger.getClass().getSimpleName().equals(Constants.CHANGED_EVENT)) {
			parameters.put("Old state", ((ChangedEventTriggerImpl) trigger).getOldState());
			parameters.put("New State", ((ChangedEventTriggerImpl) trigger).getNewState());
			parameters.put("Item", ((ChangedEventTriggerImpl) trigger).getItem());
		}
		if (trigger.getClass().getSimpleName().equals(Constants.SYSTEM_STARTUP)) {
			parameters.put("Event", "started");
		}
		if (trigger.getClass().getSimpleName().equals(Constants.SYSTEM_SHUTDOWN)) {
			parameters.put("Event", "shuts down");
		}
		if (trigger.getClass().getSimpleName().equals(Constants.TIMER_EVENT)) {
			parameters.put("Cron", ((TimerTriggerImpl) trigger).getCron());
			parameters.put("time", ((TimerTriggerImpl) trigger).getTime());
		}
		if (trigger.getClass().getSimpleName().equals(Constants.COMMAND_EVENT)) {
			parameters.put("Command", ((CommandEventTriggerImpl) trigger).getCommand());
			parameters.put("Item", ((CommandEventTriggerImpl) trigger).getItem());
		}
		if (trigger.getClass().getSimpleName().equals(Constants.UPDATE_EVENT)) {
			parameters.put("State", ((UpdateEventTriggerImpl) trigger).getState());
			parameters.put("Item", ((UpdateEventTriggerImpl) trigger).getItem());
		}
		return parameters;
	}

	public ArrayList<String>getTriggerItemNames(){
		ArrayList<String>item_names=new ArrayList<String>();
		for(EventTrigger trigger: this.getTriggers()){
			if(trigger instanceof ChangedEventTriggerImpl){
				item_names.add(((ChangedEventTriggerImpl)trigger).getItem());
			}
			if(trigger instanceof CommandEventTriggerImpl){
				item_names.add(((CommandEventTriggerImpl)trigger).getItem());
			}
			if(trigger instanceof UpdateEventTriggerImpl){
				item_names.add(((UpdateEventTriggerImpl)trigger).getItem());
			}
		}
		return item_names;
	}
	
	public String getName() {
		return name;
	}

	public List<String> getAction() {
		return action;
	}
}
