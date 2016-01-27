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
	}
	
	public String getUsername() {
		return username;
	}

	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	public int getYearToDateMiles() {
		return yearToDateMiles;
	}
	
	public void setYearToDateMiles(int yearToDateMiles) {
		this.yearToDateMiles = yearToDateMiles;
	}

	public int getBalanceMiles() {
		return balanceMiles;
	}
	
	/**
	 * Add miles to the member's miles balance.
	 * 
	 * @param additionalMiles
	 */
	public void addBalanceMiles(int additionalMiles) {
		balanceMiles = balanceMiles + additionalMiles;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
