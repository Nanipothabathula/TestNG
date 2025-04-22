package Hooks;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@Before
	public void browserSetup() 
	{
		BaseTest.setUp();
		
	}
	@After
	public void Browserclose()
	{
		BaseTest.tearDown();
	}
	@AfterStep
	public void takescreenshotsfailue(Scenario  scenario)
	{
		if(scenario.isFailed())
		{
	        TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
           byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
		}
		
	}

}
