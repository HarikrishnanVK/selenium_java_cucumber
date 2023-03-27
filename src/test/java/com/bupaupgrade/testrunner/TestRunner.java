package com.bupaupgrade.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src//test//java//com//bupaupgrade//feature"},
		glue = "com.bupaupgrade.steps",
		strict = true, 
		monochrome = true,
		dryRun = false,
		tags = {"@WhereYouAre"},
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\library\\cucumber-reports\\report.html",
				"pretty", "html:src\\test\\resource\\library", "json:src\\test\\resource\\library\\cucumber.json",
				"junit:src\\test\\resource\\library\\cucumber.xml" 
		}
		)

public class TestRunner {
	

}
