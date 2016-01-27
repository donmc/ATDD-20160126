package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class WhenCustomerRegisters {
	
	private Member member;
	
	@Before
	public void setup() {
		TddAirApplication app = new TddAirApplication();
		String username = "don";
		String email = "don@improving.com";
		
		app.registerCustomer(username, email);
		
		member = app.lookupMember(username);
	}

	@Test
	public void shouldBeAddedAsMember() {
		assertNotNull(member);
	}
	

	@Test
	public void shouldHaveCorrectUsername() {
		assertEquals("don", member.getUsername());
	}
	
	@Test
	public void shouldHaveCorrectEmail() {
		assertEquals("don@improving.com", member.getEmail());
	}
	
	
	@Test
	public void shouldHaveRedStatus() {
		assertEquals(Status.Red, member.getStatus());
	}
	
	@Test
	public void shouldHave0YtdMiles() {
		assertEquals(0, member.getYtdMiles());
	}
	
	@Test
	public void shouldHave10000BalanceMiles() {
		assertEquals(10000, member.getBalanceMiles());
		
	}

}
