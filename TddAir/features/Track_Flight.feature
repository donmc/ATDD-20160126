Feature: Track Flight
  As a Member
  I want my flight mileage tracked
  So that my balance increases and status upgraded.

  # These steps will run before each scenario executes
  Background: Setup
    Given a fresh service

  # With every new scenario a new instance of each *Steps class is created
  Scenario: Red to Green
    Given a customer registers with "don" and "don@improving.com"
    And member "don" has 20000 ytd miles
    When member "don" takes flight "QF191"
    Then that member has "GREEN" status
    And that member has 27490 ytd miles
    And that member has 37490 balance miles

  Scenario: Green to Blue
    Given a customer registers with "don" and "don@improving.com"
    And member "don" has 45000 ytd miles
    When member "don" takes flight "QF191"
    Then that member has "BLUE" status
    And that member has 52490 ytd miles
    And that member has 62490 balance miles

  Scenario: Blue to Golden
    Given a customer registers with "don" and "don@improving.com"
    And member "don" has 70000 ytd miles
    When member "don" takes flight "QF191"
    Then that member has "GOLDEN" status
    And that member has 77490 ytd miles
    And that member has 87490 balance miles

  # All of these scenarios use the same format
  Scenario Outline: Status Promotions
    Given a customer registers with <username> and <email>
    And member <username> has <start miles> ytd miles
    When member <username> takes flight <flight no>
    Then that member has <end status> status
    And that member has <end ytd> ytd miles
    And that member has <end bal> balance miles

    Examples: 
      | username | email               | start miles | flight no | end status | end ytd | end bal |
      | "bob"    | "bob@improving.com" | 70000       | "QF191"   | "GOLDEN"   | 77490   | 87490   |
      | "mac"    | "mac@improving.com" | 10000       | "QF191"   | "RED"      | 17490   | 27490   |
