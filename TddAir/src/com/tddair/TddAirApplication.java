package com.tddair;

public class TddAirApplication {

	private IFlightDAO flights;
	private MemberDao members = new MemberDao();

	public TddAirApplication(IFlightDAO flightDao) {
		this.flights = flightDao;
	}

	public void addFlight(String origin, String destination, int mileage,
			String airline, int number) {
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
		Member member = lookupMember(username);
		member.completeFlight(flight);
	}
}
