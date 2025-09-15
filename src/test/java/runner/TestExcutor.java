package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/java/features/",
	    glue = {"testSteps"},
	    //plugin = {"pretty", "html:target/report.html"},
	    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 

	    tags = "@invaliEmailAndInvalidPassword",
	    monochrome = true,
	    dryRun = false
	)


public class TestExcutor {

}
