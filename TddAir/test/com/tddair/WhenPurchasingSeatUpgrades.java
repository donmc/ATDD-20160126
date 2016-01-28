package com.tddair;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WhenPurchasingSeatUpgrades {
	
	private Member redMember;
	private Member greenMember;
	private Member blueMember;
	private Member goldenMember;
	private TddAirApplication app = new TddAirApplication(new FakeFlightDao());
	
	@Before
	public void setup() {
		redMember = new Member("redMember","redMember@members.net");
		redMember.completeFlight(new Flight("SAT","DFW",20000));
		greenMember = new Member("greenMember","greenMember@members.net");
		greenMember.completeFlight(new Flight("SAT","DFW",40000));
		blueMember = new Member("blueMember","greenMember@members.net");
		blueMember.completeFlight(new Flight("SAT","DFW",60000));
		goldenMember = new Member("goldenMember","goldenMember@members.net");
		goldenMember.completeFlight(new Flight("SAT","DFW",100000));
		
	}

	@Test
	public void shouldPurchaseSeatUpgradesWithMiles_RED() {
		int quantity = 1;
		redMember.purchaseSeatUpgradeWithMiles(quantity);
		assertEquals(quantity, redMember.getSeatUpgrades());
		assertEquals(20000, redMember.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseSeatUpgradesWithMiles_GREEN() {
		int quantity = 1;
		greenMember.purchaseSeatUpgradeWithMiles(quantity);
		assertEquals(quantity, greenMember.getSeatUpgrades());
		assertEquals(41000, greenMember.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseSeatUpgradesWithMiles_BLUE() {
		int quantity = 1;
		blueMember.purchaseSeatUpgradeWithMiles(quantity);
		assertEquals(quantity, blueMember.getSeatUpgrades());
		assertEquals(62000, blueMember.getBalanceMiles());
	}
	
	@Test
	public void shouldPurchaseSeatUpgradesWithMiles_GOLDEN() {
		int quantity = 1;
		goldenMember.purchaseSeatUpgradeWithMiles(quantity);
		assertEquals(quantity, goldenMember.getSeatUpgrades());
		assertEquals(103000, goldenMember.getBalanceMiles());
	}
	
	@Test
	public void shouldNotPurchaseSeatUpgradesWithoutEnoughMiles() {
		int quantity = 4;
		redMember.purchaseSeatUpgradeWithMiles(quantity);
		assertEquals(0, redMember.getSeatUpgrades());
		assertEquals(30000, redMember.getBalanceMiles());
	}
	
	@Test
	public void shouldPurcahseSeatUpgradesWithCreditCard() {
		CasSpy spy = new CasSpy();
		redMember.setCas(spy);
		redMember.purchaseSeatUpgradeWithCreditCard(2, CasSpy.VALID_CC);
		
		assertEquals(200, spy.getChargedAmount());
		assertEquals(2,redMember.getSeatUpgrades());
	}
}
