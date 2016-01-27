package com.tddair;

public interface Member
{
    String getUserName();

    String getEmail();

    Status getStatus();

    int getYtdMiles();

    int getBalanceMiles();

    void travelMiles(int i);

    void setStatus(Status status);

    void setBalanceMiles(int miles);

    void setYtdMiles(int miles);
}
