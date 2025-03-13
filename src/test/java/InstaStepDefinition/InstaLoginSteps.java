package InstaStepDefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Base.BaseTest;

public class InstaLoginSteps extends BaseTest {

    @Given("User is on login page")
    public void User_is_on_login_page() {
        setUp(); // Initialize WebDriver
        driver.get("https://www.instagram.com/");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() {
        driver.findElement(By.name("username")).sendKeys("testuser");
        driver.findElement(By.name("password")).sendKeys("password123");
    }

    @When("Clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_homepage() {
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.contains("instagram.com") : "Login Failed!";
        tearDown(); // Close browser after test
    }
}
