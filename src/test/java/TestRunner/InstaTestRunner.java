package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/FeatureFiles//InstaLogin.feature",
    glue = "StepDefinition",
    plugin = {"pretty", "html:target/CucumberReport.html"},
    monochrome = true
)
public class InstaTestRunner extends AbstractTestNGCucumberTests {
	
}
