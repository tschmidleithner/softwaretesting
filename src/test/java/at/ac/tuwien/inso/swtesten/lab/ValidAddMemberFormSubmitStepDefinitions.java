package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidAddMemberFormSubmitStepDefinitions {
	private ValidAddMemberFormSubmit helper = new ValidAddMemberFormSubmit();
	
	@Given("^I am on the sportsid homepage$")
	public void I_am_on_the_sportsid_homepage() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		helper.setUp();
	}
	
	@When("^I create a valid user named \"([^\"]*)\"$")
	public void I_create_a_valid_user_named(String arg1) throws Throwable {
	    helper.createUser(arg1);
	}

	@Then("^the list contains the new user \"([^\"]*)\"$")
	public void the_list_contains_the_new_user(String arg1) throws Throwable {
		
	}

}
