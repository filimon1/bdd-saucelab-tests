package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/java/features/",
	    glue = {"testSteps"},
	   // plugin = {"pretty", "html:target/report.html"},
	    plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"},
	    tags = "@SauceLabFeature",
	    monochrome = true,
	    dryRun = false
	)


public class TestExcutor {

}
