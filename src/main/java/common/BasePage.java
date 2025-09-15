package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.driver.DriverFactory;

public class BasePage extends DriverFactory {

	public BasePage() {
		PageFactory.initElements(driver, this);

	}

	public void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void waitForElementVisiblity(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void clearText(WebElement element) {
		element.clear();
	}

	public void clickElementById(String Element) {
		WebElement e=driver.findElement(By.id(Element));
		waitForElementToBeClickable(e);
		e.click();
		
	}
	
	public void clickElement(String Element) {

		try {
			WebElement element = driver.findElement(By.id(Element));
			waitForElementToBeClickable(element);
			element.click();
		} catch (Exception element) {
			
			System.out.println("Element not found by ID");
		}
		try {
			WebElement element = driver.findElement(By.name(Element));
			waitForElementToBeClickable(element);
			element.click();
		} catch (Exception element) {
			System.out.println("Element not found by name");
		}
		try {
			WebElement e=driver.findElement(By.linkText(Element));
			waitForElementToBeClickable(e);
			e.click();
		} catch ( Exception e) {
			System.out.println("Element not found by LinkText");
		}
		
	}
	
	public void typeToField(String element,String text) {
		try {
			WebElement e=driver.findElement(By.id(element));
			waitForElementVisiblity(e);
			clearText(e);
			e.sendKeys(text);
		} catch(Exception e) {
			System.out.println("");
		}
		
		try {
			WebElement e=driver.findElement(By.name(element));
			waitForElementVisiblity(e);
			clearText(e);
			e.sendKeys(text);
		} catch(Exception e) {
			System.out.println("");
		}
		try {
			WebElement e=driver.findElement(By.linkText(element));
			waitForElementVisiblity(e);
			clearText(e);
			e.sendKeys(text);
		} catch(Exception e) {
			System.out.println("");
		}
	}
		
	
	
	
	
	
}
