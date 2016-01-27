package com.tddair.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TrackMilesSteps {

	@When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
	public void member_takes_flight(String username, String flightNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^has (\\d+) miles$")
	public void has_miles(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
