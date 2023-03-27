package com.bupaupgrade.steps;

import org.openqa.selenium.WebDriver;

import com.bupaupgrade.basefunctions.InitWebDrivers;
import com.bupaupgrade.helpers.FileReaderManager;
import com.bupaupgrade.helpers.PageObjectManager;
import com.bupaupgrade.helpers.TestContext;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BupaWhereYouAreSteps {
	
	PageObjectManager pm;
	TestContext testContext;
	
	public BupaWhereYouAreSteps(TestContext context) {
		testContext = context;
		pm = new PageObjectManager(InitWebDrivers.driver);
	}
	
	@When("^I click on country using \"([^\"]*)\"$")
	public void i_click_on_country_using(String Text) throws Exception  {
		
	    pm.getWhereYouAre().selectCountry(Text);
	}

	@Then("^I should be navigated to the \"([^\"]*)\" of \"([^\"]*)\"$")
	public void i_should_be_navigated_to_the_of(String env, String url) throws Exception  {
	 pm.getWhereYouAre().verifyResultPage(env, url);
	}


}
