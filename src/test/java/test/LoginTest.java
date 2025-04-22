package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;
    private PageObjectModelCont loginPage;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nanip\\Documents\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login/");

        // ✅ Pass WebDriver instance to PageObjectModelCont
        PageObjectModelCont loginPage = new PageObjectModelCont(driver);
    }

    public void test1() {
        loginPage.enterUsername("Nani");
    }

    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.setup();
        test.test1();
    }
}
