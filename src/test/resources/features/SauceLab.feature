@SauceLabFeature
Feature: SauceLab Test Cases

@invaliEmailAndInvalidPassword
	Scenario: Login with invalid credentials
	Given user launch the login page
	When user enters invalid email and invalid password
	And click on Submit button
	Then the page displays "Invalid credentials" message
	
@emptyPasswordWithEmail
	Scenario: Login with invalid password
	Given user launch the login page
	When user enters valid email and empty password
	And click on Submit button
	Then the page displays "Password is required" message 

@emptyField
	Scenario: Login with empty email and password
	Given user launch the login page
	When user leaves both email and password fields empty
	And click on Submit button
	Then the page displays "Username is required" message 
	
@succesfulLogin
	Scenario: Login with valid username and password successfully
	Given user launch the login page
	When user enter valid email and valid password
	And click on Submit button
	Then the page displays "Swag Labs" header
	