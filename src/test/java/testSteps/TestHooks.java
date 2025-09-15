package testSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import util.driver.DriverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestHooks extends DriverFactory {

	
	 @Before 
	 public void beforeScenario(Scenario scenario) {
	  System.out.println("*******************************");
	 System.out.println("********Test Starting**********");
	 System.out.println("Scenario Name :" + scenario.getName()); }
	 
	  @After
	  public void afterScenario(Scenario scenario) {
	 System.out.println("Scenario Status : " + scenario.getStatus());
	 System.out.println("*******************************");
	 System.out.println("********Test Completed**********");
	 
	 driver.quit();
	 }
	 

	/*
	 * public static ExtentReports extent; 
	 * public static ExtentTest test;
	 * 
	 * 
	 * 
	 * 
	 * @BeforeAll public static void setupReport() { ExtentSparkReporter spark = new
	 * ExtentSparkReporter("Report/Spark.html"); extent = new ExtentReports();
	 * extent.attachReporter(spark); }
	 * 
	 * @Before public void beforeScenario(Scenario scenario) { test =
	 * extent.createTest(scenario.getName()); test.info("Starting scenario: " +
	 * scenario.getName()); }
	 * 
	 * @After public void afterScenario(Scenario scenario) {
	 * test.info("Scenario status: " + scenario.getStatus()); if
	 * (scenario.isFailed()) { // attach screenshot if needed } extent.flush(); //
	 * writes everything to the report }
	 */
}
