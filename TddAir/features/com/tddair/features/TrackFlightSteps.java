package com.tddair.features;

import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.java.en.When;

public class TrackFlightSteps {
	
	private TddAirApplication app = TddAirSingleton.getInstance();
	private Member member;
	
	@When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
	public void member_takes_flight(String username, String fullFlightNumber) throws Throwable {
	    member = app.lookupMember(username);
	    app.completeFlight(username, fullFlightNumber);
	}

}
