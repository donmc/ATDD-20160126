package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class WhenCustomerRegisters {

	TddAirApplication app = new TddAirApplication();	
	String username;;
	String email;
	Member member;
	
	@Before
	public void setup()
	{
		username = "noel";
		email = "noel@usaa.com";
		app.registerCustomer(username, email);
		member = app.lookupMember(username);	
	}
	
	@Test
	public void shouldBeAddedAsMember() {			
		assertNotNull(member);	
	}
	
	@Test
	public void shouldHaveCorrectUsername()
	{
		assertEquals("noel", member.getUsername());
	}
	
	@Test
	public void shouldHaveCorrectEmail()
	{
		assertEquals("noel@usaa.com", member.getEmail());
	}
	
	@Test
	public void shouldHaveRedStatus() {
		assertEquals("Red", member.getStatus());
	}
	
	@Test
	public void shouldHave0YTDMiles() {
		assertEquals(0, member.getYtdMiles());
	}
	
	@Test
	public void shouldHave10KMiles() {
		assertEquals(10000, member.getBalance());
	}



}
