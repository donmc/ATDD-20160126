package com.tddair;

public class CASSpy implements ICreditAuthorizationSystem {

	private int amount;
	
	@Override
	public boolean validate(int amount, String cardNumber) {
		boolean validationStatus = false;
		this.amount = amount;
		
		if (cardNumber != null && cardNumber.length() == 16)
		{
			validationStatus = true;
		}
		else
		{
			throw new InvalidCardException();
		}
		
		return validationStatus;
	}

	public int getAmount() {
		return amount;
	}
}
