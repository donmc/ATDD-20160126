Feature: Register Customer
As a Customer
I want to register as a Member
So that I can start accruing miles for rewards.

Scenario 1:
Given a customer older than two years
When the customer provides a valid birth date, email address, and username
Then the system should add them to the frequenty flyer program
And the system awards ten thousand bonus miles
And the system puts the new member in the red category
And the system establishes their year to date (YTD) miles at zero.

Scenario 2:
Given a customer younger than two years old
When the customer provides a birth date
Then the system rejects the customers registration

Scenario 3:
Given an already reserved username
When the customer provides a username that is already in use
Then the system prompts the customer to provide a different username

Scenario 4:
Given an already reserved email address
When the customer provides an email address that is already in use
Then the system prompts the customer to provide a different email address