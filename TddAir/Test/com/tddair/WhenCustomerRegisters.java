package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCustomerRegisters {

	private Member member;
	private TddAirApplication app;

	@Before
	public void setup() {
		// setup
		app = new TddAirApplication();

		// exercise
		String username = "srini";
		String email = "srini@test.com";
		app.registerCustomer(username, email);

		member = app.lookUpMember(username);
	}

	@Test
	public void shouldBeAddedAsMember() {

		// verify
		assertNotNull(member);

	}

	@Test
	public void shouldHaveCorrectUsername() {

		// verify
		assertEquals("srini", member.getUsername());

	}

	@Test
	public void shouldHaveRedStatus() {

		// verify
		assertEquals("Red", member.getStatus());
	}

	@Test
	public void shouldHave0YtdMiles() {

		// verify
		assertEquals("0", member.getYtdMiles());
	}

	@Test
	public void shouldHave10000BalanceMiles() {

		assertEquals("10000", member.getBalanceMiles());
	}

	@Ignore
	@Test
	public void shouldRegisterMoreMembers() {

		assertEquals("10000", member.getBalanceMiles());
	}
	

}


