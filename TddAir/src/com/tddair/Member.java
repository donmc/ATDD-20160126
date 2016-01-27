package com.tddair;

public class Member {

	private String username;
	private String emailAddress;
	private Category category;
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

	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
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
