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
			fail("Should throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());
		}
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowNullDestination() {
		new Flight("DFW", null, 200);
	}
	
	@Test
	public void shouldNotAllowInvalidDestination() {
		try {
			new Flight("DFW", "SANANTONIO", 200);
			fail("Should throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid destination code", e.getMessage());
		}
	}
	
	@Test
	public void shouldNotAllowShortFlight() {
		try {
			new Flight("SAT", "AUS", 90);
			fail("Should throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Mileage muse be greater than 100", e.getMessage());
		}
	}
}
