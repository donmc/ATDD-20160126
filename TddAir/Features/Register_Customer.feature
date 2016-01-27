Feature: Register Customer
  
  As a Customer 
  I want to register as a member
  So that I can start gaining miles for rewards
  
  Scenario: 1 Happy Path
  When a customer registers with "srini" and "srini@test.com"
  Then that customer is added as a member
  And that member has "Red" status
  And that member has 0 ytd miles
  And that member has 10000 balance miles
    
  Scenario: 2 Duplicate Username
  Given a customer registers with "Srini" and "Srini@test.com"
  When aa customer registers with "Srini" and "Srini_2@test.com"
  Then an error message "Duplicate Username!" is displayed        |
  

  
    
 

