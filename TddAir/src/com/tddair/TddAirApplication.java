package com.tddair;

import java.util.HashMap;
import java.util.Map;


public class TddAirApplication {
	
	private FlightDao flights = new FlightDao();
	private MemberDao members = new MemberDao();
	
	public TddAirApplication() {
	} 
	
	public void addFlight(String origin, String destination, int mileage, String airline, int number) {
		flights.addFlight(origin, destination, mileage, airline, number);
	}

	public void registerCustomer(String username, String email) {
		members.registerCustomer(username, email);
	}

	public Member lookupMember(String username) {
		return members.lookupMember(username);
	}

	public void completeFlight(String string, String string2) {
		// TODO Auto-generated method stub
		
	} 
}
