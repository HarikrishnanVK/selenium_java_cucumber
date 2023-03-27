package com.sample.restfulservices;
import static io.restassured.RestAssured.given;


public class RestAssured {
	
	public static void getResponseBody() {
		
		 given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
		  .all();
	}
	
	public static void getResponseBodyWithQueryParam() {
		
		given().queryParam("CUSTOMER_ID","68195")
 		.queryParam("PASSWORD", "1234!")
 		.queryParam("Account_No", "1").when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
 		.body();
	}
	
public static void verifyStatusCode(String url) {
		
		int statusCode = given().queryParam("CUSTOMER_ID","68195")
 		.queryParam("PASSWORD", "1234!")
 		.queryParam("Account_No", "1").when().get("http://demo.guru99.com/V4/sinkministatement.php").statusCode();
		System.out.println("Status code is"+" "+statusCode);
		given().when().get(url).then().statusCode(200);
		
		
	}
	

}
