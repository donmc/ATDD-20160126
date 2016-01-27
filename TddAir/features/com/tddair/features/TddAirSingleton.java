package com.tddair.features;

import com.tddair.TddAirApplication;

public class TddAirSingleton {
	private static TddAirApplication instance = new TddAirApplication();
	
	public static TddAirApplication getInstance() {
		return instance;
	}
}
