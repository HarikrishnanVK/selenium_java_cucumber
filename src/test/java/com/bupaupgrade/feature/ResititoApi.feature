Feature: To validate API calls using Resitito Framework

@resititoGET
Scenario Outline: To validate GET Request from REST Client
Given I start the Resitito stub server '<port>' 
When  I send the GET Request to the server '<port>'
And   I capture the server call lists '<timeInSeconds>'
Then  I validate whether request captured at given endpoint 

Examples:
|port|timeInSeconds|
|9097|30		   |