package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class FakeFlightDAO implements IFlightDAO {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FakeFlightDAO() {
		addFlight("DFW", "ORD", 924, "AA", 242);
		addFlight("LGA", "CDG", 3620, "AF", 38);
		addFlight("LAX", "SYD", 7490, "QF", 191);
	}
	
	@Override
	public Flight getFlightBy(String flightNumber) {
		return flights.get(flightNumber);
	}
	
	@Override
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		Flight flight = new Flight(origin, destination, mileage, airline, number);
		flights.put(flight.getFullFlightNumber(), flight);
	}
}
