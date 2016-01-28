package com.tddair.features;

import com.tddair.FakeFlightDAO;
import com.tddair.TddAirApplication;

public class TddAirSingleton {
	private static TddAirApplication instance = newInstance();
	
	public static TddAirApplication getInstance() {
		return instance;
	}

	public static TddAirApplication newInstance() {
		instance = new TddAirApplication(new FakeFlightDAO());
		return instance;
	}
}
