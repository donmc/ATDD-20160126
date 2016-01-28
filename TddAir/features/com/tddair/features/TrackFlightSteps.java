package com.tddair.features;

import com.tddair.TddAirApplication;

import cucumber.api.java.en.When;

public class TrackFlightSteps {

	private TddAirApplication app = TddAirSingleton.getInstance();
	
	@When("^member \"([^\"]*)\" has (\\d+) ytd miles$")
	public void member_has_ytd_miles(String username, int ytdMiles) throws Throwable {
	    app.addFlight("DFW", "TST", ytdMiles, "TT", 123);
		app.completeFlight(username, "TT123");
	}
	
	@When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
	public void member_takes_flight(String username, String flightNumber) throws Throwable {
	    app.completeFlight(username, flightNumber);
	}
}
