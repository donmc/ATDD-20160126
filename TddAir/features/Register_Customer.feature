Feature: Register Customer
  As a Customer
  I want to register as a Member
  So that I can start gaining miles for rewards
  
  Given that a username and email address does not exist
  When a customer provides a valid username and email address
  Then they should be able to register as a member
  
  When a customer registers as a member
  Then a new member account should be created 
  
  Given that a member profile does not exists
  When a customer registers for the first time
  Then a reward of 10,000 points shall be given
  And when a reward of 10,000 points is given, it will not contribute to an upgrade

  Scenario: Happy Path
    When a customer registers with a username and email
    Then that customer is added as a member
    And that member has Red status
    And that member has 0 YTD miles
    And that membe has 10000 balance miles
    
    When a customer registers with a <username> and <email>
    Then that customer is added as a member
    And that member has <status> status
    And that member has 0 YTD miles
    And that membe has 10000 balance miles
    |username|email			|status|
    |noel	 |noel@usaa.com |Red   |
    
