package fsteps;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class step {
	@Given("^I launch the chrome browser$")
	public void i_launch_the_chrome_browser() throws Exception {
		System.out.println("hiii");
	    
	}

	@When("^I enter the text in text box$")
	public void i_enter_the_text_in_text_box() throws Exception {
		System.out.println("hiii11111");
	}

	@Then("^I should see results$")
	public void i_should_see_results() throws Exception {
		System.out.println("hiii11111222222");
	}

}
