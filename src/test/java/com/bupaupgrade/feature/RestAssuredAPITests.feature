Feature: Rest Assured API Tests

@RestAssured
Scenario Outline: To verify Rest Assured GET Response 
Given I enter the url for GET reponse
Then  I verify the status code for the "<url>" with parameters
Examples:
|url																						  |
|http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1|