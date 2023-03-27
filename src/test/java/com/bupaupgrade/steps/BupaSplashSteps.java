package com.bupaupgrade.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bupaupgrade.basefunctions.InitWebDrivers;
import com.bupaupgrade.enums.Context;
import com.bupaupgrade.helpers.PageObjectManager;
import com.bupaupgrade.helpers.TestContext;
import com.bupaupgrade.utilities.Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class BupaSplashSteps {
	TestContext testContext;
	 
	 public BupaSplashSteps(TestContext context) {
	 testContext = context;
	 }

	public static PageObjectManager pageObject = new PageObjectManager(InitWebDrivers.driver);

	@Then("^I should be navigated to the \"([^\"]*)\" of \"([^\"]*)\" for splash page$")
	public void i_should_be_navigated_to_the_of_for_splash_page(String env, String url) throws Throwable {
		org.junit.Assert.assertTrue(pageObject.getBupaSplash().verifySplashUrl(env, url));
	}
	
	@Given("^I get the \"([^\"]*)\" from Excel \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_get_the_from_Excel(List<String> data, String ColName, String SheetName, String FileName) throws Throwable {
		List<String> expectedList =  (List<String>)Utilities.ReadColumn(data, ColName, SheetName, FileName);
		testContext.getScenarioContext().setContext(Context.ExpectedData_List, expectedList);	

	}
	
	@Then("^I get the \"([^\"]*)\" under Sitemap Page of \"([^\"]*)\"$")
	public void i_get_the_under_Sitemap_Page_of(List<String> data, String option) throws Throwable {
		List<String> actualList = (List<String>)pageObject.getSitemap().getActualList(data, option);
        testContext.getScenarioContext().setContext(Context.ActualData_List, actualList);
	}

	@Then("^I should see that the Tree structure are displayed appropriately$")
	public void i_should_see_that_the_Tree_structure_are_displayed_appropriately() throws Throwable {
		//testContext.scenarioContext.isContains(Context.ExpectedData_List,Context.ActualData_List);
		List<String> getexpectedList = (List<String>) testContext.getScenarioContext().getContext(Context.ExpectedData_List);
        List<String> getactualList = (List<String>) testContext.getScenarioContext().getContext(Context.ActualData_List);
        System.out.println("expectedList is"+" "+getexpectedList);
        System.out.println("actualList is"+" "+getactualList);
        org.junit.Assert.assertEquals(getexpectedList, getactualList);
	}

}