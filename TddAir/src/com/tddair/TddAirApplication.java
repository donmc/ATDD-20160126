package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	Member m;
	
	public TddAirApplication() {
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public void registerCustomer(String username, String email) {
		m = new Member(username,email);
		
	}

	public Member lookUpMember(String username) {
		
		return m;
	}

	public void statusCustomer(String status) {
		// TODO Auto-generated method stub
		
	}

	
}
