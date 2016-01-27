Feature: Track Flight
  As a Member
  I want my flight tracked 
  So that my balance increases and status upgrades

  Scenario: Red to Red
    Given a customer registers with "don" and "don@improving.com"
    And has 0 ytd miles and 10000 balance miles
    When member "don" takes flight "QF191"
    Then that member has "Red" status
    And that member has 7490 ytd miles
    And that member has 17490 balance miles

  Scenario: Red to Green
    Given a customer registers with "bob" and "bob@improving.com"
    And has 20000 ytd miles and 30000 balance miles
    When member "bob" takes flight "QF191"
    Then that member has "Green" status
    And that member has 27490 ytd miles
    And that member has 37490 balance miles

  Scenario: Red to Blue
    Given a customer registers with "sue" and "sue@improving.com"
    And has 20000 ytd miles and 30000 balance miles
    When member "sue" takes flight "NA13"
    Then that member has "Blue" status
    And that member has 65123 ytd miles
    And that member has 75123 balance miles

  Scenario: Red to Golden
    Given a customer registers with "may" and "may@improving.com"
    And has 20000 ytd miles and 30000 balance miles
    When member "may" takes flight "NA14"
    Then that member has "Golden" status
    And that member has 87163 ytd miles
    And that member has 97163 balance miles
