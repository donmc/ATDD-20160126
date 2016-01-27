Feature: Track Flight
  As a Member
  I want my flights tracked
  So that my balance is increased and status is upgraded

  Scenario: Red to Red
    Given a customer registers with "don" and "don@improving.com"
    When member "don" takes flight "QF191"
    Then that member has "Red" status
    And that member has 7490 ytd miles
    And that member has 17490 balance miles
    
  Scenario: Red to Green
    Given a customer registers with "bob" and "bob@improving.com"
    And member "bob" has 20000 miles
    When member "bob" takes flight "QF191"
    Then that member has "Green" status
    And that member has 27490 ytd miles
    And that member has 37490 balance miles