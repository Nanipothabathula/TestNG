package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ParaMeters {
	
	@org.testng.annotations.Parameters("browser")
	@Test
	public void Parameters(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("driver.chrome.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

		}
		   else if(browser.equalsIgnoreCase("Firefox"))

		{
			System.setProperty("driver.gecko.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new FirefoxDriver();
		}
		
		   else if(browser.equalsIgnoreCase("edge"))
		   {
				System.setProperty("driver.edge.driver","C:\\Users\\nanip\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new EdgeDriver();
		   }
		
	}

}
