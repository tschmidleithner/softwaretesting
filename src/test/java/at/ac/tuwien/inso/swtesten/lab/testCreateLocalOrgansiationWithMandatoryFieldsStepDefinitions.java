package at.ac.tuwien.inso.swtesten.lab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testCreateLocalOrgansiationWithMandatoryFieldsStepDefinitions {
	private ValidAddMemberFormSubmit helper = new ValidAddMemberFormSubmit();
	
	@Given("^I am on the sports-id homepage$")
	public void I_am_on_the_sportsid_homepage() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		helper.setUp();
	}

	@When("^I create a valid local organisation named \"([^\"]*)\"$")
	public void I_create_a_valid_local_organisation_named(String arg1) throws Throwable {
		helper.createLocalOrganisation(arg1);
	}
	
	@Then("^the list contains the new local organisation named \"([^\"]*)\"$")
	public void the_list_contains_the_new_local_organisation_named(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  
	}
	
	
	
	@When("^login with invalid credentials$")
	public void login_with_invalid_credentials() throws Throwable {
	    helper.invalid_login();
	}

	@Then("^i am on the error page$")
	public void i_am_on_the_error_page() throws Throwable {
	    helper.isLoginPage();
	}

}

