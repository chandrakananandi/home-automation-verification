package org.xtext.example.rules.analysis;

import java.util.ArrayList;
import java.util.HashMap;

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
	private EList<EventTrigger>triggers;
	private ScriptContent action;
	
	public RuleInformation(String name, EList<EventTrigger> triggers, ScriptContent script){
		this.name=name;		
		this.triggers= triggers;
		this.action=script;
	}
	
	public EList<EventTrigger> getTriggers(){
		return this.triggers;
	}
	
	public ArrayList<String> getTriggerTypes(){
		ArrayList<String> trigger_types = new ArrayList<String>();
		for(EventTrigger trigger: triggers){
			trigger_types.add(trigger.getClass().getSimpleName());
		}
		return trigger_types;
	}
	
	public HashMap<String, String> getTriggerParameters(EventTrigger trigger){
		HashMap<String, String> parameters=new HashMap<String, String>();
		if(trigger.getClass().getSimpleName().equals(Constants.CHANGED_EVENT)){
			parameters.put("Old state",((ChangedEventTriggerImpl) trigger).getOldState());
			parameters.put("New State", ((ChangedEventTriggerImpl)trigger).getNewState());
			parameters.put("Item",((ChangedEventTriggerImpl)trigger).getItem());			
		}
		if(trigger.getClass().getSimpleName().equals(Constants.SYSTEM_STARTUP)){
			parameters.put("Event","started");
		}
		if(trigger.getClass().getSimpleName().equals(Constants.SYSTEM_SHUTDOWN)){
			parameters.put("Event","shuts down");
		}
		if(trigger.getClass().getSimpleName().equals(Constants.TIMER_EVENT)){
			parameters.put("Cron",((TimerTriggerImpl) trigger).getCron());
			parameters.put("time",((TimerTriggerImpl) trigger).getTime());
		}
		if(trigger.getClass().getSimpleName().equals(Constants.COMMAND_EVENT)){
			parameters.put("Command",((CommandEventTriggerImpl)trigger).getCommand());
			parameters.put("Item",((CommandEventTriggerImpl)trigger).getItem());
		}
		if(trigger.getClass().getSimpleName().equals(Constants.UPDATE_EVENT)){
			parameters.put("State",((UpdateEventTriggerImpl)trigger).getState());
			parameters.put("Item",((UpdateEventTriggerImpl)trigger).getItem());
		}
		return parameters;
	}
	public String getName(){
		return name;
	}
	
	public ScriptContent getAction() {
		return action;
	}	
}


	


