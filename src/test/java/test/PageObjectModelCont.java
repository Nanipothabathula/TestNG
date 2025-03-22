package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModelCont {
    private WebDriver driver;

    // ✅ Constructor to accept WebDriver instance
    public PageObjectModelCont(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ Method to enter username
    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(username);
    }
}
