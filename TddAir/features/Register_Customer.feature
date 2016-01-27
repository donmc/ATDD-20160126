Feature: Register Customer
  As a Customer
  I want to register as a member
  So that I can start gaining miles for rewards

Scenario: Happy Path
  When a customer registers with "don" and "don@improving.com"
  Then that customer is added as a member
  And that member has "Red" status
  And that member has 0 ytd miles
  And that member has 10000 balance miles

Scenario: Duplicate Username
  Given a customer registers with "don" and "don@improving.com"
  When a customer registers with "don" and "don.mcgreal@improving.com"
  Then an error message "Duplicate Username!" is displayed