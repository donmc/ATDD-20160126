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

		// exercise
		String FlightNumber = flight.getFullFlightNumber();

		// verify
		assertEquals("AA735", FlightNumber);
	}

	@Test
	public void testGetFullFlightNumber_WithOutFlightInfo() {

		// setup
		flight = new Flight("DFW", "ORD", 920);

		// exercise
		String FlightNumber = flight.getFullFlightNumber();

		// verify
		assertEquals("UNKNOWN", FlightNumber);
	}

	@Test
	public void testGetFlightInfo() {

		// exercise
		String flightInfo = flight.getInfo();

		// verify
		assertEquals("AA735 | DFW -> ORD | 920 miles", flightInfo);
	}

}
