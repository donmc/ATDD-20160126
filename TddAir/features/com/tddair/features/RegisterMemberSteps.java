package com.tddair.features;


import org.junit.Assert;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemberSteps {

	private TddAirApplication app = TddAirSingleton.getInstance();
	private Member member;
	private String errorMessage;
	
	@When("^a customer registers with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_customer_registers_with_and(String username, String email)
			throws Throwable {
		try {
			app.registerCustomer(username, email);
			member = app.lookupMember(username);
		}catch (Exception e) {
			errorMessage = e.getMessage();
		}
	}

	@Then("^that customer is added as a member$")
	public void that_customer_is_added_as_a_member() throws Throwable {
		Assert.assertNotNull(member);
	}

	@Then("^that member has \"([^\"]*)\" status$")
	public void that_member_has_status(String status) throws Throwable {
		Assert.assertEquals(status, member.getStatus().toString());
	}

	@Then("^that member has (\\d+) ytd miles$")
	public void that_member_has_ytd_miles(int ytdMiles) throws Throwable {
		Assert.assertEquals(ytdMiles, member.getYtdMiles());
	}

	@Then("^that member has (\\d+) balance miles$")
	public void that_member_has_balance_miles(int bonus) throws Throwable {
		Assert.assertEquals(bonus, member.getBalanceMiles());
	}

	@Then("^an error message \"([^\"]*)\" is displayed$")
	public void an_error_message_is_displayed(String expectedMessage) throws Throwable {
		Assert.assertEquals(expectedMessage, errorMessage);
	}
}
