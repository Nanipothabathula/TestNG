package InstafeatureStepdefinition;

import org.openqa.selenium.WebDriver;

import Base.BaseTest;
import POMClasses.InstagramFeature;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Instasfeature extends BaseTest{
	WebDriver driver;
	InstagramFeature pom;

		@Given("I want to write a step with {string}")
		public void i_want_to_write_a_step_with(String name)
		{
		   setUp();
	        pom = new InstagramFeature(driver);

		}

		@When("I check for the {int} in step")
		public void i_check_for_the_value_in_step(String value) 
		{
		  
		}

		@Then("I verify the {string} in step")
		public void i_verify_the_status_in_step(String status) {
		   
		}


}
