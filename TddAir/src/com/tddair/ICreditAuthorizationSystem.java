package com.tddair;

public interface ICreditAuthorizationSystem {

	public boolean validate(int amount, String cardNumber);

}