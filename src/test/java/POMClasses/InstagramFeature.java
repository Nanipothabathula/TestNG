package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstagramFeature {
   private WebDriver driver;
   
   private By username1 = By.name("username");
   private By password1 = By.name("password");
   private By login1 = By.xpath("//button[@type='submit']");
   
   public InstagramFeature(WebDriver driver)
   {
	   this.driver=driver;
   }
   public void enterusername(String username)
   {
	   WebElement n = driver.findElement(username1);
	   n.sendKeys(username);
   }
   public void enterpwd(String pwd)
   {
	  WebElement p = driver.findElement(password1);
	  p.sendKeys(pwd);
   }
   public void enterpwd()
   {
   WebElement l = driver.findElement(login1);
   l.click();
   }
}
