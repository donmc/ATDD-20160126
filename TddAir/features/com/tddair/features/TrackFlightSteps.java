package com.tddair.features;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TrackFlightSteps {

	private TddAirApplication app = TddAirSingleton.getInstance();
	private Member member;
	
	@Given("^test flights exist$")
	public void test_flights_exist() throws Throwable {
	    app.addFlight("DFW", "DFW", 20000, "TEST", 20000);
	    app.addFlight("DFW", "DFW", 45000, "TEST", 45000);
	    app.addFlight("DFW", "DFW", 70000, "TEST", 70000);
	}

	@Given("^a registered member \"([^\"]*)\" who has (\\d+) ytd miles$")
	public void a_registered_member_who_has_ytd_miles(String username, int ytdMiles) throws Throwable {
	    app.registerCustomer("don", "don@improving.com");
	    app.completeFlight("don", "TEST" + ytdMiles);
	}
	
	@When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
	public void member_takes_flight(String username, String flightNumber) throws Throwable {
	    app.completeFlight(username, flightNumber);
	}
}
