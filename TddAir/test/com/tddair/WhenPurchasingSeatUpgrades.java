package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WhenPurchasingSeatUpgrades {

	private Member redGuy;
	private Member greenGuy;
	private Member blueGuy;
	private Member goldenGuy;
	private CasSpy cas;
	
	@Before
	public void setup() {
		redGuy = new Member("red", "red@improving.com");
		redGuy.completeFlight(new Flight("DFW", "TST", 10000));
		
		greenGuy = new Member("green", "green@improving.com");
		greenGuy.completeFlight(new Flight("DFW", "TST", 25000));
		
		blueGuy = new Member("blue", "blue@improving.com");
		blueGuy.completeFlight(new Flight("DFW", "TST", 50000));
		
		goldenGuy = new Member("golden", "golden@improving.com");
		goldenGuy.completeFlight(new Flight("DFW", "TST", 75000));
		
		cas = new CasSpy();
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_RED() {
		redGuy.purchaseUpgradeWithMiles(1);
		
		assertEquals(1, redGuy.getUpgrades());
		assertEquals(10000, redGuy.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_GREEN() {
		greenGuy.purchaseUpgradeWithMiles(1);
		
		assertEquals(1, greenGuy.getUpgrades());
		assertEquals(26000, greenGuy.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_BLUE() {
		blueGuy.purchaseUpgradeWithMiles(1);
		
		assertEquals(1, blueGuy.getUpgrades());
		assertEquals(52000, blueGuy.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithMiles_GOLDEN() {
		goldenGuy.purchaseUpgradeWithMiles(1);
		
		assertEquals(1, goldenGuy.getUpgrades());
		assertEquals(78000, goldenGuy.getBalanceMiles());
	}
	
	@Test
	public void shouldThrowExceptionForInsufficientMiles() {
		try {
			redGuy.purchaseUpgradeWithMiles(3);
			fail("InsufficientMilesException expected");
		} catch (InsufficientMilesException e) {
			assertEquals("Insufficient miles!", e.getMessage());
		}
	}
	
	@Test
	public void shouldPurchaseMultipleUpgradesWithMiles() {
		redGuy.purchaseUpgradeWithMiles(2);
		
		assertEquals(2, redGuy.getUpgrades());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_RED() {
		redGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, redGuy.getUpgrades());
		assertEquals(100, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_GREEN() {
		greenGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, greenGuy.getUpgrades());
		assertEquals(90, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_BLUE() {
		blueGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, blueGuy.getUpgrades());
		assertEquals(75, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseUpgradeWithCard_GOLDEN() {
		goldenGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 1);
		
		assertEquals(1, goldenGuy.getUpgrades());
		assertEquals(60, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseMultipleUpgradesWithCard_RED() {
		redGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 2);
		
		assertEquals(2, redGuy.getUpgrades());
		assertEquals(200, cas.getAmount());
	}
	
	@Test
	public void shouldPurchaseMultipleUpgradesWithCard_GOLDEN() {
		goldenGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 2);
		
		assertEquals(2, goldenGuy.getUpgrades());
		assertEquals(120, cas.getAmount());
	}
	
	@Test
	public void shouldThrowExceptionForInvalidCard() {
		try {
			redGuy.purchaseUpgradeWithCard(cas, "1234", 1);
			fail("InvalidCardException expected");
		} catch (InvalidCardException e) {
			assertEquals("Invalid card number!", e.getMessage());
		}
	}
	
	@Test
	public void shouldFailBigUpgradePurchase() {
		try {
			redGuy.purchaseUpgradeWithCard(cas, "1234123412341234", 3);
			fail("InsufficientFundsException expected");
		} catch (InsufficientFundsException e) {
			assertEquals("Insufficient funds!", e.getMessage());
		}
	}
}
