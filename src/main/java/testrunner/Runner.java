package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.extentreports.ExtentReporter;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/java/feature" }, plugin = { "html:target",
		"utils.extentreports.ExtentFormatter:target/index.html" }, glue = "stepdefinition")
public class Runner {

	@AfterClass
	public static void setup() {
		ExtentReporter.setConfig("src/main/java/utils/configs/config.xml");
		ExtentReporter.setSystemInfo("Browser", "Chrome");
		// ExtentReporter.setSystemInfo("Selenium", "v2.53.1");
	}

}
