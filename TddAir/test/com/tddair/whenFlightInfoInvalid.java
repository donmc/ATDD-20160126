package com.tddair;

import static org.junit.Assert.*;

import org.junit.Test;

public class whenFlightInfoInvalid {

	@Test(expected=IllegalArgumentException.class)
	public void testShouldNotAllowNullOrigin() {
		new Flight(null, "DFW", 200);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testShouldNotAllowInvalidOrigin() {
		new Flight("SANasdasd", "SAN", 200);
	}
	
	
}
