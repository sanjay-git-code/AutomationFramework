package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					tags = "", 
					features = "src/test/resources/features/LoginPage.feature", 
					glue = "stepDefs", 
					plugin = {"pretty", 
							  "json:target/cucumber.json", 
							  "html:target/cucumber-html-report" }
				)

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
