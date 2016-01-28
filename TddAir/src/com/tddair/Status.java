package com.tddair;

public enum Status {
	Red(10000,100),
	Green(9000,90),
	Blue(8000,75),
	Golden(7000,60);

	private int upgradeCostDollars;
	private int upgradeCostMiles;
	
	private Status(int upgradeCostMiles, int upgradeCostDollars) {
		this.upgradeCostMiles = upgradeCostMiles;
		this.upgradeCostDollars = upgradeCostDollars;
	}
	
	public static Status getStatusFor(int ytdMiles) {
		Status status = Red;
		
		if( ytdMiles >= 25000 && ytdMiles < 50000) {
			status = Green;
		} else if ( ytdMiles >= 50000 && ytdMiles < 75000) {
			status = Blue;
		} else if ( ytdMiles >= 75000 ) {
			status = Golden;
		}
		
		return status;
	}

	public int getUpgradeCostMiles() {
		return upgradeCostMiles;
	}

	public int getSeatUpgradeCostDollars() {
		return upgradeCostDollars;
	}
}
