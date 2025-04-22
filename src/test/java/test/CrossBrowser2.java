package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser2 {
	@Test(dep)
	
	@Parameters("browser")
	public void cross(String browser)
	{
		if(browser.equals("chrome"))
		{
			
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nanip\\Documents\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else
		{
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\nanip\\Documents\\chromedriver-win32\\msedgedriver.exe");
		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
        
		
	}

}
