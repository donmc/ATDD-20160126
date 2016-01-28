package com.tddair;

public class Member {

	private String username;
	private Status status;
	private int ytdMiles;
	private int balanceMiles;
	private String email;

	public Member(String username, String email) {
		this.username = username;
		this.status = Status.Red;
		this.ytdMiles = 0;
		this.balanceMiles = 10000;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public Status getStatus() {
		return status;
	}

	public int getYtdMiles() {
		return ytdMiles;
	}

	public int getBalanceMiles() {
		return balanceMiles;
	}

	public String getEmail() {
		return email;
	}

	public void completeFlight(Flight flight) {
		
		ytdMiles += flight.getMileage();
		balanceMiles += flight.getMileage();
		status = Status.getStatusFor(ytdMiles);
	}

}
