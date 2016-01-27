package com.tddair;

public class MemberImpl implements Member
{
    private String username;
    private String email;
    private Status status;
    private int    ytdMiles     = 0;
    private int    balanceMiles = 0;

    public MemberImpl(String username, String email)
    {
        this.username = username;
        this.email = email;
        this.status = Status.Red;
    }

    @Override
    public String getUserName()
    {
        return this.username;
    }

    @Override
    public String getEmail()
    {
        return this.email;
    }

    @Override
    public Status getStatus()
    {
        return status;
    }

    @Override
    public int getYtdMiles()
    {
        return this.ytdMiles;
    }

    @Override
    public int getBalanceMiles()
    {
        return this.balanceMiles;
    }

    @Override
    public void travelMiles(int i)
    {
        balanceMiles = balanceMiles + i;
        ytdMiles = ytdMiles + i;

        if( ytdMiles > 25000 )
        {
            this.status = Status.Green;
        }
        if( ytdMiles > 50000 )
        {
            this.status = Status.Blue;
        }
        if( ytdMiles > 75000 )
        {
            this.status = Status.Golden;
        }
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public void setYtdMiles(int ytdMiles)
    {
        this.ytdMiles = ytdMiles;
    }

    public void setBalanceMiles(int balanceMiles)
    {
        this.balanceMiles = balanceMiles;
    }
}
