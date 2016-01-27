package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class TddAirApplication
{
    private FlightDao                 flights = new FlightDao();
    private final Map<String, Member> member  = new HashMap<>();

    public TddAirApplication()
    {
    }

    public void addFlight(String origin, String destination, int mileage, String airline, int number)
    {
        flights.addFlight(origin, destination, mileage, airline, number);
    }

    public void registerCustomer(String username, String email)
    {
        member.put(username, new MemberImpl(username, email));
    }

    public Member lookupMember(final String username)
    {
        return member.get(username);
    }

    public int getFlightMiles(String flightNumber)
    {
        Flight flight = flights.getFlightBy(flightNumber);
        return flight.getMileage();
    }
}
