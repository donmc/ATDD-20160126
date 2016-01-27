package com.tddair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testGetFullFlightNumber_WithFlightInfo() {
		//setup
		Flight flight = new Flight("SAT", "DFW", 300, "SW", 72);
		
		
		//exercise
		String flightNumber = flight.getFullFlightNumber();
		assertEquals("SW72", flightNumber);
		
		
		//teardown
		
		
	}
	

	@Test
	public void testGetFullFlightNumber_WithoutFlightInfo() {
		Flight flight = new Flight("SAT", "DFW", 300);
		String flightNumber = flight.getFullFlightNumber();
		assertEquals("UNKNOWN", flightNumber);
		
		
	}

	
	@Test
	public void testFlightConstructor() {
		try {
			Flight flight = new Flight("SATo", "DFW", 300, "SW", 72);
			fail("Should have thrown Exception");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Invalid origin code");
		}
		
		try {
			Flight flight = new Flight(null, "DFW", 300, "SW", 72);
			fail("Should have thrown Exception");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Invalid origin code");
		}
		
		
		
		try {
			Flight flight = new Flight("SAT", "DF", 300, "SW", 72);
			fail("Should have thrown Exception");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Invalid destination code");
		}
		
		try {
			Flight flight = new Flight("SAT", null, 300, "SW", 72);
			fail("Should have thrown Exception");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Invalid destination code");
		}
		
		
		
		try {
			Flight flight = new Flight("SAT", "DFW", 30, "SW", 72);
			fail("Should have thrown Exception");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Mileage muse be greater than 100");
		}
		
	}
	
	
	@Test
	public void testReturnFlightInfo(){
		Flight flight = new Flight("SAT", "DFW", 300, "SW", 72);
		String flightInfo = flight.getFlightInfo();
		
		assertEquals(flightInfo, "SW72 | SAT -> DFW | 300 miles");
	}
	
	
	
	@Test
	public void TestGetFullFlightNumber(){
		Flight flight = new Flight("SAT", "DFW", 300, null, 72);
		assertEquals("UNKNOWN", flight.getFullFlightNumber());
		
		Flight flight2 = new Flight("SAT", "DFW", 300, "SW", 0);
		assertEquals("UNKNOWN", flight2.getFullFlightNumber());
		
	}
	
	
	
	
}
