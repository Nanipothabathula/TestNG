package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.cucumber.java.it.Data;

public class DataProvider extends BaseTest
{
	@BeforeMethod
	public void insta()
	{
		setUp();
		driver.get("https://www.instagram.com/");

	}
	@org.testng.annotations.DataProvider(name = "logindata")
	public Object[][] logindata()
	{
		return new Object[][]
				{
			{"Nani","p"},
			{"P","Nani"}
				};
	}
	@Test(dataProvider ="logindata")
	public void test(String userame, String pwd)
	{
		WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(userame);

        // Enter password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(pwd);

        // Click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

	}
	
	
	
	

}
