Feature: Track Flight
  As a Member
  I want my flights tracked
  So that my balance is increased and status is upgraded

  Background: 
    Given a new service

  Scenario: Red to Red
    Given a customer registers with "don" and "don@improving.com"
    When member "don" takes flight "QF191"
    Then that member has "Red" status
    And that member has 7490 ytd miles
    And that member has 17490 balance miles

  Scenario Outline: Status Promotions
    Given a customer registers with <username> and "don@impriing.com"
    And member <username> has <start miles> miles
    When member <username> takes flight <flight no>
    Then that member has <end status> status
    And that member has <end ytd> ytd miles
    And that member has <end balance> balance miles

    Examples: 
      | username | start miles | flight no | end status | end ytd | end balance |
      | "don"    | 20000       | "QF191"   | "Green"    | 27490   | 37490       |
      | "bob"    | 45000       | "QF191"   | "Blue"     | 52490   | 62490       |
      | "bob"    | 45000       | "QF191"   | "Blue"     | 52490   | 62490       |
      | "bob"    | 70000       | "QF191"   | "Gold"     | 52490   | 62490       |
      | "bob"    | 45000       | "QF191"   | "Blue"     | 52490   | 62490       |
      | "bob"    | 45000       | "QF191"   | "Blue"     | 52490   | 62490       |
      | "bob"    | 45000       | "QF191"   | "Blue"     | 52490   | 62490       |
      | "bob"    | 45000       | "QF191"   | "Blue"     | 52490   | 62490       |
