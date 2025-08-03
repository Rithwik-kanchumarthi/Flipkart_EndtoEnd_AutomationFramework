package com.flipkart.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com/flipkart/Stepdefinitions", "com/flipkart/Hooks"},
		plugin = {"pretty", "html:target/cucumber-report.html"},
		tags = "@Test",
		monochrome = true
		)

public class JunitTestRunner 
{

}
