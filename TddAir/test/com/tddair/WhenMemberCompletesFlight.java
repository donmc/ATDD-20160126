package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenMemberCompletesFlight {

	private TddAirApplication app = new TddAirApplication();
	private Member member;
	
	@Before
	public void setup() {
		app.registerCustomer("don", "don@improving.com");
		app.addFlight("DFW", "DFW", 25000, "TEST", 25000);
		member = app.lookupMember("don");
	}
	
	@Test
	public void shouldGoFromRedToGreen() {
		app.completeFlight("don", "TEST25000");
		assertEquals(Status.Green, member.getStatus());
	}

}
