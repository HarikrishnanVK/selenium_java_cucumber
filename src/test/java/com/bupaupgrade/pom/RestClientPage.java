package com.bupaupgrade.pom;

import static org.glassfish.grizzly.http.util.HttpStatus.ACCEPTED_202;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.restfulservices.RestClient;
import com.sample.restfulservices.RestfulUtils;
import com.xebialabs.restito.server.StubServer;

public class RestClientPage {
	
	public WebDriver driver;
	
	private WebDriverWait wait;
	
	public RestClientPage(WebDriver ldriver) {
		this.driver = ldriver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
		
	}
	
public void testGetRequest(int port) throws ClientProtocolException, IOException {
	
	StubServer server = null;
	
	RestfulUtils.restartResititoServerForGETRequests(server, port, ACCEPTED_202);
		
}
}
