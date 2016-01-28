package com.tddair;

public interface IFlightDAO {

	public Flight getFlightBy(String flightNumber);

	public void addFlight(String origin, String destination,
			int mileage, String airline, int number);

}