package com.sample.restfulservices;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestClient {
	
	public static boolean sendGETRequest(int port) throws ClientProtocolException, IOException {
		
		//Set HTTP Client 
		try {
			HttpClient client = HttpClientBuilder.create().build();
			//create Get Request response
			HttpGet getRequest = new HttpGet("http://localhost:"+port+"/getevents");
			//send Get Request to the server
			client.execute(getRequest);
			System.out.println("HTTP request is sent successfully."
					+ "Returning True");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Some exception has occurred during the HTTP Client creation.+ \"Returning false");
		return false;
	}
		
		public RestClient() {
			System.out.println("starting rest service");
		}
}
