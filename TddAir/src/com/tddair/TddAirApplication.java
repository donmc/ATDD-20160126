package com.tddair;



public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDAO members = new MemberDAO();
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public void registerCustomer(String username, String email) {
		members.addMember(username, email, "Red", 0, 10000);
	}

	public Member lookupMember(String username) {
		return members.getMember(username);
	}
}
