package com.tddair;

public class Member {

	private String username;
	private String emailAddress;
	private int yearToDateMiles;
	private int balanceMiles;
	
	public Member(String username, String emailAddress)
	{
		this.username = username;
		this.emailAddress = emailAddress;
		this.yearToDateMiles = 0;
		this.balanceMiles = 10000;
	}
	
	public String getUsername() {
		return username;
	}

	public Status getStatus() {
		return Status.getStatus(yearToDateMiles);
	}

	public int getYearToDateMiles() {
		return yearToDateMiles;
	}

	public int getBalanceMiles() {
		return balanceMiles;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void completeFlight(Flight flight) {
		balanceMiles += flight.getMileage();
		yearToDateMiles += flight.getMileage();
	}
}
