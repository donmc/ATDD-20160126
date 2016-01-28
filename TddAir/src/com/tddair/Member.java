package com.tddair;

public class Member {

	private String username;
	private String emailAddress;
	private Status status;
	private int yearToDateMiles;
	private int balanceMiles;
	private int upgrades;
	
	public Member(String username, String emailAddress)
	{
		this.username = username;
		this.emailAddress = emailAddress;
		this.yearToDateMiles = 0;
		this.balanceMiles = 10000;
		this.status = Status.RED;
		this.upgrades = 0;
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

	public void purchaseUpgradeWithMiles(int numberOfUpgrades) {
		if (balanceMiles >= status.getUpgradeMiles() * numberOfUpgrades)
		{
			balanceMiles -= status.getUpgradeMiles() * numberOfUpgrades;
			upgrades += numberOfUpgrades;
		}
		else
		{
			throw new InsufficientMilesException("Insufficient miles!");
		}
	}

	public int getUpgrades() {
		return upgrades;
	}

	public void purchaseUpgradeWithCard(ICreditAuthorizationSystem cas, String cardNumber, int numberOfUpgrades) {
		if (cas.validate(status.getUpgradeCost() * numberOfUpgrades, cardNumber))
		{
			upgrades += numberOfUpgrades;
		}
	}
}
