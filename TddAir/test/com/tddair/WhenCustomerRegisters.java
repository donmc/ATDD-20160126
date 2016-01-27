package com.tddair;

import static org.junit.Assert.*;

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

    @Test
    public void shouldHaveRightUserNameEmail()
    {

        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "justin.leonard1@usaa.com";

        app.registerCustomer(username, email);

        Member member = app.lookupMember(username);
        assertEquals(username, member.getUserName());
        assertEquals(email, member.getEmail());
    }

    @Test
    public void shouldHaveRightUserNameEmail2()
    {

        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        String user2 = "justin";
        String email2 = "Justin@bar.com";

        app.registerCustomer(username, email);
        app.registerCustomer(user2, email2);

        Member member = app.lookupMember(username);
        assertEquals(username, member.getUserName());
        assertEquals(email, member.getEmail());
    }

    @Test
    public void shouldHaveRedStatus()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        assertEquals(Status.Red, member.getStatus());
    }

    @Test
    public void shouldHave0YtdMiles()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        assertEquals(0, member.getYtdMiles());
    }

    @Test
    public void shouldHave10000MilesBalance()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        assertEquals(10000, member.getBalanceMiles());

    }

    @Test
    public void shouldMoveStatusToGreenandBalanceMilesShouldIncrease()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        member.travelMiles(25001);
        assertEquals(Status.Green, member.getStatus());

    }

    @Test
    public void shouldMoveStatusToBlue()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        member.travelMiles(25001);
        member.travelMiles(25001);
        assertEquals(Status.Blue, member.getStatus());

    }

    @Test
    public void shouldMoveStatusToGolden()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        member.travelMiles(25001);
        member.travelMiles(25001);
        member.travelMiles(25001);
        assertEquals(Status.Golden, member.getStatus());
    }

    @Test
    public void shouldDropDownToRightStatusAndResetTo0Miles()
    {
        TddAirApplication app = new TddAirApplication();
        String username = "Ajay";
        String email = "ajay@usaa.com";

        app.registerCustomer(username, email);
        Member member = app.lookupMember(username);
        //in 2015 Meber travelled only 50002
        member.travelMiles(25001);
        member.travelMiles(25001);
        member.setStatus(Status.Golden);

        //2016 Jan 1st he needs to be dropped down to GREEN
        assertEquals(Status.Green, member.getStatus());
    }

}
