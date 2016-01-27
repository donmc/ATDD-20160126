Feature: Register Customer
  As a Customer 
  I want to register as a Member
  So that I can gain Miles for Rewards

  Scenario: Happy Path
    When the customer registers with "don"
    Then system should allow the Member to claim the username.
    When the customer provides "don@improving.net"
    Then the system should allow the Member to claim that email address.
    When the customer registers as a Member
    Then the system should assign the Member 10000 bonus miles
    And the system should assign the Member untested status.

  Scenario: Duplicate username
    When the customer provides a username already in use
    Then the system should show an error message and prompt for a different username.

  Scenario: Email in use
    When the customer provides an email address already in use
    Then the system should show an error message and prompt for a different email address.

  Scenario: Invalid Email
    When the customer provides an invalid email address
    Then the system should show an error message and prompt for a correct email address.
