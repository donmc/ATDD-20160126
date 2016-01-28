package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenMemberFlies {

	private TddAirApplication app;
	private Member member;

	@Before
	public void setup() {
		app = new TddAirApplication(new FakeFlightDAO());
		app.registerCustomer("don", "don@improving.com");
		app.addFlight("DFW", "DFW", 20000, "TEST", 20000);
		app.addFlight("DFW", "DFW", 45000, "TEST", 45000);
		app.addFlight("DFW", "DFW", 70000, "TEST", 70000);
		app.completeFlight("don", "QF191");
		member = app.lookupMember("don");
	}
	
	@Test
	public void shouldUpgradeToGreen() {
		app.completeFlight("don", "TEST20000");
		assertEquals(Status.GREEN, member.getStatus());
	}

	@Test
	public void shouldUpgradeToBlue() {
		app.completeFlight("don", "TEST45000");
		assertEquals(Status.BLUE, member.getStatus());
	}
	
	@Test
	public void shouldUpgradeToGolden() {
		app.completeFlight("don", "TEST70000");
		assertEquals(Status.GOLDEN, member.getStatus());
	}
}
