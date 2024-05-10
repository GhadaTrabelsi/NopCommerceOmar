package com.e2etests.automation;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/cucumber-repport.html","json:target/cucumber-repport.json"},
		tags = "@authentification",
		//glue = {"com.e2etests.automation.step_definitions" },
		monochrome = true,
		snippets = CAMELCASE
		

		)

public class RunWebSuiteTest {

}
