Feature: Register Customer
  
  As a Customer 
  I want to register as a member
  So that I can start gaining miles for rewards
  
  Scenario 1: Happy Path
  When a member registers
  Then validate username and email address fields
  And status should be New Member
  
  Scenario 2 
  When a member registers
  Then system should create a member profile
  
  Scenario 3
  When a member registers
  Then 10000 miles added to member balance
 
  Scenario 4: Duplicate Username/Email Address
  When a member registers with existing username/email address
  Then system should not allow the registration
  
  Scenario 5: Invalid Email Address
  
    
 

