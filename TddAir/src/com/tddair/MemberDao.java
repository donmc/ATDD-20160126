package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<String, Member>();

	public void addMember(Member member) {
		members.put(member.getUsername(), member);
	}

	public Member getMemberByUsername(String username) {
		
		return members.get(username);
	}
	
}
