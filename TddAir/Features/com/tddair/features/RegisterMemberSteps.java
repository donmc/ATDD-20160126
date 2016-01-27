package com.tddair.features;





import org.junit.Assert;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemberSteps {
	
	private TddAirApplication app = new TddAirApplication();
	private Member member;

	
	@When("^a customer registers with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_customer_registers_with_and(String username, String email)
			throws Throwable {
		app.registerCustomer(username, email);
		member = app.lookUpMember(username);
	}

	@Then("^that customer is added as a member$")
	public void that_customer_is_added_as_a_member() throws Throwable {
		Assert.assertNotNull(member);
	}

	@Then("^that member has \"([^\"]*)\" status$")
	public void that_member_has_status(String Status) throws Throwable {
		Assert.assertEquals(Status, member.getStatus());
	}

	@Then("^that member has (\\d+) ytd miles$")
	public void that_member_has_ytd_miles(int ytdMiles) throws Throwable {
		Assert.assertEquals(ytdMiles, member.getYtdMiles());
	}

	@Then("^that member has (\\d+) balance miles$")
	public void that_member_has_balance_miles(int balanceMiles) throws Throwable {
		Assert.assertEquals(balanceMiles, member.getBalanceMiles());
	}


	@When("^aa customer registers with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void aa_customer_registers_with_and(String arg1, String arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^an error message \"([^\"]*)\" is displayed        |$")
	public void an_error_message_is_displayed(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
