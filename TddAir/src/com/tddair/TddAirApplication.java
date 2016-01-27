package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDao members = new MemberDao();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public void registerCustomer(String username, String emailAddress) {
		members.registerCustomer(username, emailAddress);
	}

	public Member lookupMember(String username) {
		return members.lookupMember(username);
	}

	public void completeFlight(String username, String flightNumber) {
		Flight flight = flights.getFlightBy(flightNumber);
		members.completeFlight(username, flight);
	}
}
