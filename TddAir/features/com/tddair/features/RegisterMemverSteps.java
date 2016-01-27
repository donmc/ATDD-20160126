package com.tddair.features;

import org.junit.Assert;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemverSteps {
	
	private TddAirApplication app = new TddAirApplication();
	private Member member = new Member();
	
	@When("^a customer registers with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_customer_registers_with_and(String username, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		app.registerCustomer(username, email);
		member = app.lookupMember(username);
	    throw new PendingException();
	}

	@Then("^that customer is added as a member$")
	public void that_customer_is_added_as_a_member() throws Throwable {
	    Assert.assertNotEquals(null, member);
	    throw new PendingException();
	}

	@Then("^that member has \"([^\"]*)\" status$")
	public void that_member_has_status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^that member has (\\d+) ytd miles$")
	public void that_member_has_ytd_miles(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^that member has (\\d+) balance miles$")
	public void that_member_has_balance_miles(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	

	@Then("^an error message \"([^\"]*)\" is displayed$")
	public void an_error_message_is_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
