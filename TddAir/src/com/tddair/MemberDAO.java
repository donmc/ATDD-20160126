package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

	private Map<String, Member> members = new HashMap<>();

	public MemberDAO()
	{
	}

	public void addMember(String username, String email, String status, int ytdMiles, int balance)
	{
		Member member = new Member();
		member.setUsername(username);
		member.setEmail(email);
		member.setStatus(status);
		member.setYtdMiles(ytdMiles);
		member.setBalance(balance);
		members.put(username, member);
	}
	
	public Member getMember(String username)
	{
		return members.get(username);
	}

}
