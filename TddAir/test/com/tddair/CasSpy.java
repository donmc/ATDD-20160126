package com.tddair;

public class CasSpy implements ICreditAuthorizationSystem {

	private int amount;
	
	@Override
	public boolean validate(int amount, String cardNumber) {
		boolean validationStatus = false;
		this.amount = amount;
		
		if (amount >= 250) {
			throw new InsufficientFundsException("Insufficient funds!");
		} else if (cardNumber != null && cardNumber.length() == 16) {
			validationStatus = true;
		} else {
			throw new InvalidCardException("Invalid card number!");
		}
		
		return validationStatus;
	}

	public int getAmount() {
		return amount;
	}
}
