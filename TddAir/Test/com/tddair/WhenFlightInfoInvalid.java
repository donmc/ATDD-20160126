package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenFlightInfoInvalid {

	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAllowNullOrigin() {

		new Flight(null, "DFW", 200);
	}

	@Test
	public void shouldNotAllowInvalidOrigin() {

		// setup
		try {
			new Flight("SANANTONIO", "DFW", 200);
			fail("Should throw IllgalArgumentsException!");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());

		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAllowNullDestination() {

		new Flight("SAT", null, 200);
	}

	@Test
	public void shouldNotAllowInvalidDestination() {

		// setup
		try {
			new Flight("SAT", "DEFEW", 200);
			fail("Should throw IllgalArgumentsException!");
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid origin code", e.getMessage());

		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAllowInvalidMileage() {

		new Flight("SAT", "DFW", 99);
	}
}
