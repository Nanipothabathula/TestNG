package TestRunner;

import io.cucumber.core.plugin.PrettyFormatter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/java", glue = "step", plugin = {"pretty","html:target/cucmber.html"}, monochrome = true)

public class TestRunnerexample extends AbstractTestNGCucumberTests {

}
