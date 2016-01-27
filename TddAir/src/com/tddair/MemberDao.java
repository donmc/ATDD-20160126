package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<>();

	public void registerCustomer(String username, String email) {
		if (members.containsKey(username)) {
			throw new DuplicateUsernameException("Duplicate Username!");
		}
		Member member = new Member(username, email);
		members.put(username, member);
	}

	public Member lookupMember(String username) {
		return members.get(username);
	}
}
