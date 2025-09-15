package testSteps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import util.driver.DriverFactory;

public class SLTestCases extends DriverFactory {

	BasePage base = new BasePage();

	@Given("user launches the login page")
	public void user_launch_url() throws IOException {
		driver = getDriver();

		System.out.println("URL: " + get_base_URL());
		driver.get(get_base_URL());

		driver.manage().window().maximize();
	}

	@When("user enters invalid email and invalid password")
	public void userEnterCredentials() {

		// WebElement userNameField=driver.findElement(By.id("user-name"));
		base.clickElementById("user-name");
		base.typeToField("user-name", "test@gmail.com");

		base.clickElementById("password");
		base.typeToField("password", "password12");
	}

	@And("click on Submit button")
	public void clickOnLoginButton() {
		base.clickElementById("login-button");
	}

	@Then("the page displays \"Invalid credentials\" message")
	public void verifyMissingCredentials() {
		WebElement requiredError=driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		String actualText=requiredError.getText();
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",actualText);
	}
	
	@When("user enters valid email and empty password")
	public void clickOnBothFieldsOnly() {
		base.clickElementById("user-name");
		base.typeToField("user-name", "test@gmail.com");

		base.clickElement("password");
	}

	@Then("the page displays \"Password is required\" message ")
	public void verifyPasswordRequiredMessage () {
		WebElement requiredError=driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		String actualText=requiredError.getText();
		Assert.assertEquals("Epic sadface: Password is required",actualText);
	}

	@When("When user leaves both email and password fields empty")
	public void leaveBothFieldsEmpty() {
		base.clickElementById("user-name");
		base.clickElement("password");
	}

	@Then("Then the page displays \"Username is required\" message ")
	public void emptyLoginErrorMessage() {
		WebElement requiredError=driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		String actualText=requiredError.getText();
		Assert.assertEquals("Epic sadface: Username is required",actualText);
	}
}
