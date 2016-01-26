package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlightTest {
	
	private Flight flight;
	
	@Before
	public void setup() {
		flight = new Flight("DFW", "ORD", 920, "AA", 735);
	}

	@Test
	public void testGetFullFlightNumber_WithFlightInfo() {
		//setup
		//execute
		String flightNumber = flight.getFullFlightNumber();
		
		//verify
		assertEquals("AA735", flightNumber);
	}
	
	@Test
	public void testGetFullFlightNumber_WithoutFlightInfo() {
		Flight flight = new Flight("SAT", "DFW", 300);
		
		String flightNumber = flight.getFullFlightNumber();
		
		assertEquals("UNKNOWN", flightNumber);
	}
	
	@Test
	public void testGetFlightInfo_WithAllInfo() {
		String flightInfo = flight.getInfo();
		
		assertEquals("AA735 | DFW -> ORD | 920 miles", flightInfo);
	}

}
