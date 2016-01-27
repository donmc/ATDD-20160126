package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenCustomerRegisters2 {


	@Test
	public void duplicateUserShouldError() {
		TddAirApplication app = new TddAirApplication();
		String username = "don";
		String email = "don@improving.com";
		Member member = app.registerCustomer(username, email);
	}
}
