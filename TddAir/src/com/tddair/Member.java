package com.tddair;

public class Member {
	
	private String username;
	private String Status;
	private int ytdMiles;
	private int balanceMiles;
	
	public Member(String username, String email) {
		this.username = username;
		this.Status = "Red";
		this.ytdMiles = 0;
		this.balanceMiles = 10000;
	}
	public String getUsername() {
		return username;
	}
	public String getStatus() {
		return Status;
	}
	public int getYtdMiles() {
		return ytdMiles;
	}
	public int getBalanceMiles() {
		return balanceMiles;
	}


	
}
