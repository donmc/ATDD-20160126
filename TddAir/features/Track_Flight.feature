Feature: Track Flight
As a Member
I want my flight mileage tracked
So that my balance increases and status upgraded.

Background: Setup
Given test flights exist

Scenario: Red to Green
Given a registered member "don" who has 20000 ytd miles
When member "don" takes flight "QF191"
Then that member has "Green" status
And that member has 27490 ytd miles
And that member has 37490 balance miles

Scenario: Green to Blue
Given a registered member "don" who has 45000 ytd miles
When member "don" takes flight "QF191"
Then that member has "Green" status
And that member has 52490 ytd miles
And that member has 62490 balance miles

Scenario: Blue to Golden
Given a registered member "don" who has 70000 ytd miles
When member "don" takes flight "QF191"
Then that member has "Green" status
And that member has 77490 ytd miles
And that member has 87490 balance miles