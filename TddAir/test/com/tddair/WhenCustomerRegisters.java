package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WhenCustomerRegisters {

	private Member member;
	private 	TddAirApplication app;

	@Before
	public void setup() {
		app = new TddAirApplication(new FakeFlightDao());
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
	
	@Test
	public void shouldRegisterMoreMembers() {
		app.registerCustomer("bob1", "bob1@bobco.com");
		Member otherMember = app.lookupMember("bob1");
		
		assertEquals("bob1@bobco.com", otherMember.getEmail());
	}
	
	@Test(expected=DuplicateUsernameException.class)
	public void shouldThrowExceptionWithDuplicateUsername() {
		app.registerCustomer("don", "don.mcgreal@something.com");
	}
	

}




