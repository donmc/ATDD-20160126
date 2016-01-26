Feature: Register Customer
  
  As a Customer 
  I want to register as a member
  So that I can start gaining miles for rewards
  
  Sceanrio 1: Happy Path
  When a member registers
  Then validate username and email address fields
  And status should be New Member
  
  Sceanrio 2 
  When a member registers
  Then system should create a member profile
  
  Sceanrio 3
  When a member registers
  Then 10000 miles added to member balance
 
  
  Sceanrio 4: Duplicate Username/Email Address
  When a member registers with existing username/email address
  Then system should not allow the registration
  
    
 

