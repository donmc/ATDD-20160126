package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<String, Member>();

	public void registerCustomer(String username, String emailAddress) {
		if (members.containsKey(username)) {
			throw new DuplicateUsernameException("Duplicate username!");
		}
		Member member = new Member(username, emailAddress);
		members.put(username, member);
	}

	public Member lookupMember(String username) {
		
		return members.get(username);
	}

	public void completeFlight(String username, Flight flight) {
		Member member = lookupMember(username);
		member.completeFlight(flight);
	}
	
}
