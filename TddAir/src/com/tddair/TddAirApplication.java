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
		Member member = new Member(username, emailAddress);
		member.setCategory("Red");
		members.addMember(member);
	}

	public Member lookupMember(String username) {
		Member member = members.getMemberByUsername(username);
		return member;
	}
}
