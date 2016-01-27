package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<String, Member>();

	public void registerCustomer(String username, String emailAddress) {
		members.put(username, new Member(username, emailAddress));
	}

	public Member lookupMember(String username) {
		
		return members.get(username);
	}
	
}
