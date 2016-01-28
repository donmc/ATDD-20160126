package com.tddair;

public enum Status {
	RED(0),
	GREEN(25000),
	BLUE(50000),
	GOLDEN(75000);

	private int threshold;
	
	private Status (int threshold)
	{
		this.threshold = threshold;
	}
	
	public static Status getStatusForMiles(int yearToDateMiles) {
		Status status = RED;
		
		if (yearToDateMiles > GOLDEN.threshold) {
			status = GOLDEN;
		} else if (yearToDateMiles > BLUE.threshold) {
			status = BLUE;
		} else if (yearToDateMiles > GREEN.threshold) {
			status = GREEN;
		}
		
		return status;
	}
}
