package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	protected WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("driver.chrome.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
	}
	@DataProvider(name = "data")
	
	public Object[][] data()
	{
		return new Object[][]
				{
			{"Nani", "P"},
			{"P", "N"}
				};
	}
	@Test(dataProvider ="data" )
	public void details(String username, String pwd)
	{
		WebElement u = driver.findElement(By.name("username"));
		u.sendKeys(username);
		WebElement pwd1 = driver.findElement(By.name("password"));
		pwd1.sendKeys(pwd);
		 WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Log in']"));
	        loginBtn.click();
		

	}

}
