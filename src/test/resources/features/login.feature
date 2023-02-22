Feature: Testing the Login Feature 
Scenario: To validate user is able to login the application. 
	Given User is on the application login page 
	When User enters <username> and <password> 
	Then User is on Home Page