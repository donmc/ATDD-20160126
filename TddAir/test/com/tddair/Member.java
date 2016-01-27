package com.tddair;

public class Member {
	String username;
	String status;
	private int mileage;
	private int YTDMiles;
	
		
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMileage(int i) {
		this.mileage = i;
		
	}

	public Object getMileage() {
		return mileage;
	}

	public Object getYTDMiles() {
		return YTDMiles;
	}

	public void setYTDMiles(int i) {
		this.YTDMiles = i;
		
	}
	
}
