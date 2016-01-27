Feature: Register Customer
  As a customer
  I Want to register as a meber
  So that I can start gaining miles for rewards
  
  Given
  When a customer registeres with email and username and found matches
  Then system should have the member promt to retrieve password
  
  Given 
  When a Customer registers with valid information  
  Then the System should ask the user to set a password for the username/email address 
  And the system should lace the member in Gold Status
  And the system should send a welcome email
  And the system should provide bonus miles of 10,000 that can be used towards seat upgrades etc but not status ugrades
  
  Given 
  When Customer bails out before completion of the registration
  Then an email should be sent to the email address provided to continue the Registration/application
  
  
  
