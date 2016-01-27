package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCustomerRegisters {

	private Member member;
	
	@Before
	public void setup() {
	// setup
	TddAirApplication app = new TddAirApplication();

	// exercise
	String username = "srini";
	String email = "srini@test.com";
	app.registerCustomer(username, email);

	// verify
	member = app.lookUpMember(username);
	}
	
	@Test
	public void shouldBeAddedAsMember() {
		
		assertNotNull(member);

	}

	@Test
	public void shouldHaveCorrectUsername() {

		

		// verify
		assertEquals("srini", member.getUsername());

	}

	@Test
	public void shouldHaveRedStatus() {

		assertEquals("Red", member.getStatus());
	}

	@Test
	public void shouldHave0YtdMiles() {
		assertEquals("0", member.getMiles());
	}

	@Test
	public void shouldHave10000BalanceMiles() {
		assertEquals("10000", member.getBalanceMiles());
	}
}
