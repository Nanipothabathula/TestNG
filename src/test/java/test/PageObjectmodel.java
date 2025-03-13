package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectmodel {
	private WebDriver driver;
	
	private By username1 = By.name("username");
	private By Password1 = By.name("password");
	
	public void PageObjectmodel( WebDriver driver)
	{
		this.driver=driver;

	}
	
	public void enterusername(String Username)
	{
		WebElement u = driver.findElement(By.name("username"));
		u.sendKeys(Username);
	}
	public void enterpwd(String pwd)
	{
		WebElement u = driver.findElement(By.name("username"));
		u.sendKeys(pwd);
	}
	public void button()
	{
		WebElement u = driver.findElement(By.name("button"));
		
	}
	
	

}
