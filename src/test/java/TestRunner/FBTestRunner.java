package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/FeatureFiles//FBLogin.feature",
		glue = "FBStepDefinition",
		plugin = {"pretty","html:target/CucumberFBReport.html"},
		monochrome = true
		)
public class FBTestRunner extends  AbstractTestNGCucumberTests {

}
