package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<>();
	
	public MemberDao() {
		//default constructor, do nothing
		addMember("Randall","randall.beatty@usaa.com");
		addMember("Joseph","joseph.mallory@usaa.com");
	}
	
	public Member getMemberByUsername(String username) {
		return members.get(username);
	}
	
	public void addMember(String username, String email) {
		Member member = new Member(username, email);
		members.put(username, member);
	}
}
