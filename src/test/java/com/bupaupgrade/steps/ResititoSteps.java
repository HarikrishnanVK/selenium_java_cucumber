package com.bupaupgrade.steps;

import java.util.List;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.bupaupgrade.enums.Context;
import com.bupaupgrade.helpers.TestContext;
import com.sample.restfulservices.RestClient;
import com.sample.restfulservices.RestfulUtils;
import com.xebialabs.restito.semantics.Call;
import com.xebialabs.restito.server.StubServer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResititoSteps {
	TestContext testcontext;
	
	public ResititoSteps(TestContext context) {
		testcontext = context;
	}
	
	@Given("^I start the Resitito stub server '(\\d+)'$")
	public void i_start_the_Resitito_stub_server(int port) throws Throwable {
	    StubServer server = null;
	    testcontext.scenarioContext.setContext(Context.serverKey, server);
		RestfulUtils.restartResititoServerForGETRequests(server, port, HttpStatus.ACCEPTED_202);
	}

	@When("^I send the GET Request to the server '(\\d+)'$")
	public void i_send_the_GET_Request_to_the_server(int port) throws Throwable {
	   RestClient.sendGETRequest(port);
	}

	@When("^I capture the server call lists '(\\d+)'$")
	public void i_capture_the_server_call_lists(int waitTime) throws Throwable {
	   StubServer server = (StubServer)testcontext.getScenarioContext().getContext(Context.serverKey);
	   List<Call> CallLists = RestfulUtils.waitAndGETCallLists(server, waitTime);
	   testcontext.scenarioContext.setContext(Context.ExpectedData_List, CallLists);
	}

	@Then("^I validate whether request captured at given endpoint$")
	public void i_validate_whether_request_captured_at_given_endpoint() throws Throwable {
		List<Call> CallLists = (List<Call>)testcontext.getScenarioContext().getContext(Context.ExpectedData_List);
		org.junit.Assert.assertTrue("", (CallLists!=null) && (CallLists.size() == 1));
	}


	}


