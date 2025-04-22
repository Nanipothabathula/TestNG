package test;

import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	@Test(groups = "sanity")
	public void test1()
	{
		System.setProperty("driver.chrome.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("sanity");
		
				
	}
	@Test(groups ="regression" )
	public void test2()
	{
		System.setProperty("driver.chrome.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("regression");
				
	}
	@Test(groups = "smoke")
	public void test3()
	{
		System.out.println("smoke");
				
	}

}
