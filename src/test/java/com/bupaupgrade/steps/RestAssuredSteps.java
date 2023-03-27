package com.bupaupgrade.steps;

import com.sample.restfulservices.RestAssured;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RestAssuredSteps {

	@Given("^I enter the url for GET reponse$")
	public void i_enter_the_url_for_GET_reponse() throws Throwable {
	    RestAssured.getResponseBody();
	}
	
	@Then("^I verify the status code for the \"([^\"]*)\" with parameters$")
	public void i_verify_the_status_code_for_the_with_parameters(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.verifyStatusCode(url);
	}
}
