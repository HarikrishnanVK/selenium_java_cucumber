package com.bupaupgrade.steps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.bupaupgrade.basefunctions.InitWebDrivers;
import com.bupaupgrade.enums.Context;
import com.bupaupgrade.helpers.TestContext;
import com.bupaupgrade.utilities.Utilities;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestContext testcontext;
	
	public Hooks(TestContext context) {
		testcontext = context;
	}
	
	

	@After
	public void teardown(Scenario scenario) throws IOException, InterruptedException {
		WebDriver driver = (WebDriver) testcontext.getScenarioContext().getContext(Context.browser);
		String status = scenario.getStatus();
		System.out.println(status);
		if (scenario.isFailed() &&driver !=null) {
			String screenshotName = scenario.getName().replaceAll(" ", "_").toString();
			File screenShot = Utilities.captureScreenshot(screenshotName);
			Thread.sleep(2000);
			Reporter.addScreenCaptureFromPath(screenShot.getAbsolutePath());

		}
		Reporter.loadXMLConfig(
				new File(System.getProperty("user.dir") + "\\src\\test\\resource\\ResourceFiles\\extent-config.xml"));
		Thread.sleep(2000);
		if(driver!=null)
			driver.quit();

	}

}
