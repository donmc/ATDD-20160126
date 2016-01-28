package com.tddair;

public class Member {
	
	private String username;
	private String email;
	private Status status;
	private int ytdMiles;
	private int balanceMiles;
	
	public Member(String username, String email) {
		this.setUsername(username);
		this.setEmail(email);
		this.setStatus(Status.Red);
		this.setYtdMiles(0);
		this.setBalanceMiles(10000);
	}
	
	public void completeFlight(Flight flight) {
		setYtdMiles(ytdMiles += flight.getMileage());
		setBalanceMiles(balanceMiles += flight.getMileage());
		
		status = Status.getStatusFor(getYtdMiles());
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String status) {
		this.email = status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public int getYtdMiles() {
		return ytdMiles;
	}

	public void setYtdMiles(int ytdMiles) {
		this.ytdMiles = ytdMiles;
	}

	public int getBalanceMiles() {
		return balanceMiles;
	}

	public void setBalanceMiles(int balanceMiles) {
		this.balanceMiles = balanceMiles;
	}
	
}
