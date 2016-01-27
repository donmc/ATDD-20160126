package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private Map<String, Member> members = new HashMap<>();
	
	public MemberDao() {
		//default constructor, do nothing
	}
	
	public Member getMemberByUsername(String username) {
		return members.get(username);
	}
	
	public void addMember(String username, String email) {
		if(members.containsKey(username))
			throw new DuplicateUsernameException("Duplicate Username!");
		members.put(username, new Member(username, email));
	}
}
