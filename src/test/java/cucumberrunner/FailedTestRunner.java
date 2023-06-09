package cucumberrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failed_scenarios.txt", 
		glue = "stepdefinitions", 
		dryRun = false, 
		monochrome = true, 
		tags = "@smoketest", 
		plugin = {
		"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt"})

public class FailedTestRunner extends AbstractTestNGCucumberTests{

}
