package com.tddair;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

public class WhenCustomerRegisters
{
    @Test
    public void shouldBeAddedAsMember()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "justin";
        String email = "justin.leonard1@usaa.com";

        app.registerCustomer(username, email);

        Member member = app.lookupMember(username);
        assertNotNull(member);
    }

    @Ignore
    @Test
    public void shouldHaveRedStatus()
    {

    }

    @Ignore
    @Test
    public void shouldHave0YtdMiles()
    {

    }

    @Ignore
    @Test
    public void shouldHave10000MilesBalance()
    {

    }

}
