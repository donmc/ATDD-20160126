package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WhenMemberTakesFlight {
	
	private Member member;
	private TddAirApplication app = new TddAirApplication();
	
	@Before
	public void setup() {
		String username = "don";
		String email = "don@improving.com";
		
		app.registerCustomer(username, email);
		
		member = app.lookupMember(username);
		
		app.completeFlight(member.getUsername(), "RG255");
	}

	@Test
	public void shouldHaveYtdMilesUpdated() {
		assertEquals(25000,member.getYtdMiles());		
	}
	
	@Test
	public void shouldHaveBalanceMilesUpdated() {
		assertEquals(35000,member.getBalanceMiles());		
	}
	
	@Test
	public void shouldHaveStatusUpgradedToGreen() {
		assertEquals(Status.Green,member.getStatus());
	}
	
	@Test
	public void shouldHaveStatusUpgradedToBlue() {
		app.completeFlight(member.getUsername(), "RG255");
		
		assertEquals(Status.Blue,member.getStatus());
	}

}
