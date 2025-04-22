package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOverEX {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public MethodsOverEX() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.example.com");
    }

    // Click method using WebElement
    public void click(WebElement element) {
        element.click();
    }

    // Click method using By locator
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public static void main(String[] args) {
        MethodsOverEX obj = new MethodsOverEX();

        // Click using WebElement
        WebElement button1 = obj.driver.findElement(By.id("submitBtn"));
        obj.click(button1);

        // Click using By locator
        obj.click(By.xpath("//button[text()='Submit']"));

        obj.driver.quit();
    }
}
