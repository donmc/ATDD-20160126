package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.tddair.features.TddAirSingleton;

public class WhenMemberCompletesFlight {

	private TddAirApplication app;
	private Member member;
	
	@Before
	public void setup() {
		app = new TddAirApplication(new FakeFlightDao());
		app.registerCustomer("don", "don@improving.com");
		app.addFlight("DFW", "DFW", 25000, "TEST", 25000);
		member = app.lookupMember("don");
	}
	
	@Test
	public void shouldGoFromRedToGreen() {
		app.completeFlight("don", "TEST25000");
		assertEquals(Status.Green, member.getStatus());
	}
	
	@Test
	public void shouldAccumulateMiles() {
		app.completeFlight("don", "TEST25000");
		assertEquals(25000, member.getYtdMiles());
	}
	
	@Test
	public void shouldGoFromGreenToBlue() {
		app.completeFlight("don", "TEST25000");
		app.completeFlight("don", "TEST25000");
		assertEquals(Status.Blue, member.getStatus());
	}

	@Test
	public void shouldGoFromBlueToGold() {
		app.completeFlight("don", "TEST25000");
		app.completeFlight("don", "TEST25000");
		app.completeFlight("don", "TEST25000");
		assertEquals(Status.Gold, member.getStatus());
	}
}
