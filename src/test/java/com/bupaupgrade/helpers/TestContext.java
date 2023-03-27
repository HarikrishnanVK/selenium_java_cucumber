package com.bupaupgrade.helpers;

import org.openqa.selenium.WebDriver;

public class TestContext {
	public ScenarioContext scenarioContext;
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
	
	public TestContext(){
		scenarioContext = new ScenarioContext();
	}

}
