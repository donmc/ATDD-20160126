package com.tddair;

public class Member {
	
	private String username;
	private String email;
	private String Status;
	private String miles;
	private String balance;
	
	public Member(String username, String email) {
		this.username = username;
		this.email = email;
		this.Status = "Red";
		this.miles = "0";
		this.balance = "10000";
	}
	public String getUsername() {
		return username;
	}
	//public void setUsername(String username) {
		//this.username = username;
	//}
//	public String getEmail() {
//		return email;
//	}
	//public void setEmail(String email) {
		//this.email = email;
	//}
	public String getStatus() {
		return Status;
	}
	//public void setStatus(String status) {
		//Status = status;
	//}
	public Object getMiles() {
		// TODO Auto-generated method stub
		return miles;
	}
	public Object getBalanceMiles() {
		// TODO Auto-generated method stub
		return balance;
	}


	
}
