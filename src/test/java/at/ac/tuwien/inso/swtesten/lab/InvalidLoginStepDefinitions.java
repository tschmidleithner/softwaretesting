package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLoginStepDefinitions {
	InvalidLogin helper = new InvalidLogin();
	
	@Given("^I am on the login homepage$")
	public void I_am_on_the_login_homepage() throws Throwable {
	    //not needed
	}

	@When("^I enter wrong credentials")
	public void enterWrongCredentials() throws Throwable {
		//not needed
	}
	
	@Then("^I am not forwared to another page$")
	public void notFoward() throws Throwable {
		helper.test_invalidLogin();
	}
}
