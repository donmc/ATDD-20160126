package com.tddair;

public class Member {

	private String username;
	private String emailAddress;
	private Status status;
	private int yearToDateMiles;
	private int balanceMiles;
	
	public Member(String username, String emailAddress)
	{
		this.username = username;
		this.emailAddress = emailAddress;
		this.yearToDateMiles = 0;
		this.balanceMiles = 10000;
		this.status = Status.RED;
	}
	
	public String getUsername() {
		return username;
	}

	public Status getStatus() {
		return status;
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
		status = Status.getStatusForMiles(yearToDateMiles);
	}
}
