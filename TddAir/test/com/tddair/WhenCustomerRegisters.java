package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCustomerRegisters {

	private TddAirApplication app;
	
	@Before
	public void registerCustomer()
	{
		// setup
		app = new TddAirApplication();
		String username = "don";
		String emailAddress = "don@improving.com";
		
		// exercise
		app.registerCustomer(username, emailAddress);
	}
	
	@Test
	public void shouldBeAddedAsMember() {
		// verify
		Member member = app.lookupMember("don");
		assertNotNull(member);
	}
	
	@Test
	public void shouldHaveCorrectUsername() {
		// verify
		Member member = app.lookupMember("don");
		assertEquals("don", member.getUsername());
	}
	
	@Test
	public void shouldHaveRedStatus() {
		// verify
		Member member = app.lookupMember("don");
		assertEquals(Category.RED, member.getCategory());
	}
	
	@Test
	public void shouldHaveZeroYTDMiles() {
		// verify
		Member member = app.lookupMember("don");
		assertEquals(0, member.getYearToDateMiles());
	}
	
	@Test
	public void shouldHave10000BalanceMiles() {
		// verify
		Member member = app.lookupMember("don");
		assertEquals(10000, member.getBalanceMiles());
	}

}
