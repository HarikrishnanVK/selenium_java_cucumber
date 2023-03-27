package com.bupaupgrade.helpers;

import java.util.HashMap;
import java.util.Map;

import com.bupaupgrade.enums.Context;


public class ScenarioContext {
	
	private Map<String,Object>scenarioContext;
	
	public ScenarioContext() {
		scenarioContext=new HashMap<>();
	}
	
	public void setContext(Context Key,Object Value ) {
		scenarioContext.put(Key.toString(), Value);
	}
	
	public Object getContext(Context Key) {
		return scenarioContext.get(Key.toString());
	}
	
	public Boolean isContains(Context Key) {
		return scenarioContext.containsKey(Key.toString());
	}

}
