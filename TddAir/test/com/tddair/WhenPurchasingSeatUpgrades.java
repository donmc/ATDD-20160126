package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WhenPurchasingSeatUpgrades {

	private Member member;
	private CASSpy cas;
	
	@Before
	public void setup() {
		member = new Member("bob", "bob@improving.com");
		cas = new CASSpy();
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_RED() {
		member.purchaseUpgradeWithMiles(1);
		
		assertEquals(1, member.getUpgrades());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_GREEN() {
		member.completeFlight(new Flight("DFW", "TST", 25000));
		
		member.purchaseUpgradeWithMiles(1);
		
		assertEquals(26000, member.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_BLUE() {
		member.completeFlight(new Flight("DFW", "TST", 50000));
		
		member.purchaseUpgradeWithMiles(1);
		
		assertEquals(52000, member.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_GOLDEN() {
		member.completeFlight(new Flight("DFW", "TST", 75000));
		
		member.purchaseUpgradeWithMiles(1);
		
		assertEquals(78000, member.getBalanceMiles());
	}
	
	@Test(expected=InsufficientMilesException.class)
	public void shouldThrowExceptionForInsufficientMiles() {
		member.purchaseUpgradeWithMiles(2);
	}
	
	@Test
	public void shouldPurchaseMultipleUpgradesWithMiles() {
		member.completeFlight(new Flight("DFW", "TST", 10000));
		
		member.purchaseUpgradeWithMiles(2);
		
		assertEquals(2, member.getUpgrades());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_RED() {
		member.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, member.getUpgrades());
		assertEquals(100, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_GREEN() {
		member.completeFlight(new Flight("DFW", "TST", 25000));
		
		member.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, member.getUpgrades());
		assertEquals(90, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_BLUE() {
		member.completeFlight(new Flight("DFW", "TST", 50000));
		
		member.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, member.getUpgrades());
		assertEquals(75, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_GOLDEN() {
		member.completeFlight(new Flight("DFW", "TST", 75000));
		
		member.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, member.getUpgrades());
		assertEquals(60, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseMultipleUpgradesWithCard_RED() {
		member.purchaseUpgradeWithCard(cas, "1234123412341234", 2);
		
		assertEquals(2, member.getUpgrades());
		assertEquals(200, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseMultipleUpgradesWithCard_GOLDEN() {
		member.completeFlight(new Flight("DFW", "TST", 75000));
		
		member.purchaseUpgradeWithCard(cas, "1234123412341234", 2);
		
		assertEquals(2, member.getUpgrades());
		assertEquals(120, cas.getAmount());
	}
	
	@Test(expected=InvalidCardException.class)
	public void shouldThrowExceptionForInvalidCard() {
		member.purchaseUpgradeWithCard(cas, "1234", 1);
	}
}
