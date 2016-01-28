package com.tddair;

public enum Status {
	Red,
	Green,
	Blue,
	Golden;

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
}
