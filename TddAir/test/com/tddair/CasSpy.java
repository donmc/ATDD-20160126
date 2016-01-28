package com.tddair;

public class CasSpy implements CAS {

	
	public static final String VALID_CC = "1111111111111111";
	public static final String INVALID_CC = "9999999999999999";
	private int chargedAmount;

	/* (non-Javadoc)
	 * @see com.tddair.CAS#validate(int, java.lang.String)
	 */
	@Override
	public boolean validate(int amount, String ccNum) {
		this.setChargedAmount(amount);
		return true;
	}

	public int getChargedAmount() {
		return chargedAmount;
	}

	public void setChargedAmount(int chargedAmount) {
		this.chargedAmount = chargedAmount;
	}
}
