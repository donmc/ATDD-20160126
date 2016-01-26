package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FlightTest
{
    private Flight flight;

    @Before
    public void setUp()
    {
        flight = new Flight("DFW", "ORD", 920, "AA", 735);
    }

    @Test
    public void testGetFullFlightNumber_WithFlightInfo()
    {
        Flight flight = new Flight("SAT", "DFW", 300, "AI", 1);
        assertEquals("AI1", flight.getFullFlightNumber());
    }

    @Test
    public void testGetFullFlightNumber_WithOutFlightInfo()
    {
        Flight flight = new Flight("SAT", "DFW", 300);
        assertEquals("UNKNOWN", flight.getFullFlightNumber());
    }

    @Test
    public void testGetFlightInfo()
    {
        String flightInfo = flight.getInfo();
        assertEquals("AA735 | DFW -> ORD | 920 miles", flightInfo);
    }
}
