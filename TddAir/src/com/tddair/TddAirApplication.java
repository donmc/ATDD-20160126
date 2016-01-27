package com.tddair;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	
	public TddAirApplication() {
	}
	
	public FlightDao getFlights(){
		return this.flights;
	}
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number, String userName) {
		flights.addFlight(origin, destination, mileage, airline, number, userName);
	}

	public Member registerCustomer(String username, String email) {
		if (lookupMember(username) != null){
			
		}
		Member member = new Member();
		member.setUsername(username);
		member.setStatus("Red");
		member.setMileage(10000);
		member.setYTDMiles(0);
		return member;
	}

	public Member lookupMember(String username) {
		if (username.equals("don")){
			Member don = new Member();
			return don;
		}
		return null;
	}
	
	
}
