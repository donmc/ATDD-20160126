package com.tddair.features;

import org.junit.Assert;

import com.tddair.FlightDao;
import com.tddair.Member;
import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightAccrualSteps {
	private TddAirApplication app = new TddAirApplication();
	private Member member = app.registerCustomer("Doug", "Fresh@yamomma.com");
	private FlightDao flights = new FlightDao();
	int userMileageBefore = 0;
	int userMileageAfter = 0;
	
	@When("^a member takes a flight$")
	public void a_member_takes_a_flight() throws Throwable {
	   
	}
	
	@Then("^that members mileage balance should be accrued$")
	public void that_members_mileage_balance_should_be_accrued() throws Throwable {
		flights=app.getFlights();
		
		userMileageBefore = flights.getFlightMileageByUserName(member.getUsername());
		app.addFlight("SAT", "LAX", 5000, "AA", 123, member.getUsername());
		System.out.println("Dda");
		userMileageAfter = flights.getFlightMileageByUserName(member.getUsername());
		System.out.println("Dd");
		Assert.assertEquals(userMileageBefore, userMileageAfter);
		
	}
	
	@When("^a members mileage balance reaches (\\d+),(\\d+) miles$")
	public void a_members_mileage_balance_reaches_miles(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^members status should change to \"([^\"]*)\"\\.$")
	public void members_status_should_change_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}