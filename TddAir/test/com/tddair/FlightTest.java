package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testGetDestination_WithFlightInfo() {
		// set up
		
		Flight flight = new Flight("SAT", "DFW", 300, "SW", 72);
		// execute
		
		String flightNumber = flight.getFullFlightNumber();
		// verify
		assertEquals("SW72", flightNumber);
	}
	
	@Test
	public void testGetDestination_WithoutFlightInfo() {
		Flight flight = new Flight("SAT", "DFW", 300);
		// execute
		
		String flightNumber = flight.getFullFlightNumber();
		// verify
		assertEquals("UNKNOWN", flightNumber);
	}
	
	@Test
	public void testGetDestination_WithoutFlightAirline() {
		Flight flight = new Flight("SAT", "DFW", 300, null, 72);
		// execute
		
		String flightNumber = flight.getFullFlightNumber();
		// verify
		assertEquals("UNKNOWN", flightNumber);
	}
	
	@Test
	public void testGetDestination_WithoutFlightNumber() {
		Flight flight = new Flight("SAT", "DFW", 300, "SW", 0);
		// execute	
		String flightNumber = flight.getFullFlightNumber();
		// verify
		assertEquals("UNKNOWN", flightNumber);
	}
	
	@Test
	public void testGetFlightInfo()
	{
		// Set up
		Flight flight = new Flight("DFW", "ORD", 920, "AA", 735);
		
		// execute
		String flightInfo = flight.toInfo();
		
		// validate
		assertEquals("AA735 | DFW -> ORD | 920 miles", flightInfo);
		
	}

}
