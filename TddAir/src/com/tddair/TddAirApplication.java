package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights;
	private MemberDao members = new MemberDao();
	
	public TddAirApplication(FlightDao dao) {
		this.flights = dao;
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public void registerCustomer(String username, String email) {
		members.addMember(username, email);
	}

	public Member lookupMember(String username) {
		return members.getMemberByUsername(username);
	}
	
	public void completeFlight(String username, String flightNumber) {
		 Flight flight = flights.getFlightBy(flightNumber);
		 Member member = lookupMember(username);
		 member.completeFlight(flight);
	}

}
