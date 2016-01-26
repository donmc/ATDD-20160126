package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenFlightInfoInvalid {

	// Test that an exception is thrown on invalid parameter
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowNullOrigin() {
		new Flight(null, "DFW", 200);
	}
	
//	@Test(expected=IllegalArgumentException.class)
//	public void shouldNotAllowInvalidOrigin() {
//		new Flight("SANANTONIO", "DFW", 200);
//	}
	
	@Test
	public void shouldNotAllowInvalidOrigin() {
		try
		{
		new Flight("SANANTO", "DFW", 200);
		fail("Origin OK");
		}
		catch(IllegalArgumentException e)
		{
			assertEquals("Invalid origin code", e.getMessage());
		}
	}
	
//	
//	@Test
//	public void shouldAllowValidOrigin() {
//		new Flight("SAT", "DFW", 200);
//	}
}
