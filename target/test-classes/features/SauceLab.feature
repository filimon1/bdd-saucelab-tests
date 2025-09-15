@SauceLabFeature
Feature: SauceLab Test Cases




@invaliEmailAndInvalidPassword
	Scenario: Login with invalid email
	Given user launches the login page
	When user enters invalid email and invalid password
	And click on Submit button
	Then the page displays "Invalid credentials" message
	
@emptyPasswordWithEmail
	Scenario: Login with invalid password
	Given user launches the Login Page
	When user enters valid email and empty password
	And click on Submit button
	Then the page displays "Password is required" message 

@emptyField
	Scenario: Login with empty email and password
	Given user lanuches the login page
	When user leaves both email and password fields empty
	And click on Submit button
	Then the page displays "Username is required" message 