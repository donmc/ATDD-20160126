package com.tddair.features;

import com.tddair.FakeFlightDao;
import com.tddair.TddAirApplication;

public class TddAirSingleton {
	
	private static TddAirApplication instance = newInstance();
	
	public static TddAirApplication getInstance() {
		return instance;
	}
	
	public static TddAirApplication newInstance() {
		return instance = new TddAirApplication(new FakeFlightDao());
	}
}
