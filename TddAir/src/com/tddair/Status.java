package com.tddair;

public enum Status {
	RED,
	GREEN,
	BLUE,
	GOLDEN;

	public static Status getStatus(int yearToDateMiles) {
		Status status;
		
		if (yearToDateMiles <= 25000) {
			status = RED;
		} else if (yearToDateMiles <= 50000) {
			status = GREEN;
		} else if (yearToDateMiles <= 75000) {
			status = BLUE;
		} else {
			status = GOLDEN;
		}
		
		return status;
	}
}
