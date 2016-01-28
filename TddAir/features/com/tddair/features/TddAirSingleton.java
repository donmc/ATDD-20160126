package com.tddair.features;

import com.tddair.TddAirApplication;

public class TddAirSingleton {
	private static TddAirApplication instance = new TddAirApplication();
	
	public static TddAirApplication getInstance() {
		return instance;
	}

	public static TddAirApplication newInstance() {
		instance = new TddAirApplication();
		return instance;
	}
}
