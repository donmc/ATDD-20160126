package com.tddair.features;

import static org.junit.Assert.assertEquals;

import com.tddair.Member;
import com.tddair.Status;
import com.tddair.TddAirApplication;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrackFlightsSteps
{
    private TddAirApplication app = new TddAirApplication();
    private Member            member;

    @Given("^a customer registers with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void a_customer_registers_with_and(String username, String email) throws Throwable
    {
        app.registerCustomer(username, email);
        member = app.lookupMember(username);
    }

    @When("^member \"([^\"]*)\" takes flight \"([^\"]*)\"$")
    public void member_takes_flight(String username, String flightNumber) throws Throwable
    {
        int miles = app.getFlightMiles(flightNumber);
        member.travelMiles(miles);
    }

    @Then("^that member has \"([^\"]*)\" status$")
    public void that_member_has_status(String status) throws Throwable
    {
        assertEquals(Status.valueOf(status), member.getStatus());
    }

    @Then("^that member has (\\d+) ytd miles$")
    public void that_member_has_ytd_miles(int miles) throws Throwable
    {
        assertEquals(miles, member.getYtdMiles());
    }

    @Then("^that member has (\\d+) balance miles$")
    public void that_member_has_balance_miles(int miles) throws Throwable
    {
        assertEquals(miles, member.getBalanceMiles());
    }

    @Given("^has (\\d+) ytd miles and (\\d+) balance miles$")
    public void has_ytd_miles_and_balance_miles(int ytdMiles, int balanceMiles) throws Throwable
    {
        member.setBalanceMiles(balanceMiles);
        member.setYtdMiles(ytdMiles);
    }
}
