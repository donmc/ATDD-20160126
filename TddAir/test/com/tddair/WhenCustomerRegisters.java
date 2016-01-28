package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCustomerRegisters {

	private TddAirApplication app;
	private Member member;
	
	@Before
	public void setup()
	{
		// setup
		app = new TddAirApplication(new FakeFlightDAO());
		String username = "don";
		String emailAddress = "don@improving.com";
		
		// exercise
		app.registerCustomer(username, emailAddress);
		
		member = app.lookupMember("don");
	}
	
	@Test
	public void shouldBeAddedAsMember() {
		// verify
		assertNotNull(member);
	}
	
	@Test
	public void shouldHaveCorrectUsername() {
		// verify
		assertEquals("don", member.getUsername());
	}
	
	@Test
	public void shouldHaveRedStatus() {
		// verify
		assertEquals(Status.RED, member.getStatus());
	}
	
	@Test
	public void shouldHaveZeroYTDMiles() {
		// verify
		assertEquals(0, member.getYearToDateMiles());
	}
	
	@Test
	public void shouldHave10000BalanceMiles() {
		// verify
		assertEquals(10000, member.getBalanceMiles());
	}
	
	@Test
	public void shouldRegisterMultipleCustomers()
	{
		app.registerCustomer("bob", "bob@improving.com");
		
		Member bob = app.lookupMember("bob");
		assertEquals("bob@improving.com", bob.getEmailAddress());
	}
	
	@Test(expected=DuplicateUsernameException.class)
	public void shouldThrowExceptionWithDuplicateUsername()
	{
		app.registerCustomer("don", "bob@improving.com");
	}
}
