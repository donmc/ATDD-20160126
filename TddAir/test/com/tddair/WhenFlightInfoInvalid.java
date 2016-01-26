package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenFlightInfoInvalid {

	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowNullOrigin() {
		new Flight(null, "DFW", 200);
	} 
	
	@Test
	public void shouldNotAllowInvalidOrigin() {
		try {
			new Flight("SANANTONIO", "DFW", 200);
			fail("Should throw IllegalArgumentException!");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());
		}
		
	}

}
