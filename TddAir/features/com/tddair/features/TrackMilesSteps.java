package com.tddair.features;

import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TrackMilesSteps {

	private TddAirApplication app = TddAirSingleton.getInstance();
	
	@When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
	public void member_takes_flight(String username, String flightNumber) throws Throwable {
		app.completeFlight(username, flightNumber);
	}

	@Given("^member \"([^\"]*)\" has (\\d+) miles$")
	public void has_miles(String username, int miles) throws Throwable {
		app.addFlight("DFW", "TST", miles, "TT", 1);
		app.completeFlight(username, "TT1");
	}
	
	@Given("^a new service$")
	public void a_new_service() throws Throwable {
	   app = TddAirSingleton.newInstance();
	}

}
