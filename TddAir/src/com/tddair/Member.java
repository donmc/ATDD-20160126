package com.tddair;

public class Member {

	private String username;
	private String emailAddress;
	private String category;
	
	public Member(String username, String emailAddress)
	{
		this.username = username;
		this.emailAddress = emailAddress;
	}
	
	public String getUsername() {
		return username;
	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
}
