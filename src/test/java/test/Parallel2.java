package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	protected WebDriver driver;
	@Test
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void edge()
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	}

}
