package com.tddair;

public class CasSpy implements ICreditAuthorizationSystem {

	public static String VALID_CC = "1234123412341234";
	public static String INVALID_CC = "1234";
	private int amount;
	
	@Override
	public boolean validate(int amount, String cardNumber) {
		boolean validationStatus = false;
		this.amount = amount;
		
		if (amount >= 250) {
			throw new InsufficientFundsException("Insufficient funds!");
		} else if (INVALID_CC.equals(cardNumber)) {
			throw new InvalidCardException("Invalid card number!");
		} else if (VALID_CC.equals(cardNumber)){
			validationStatus = true;
		}
		
		return validationStatus;
	}

	public int getAmount() {
		return amount;
	}
}
