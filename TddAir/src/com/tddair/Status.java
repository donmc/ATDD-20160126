package com.tddair;

public enum Status {
	RED(0, 10000, 100),
	GREEN(25000, 9000, 90),
	BLUE(50000, 8000, 75),
	GOLDEN(75000, 7000, 60);

	private int threshold;
	private int upgradeMiles;
	private int upgradeCost;
	
	private Status (int threshold, int upgradeMiles, int upgradeCost)
	{
		this.threshold = threshold;
		this.upgradeMiles = upgradeMiles;
		this.upgradeCost = upgradeCost;
	}
	
	public static Status getStatusForMiles(int yearToDateMiles) {
		Status status = RED;
		
		if (yearToDateMiles >= GOLDEN.threshold) {
			status = GOLDEN;
		} else if (yearToDateMiles >= BLUE.threshold) {
			status = BLUE;
		} else if (yearToDateMiles >= GREEN.threshold) {
			status = GREEN;
		}
		
		return status;
	}

	public int getUpgradeMiles() {
		return upgradeMiles;
	}

	public int getUpgradeCost() {
		return upgradeCost;
	}
}
