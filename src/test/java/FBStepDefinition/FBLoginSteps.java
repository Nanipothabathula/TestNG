package FBStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBLoginSteps extends BaseTest 
{
	@Given("FB Login Page check")
	public void  FB_Login_Page_check()
	{
		setUp();
		driver.get("https://www.facebook.com/");
	}
	@When("User enters in login page")
	public void User_enters_username_and_password()
	{
	  WebElement Username = driver.findElement(By.id("email"));
	  Username.sendKeys("Nani");
	  WebElement pwd = driver.findElement(By.id("email"));
	  pwd.sendKeys("234224");
	}
	
	@And("Click on Login page")
	public void Click_on_Login_page()
	{
		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}
	
	
}
