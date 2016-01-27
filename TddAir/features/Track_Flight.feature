Feature: Track Flight
  As a Member
  I want my flights tracked
  So that my balance is increased and status is upgraded

Scenario: Red to Green
  Given a customer registers with "don" and "don@improving.com"
  When member "don" takes flight "RG255"
  Then that member has "Green" status
  And that member has 25000 ytd miles
  And that member has 35000 balance miles

Scenario: Blue Status
  Given a customer registers with "bill" and "don@improving.com"
  When member "bill" takes flight "BL50"
  Then that member has "Blue" status
  And that member has 50000 ytd miles
  And that member has 60000 balance miles