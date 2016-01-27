package com.tddair;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FlightDao {

	private Map<String, Flight> flights = new HashMap<>();
	
	public FlightDao() {
//		addFlight("DFW", "ORD", 924, "AA", 242, dOUG);
//		addFlight("LGA", "CDG", 3620, "AF", 38);
//		addFlight("LAX", "SYD", 7490, "QF", 191);
	}
	
	public Flight getFlightByFlightNumber(String flightNumber) {
		return flights.get(flightNumber);
	}
	
	public int getFlightMileageByUserName(String userName) {
		int totalMileage = 0;
		
		if (userName != null){
			if (!flights.isEmpty() && flights.size() > 0 && flights != null){
				
				for (int x = 0; x < flights.size(); x++){
					if (flights.containsValue(x)){
						if (!flights.get(x).equals(null) && flights.get(x) != null){
							System.out.println("Flights username:");
							if (flights.get(x).getUsername().equals(userName)){
								totalMileage = totalMileage + flights.get(x).getMileage();	
							}
						}
					}
				}
			}
		}
		return totalMileage;
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number, String userName) {
		Flight flight = new Flight(origin, destination, mileage, airline, number, userName);
		flights.put(flight.getFullFlightNumber(), flight);
	}
}
