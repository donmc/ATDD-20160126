package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


public class WhenCustomerRegisters {
	String username;
	String email;
	TddAirApplication app = new TddAirApplication();
	Member member = new Member();
	
	@Before
	public void setupVariables() {
		username = "don";
		email = "don@improving.com";
		member = app.registerCustomer(username, email);
//		member = app.lookupMember(username);
	}
	
	@Test
	public void shouldBeAddedAsMember() {
		assertNotNull(member);
	}
	
	
	@Test
	public void shouldHaveRedStatus() {	
		assertEquals("Red", member.getStatus());
		
	}
	
		
	@Test
	public void shouldHaveZeroYTDMiles() {		
		assertEquals(0, member.getYTDMiles());
	}

	@Test
	public void shouldHave10kBalanceMiles() {		
		assertEquals(10000, member.getMileage());

	}
	
	
}
