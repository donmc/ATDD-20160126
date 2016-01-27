Feature: Register Customer

As a Customer
I want to register as a member
So that I can start gaining miles for rewards

Scenario: Happy Path
	When a customer registers with 'don' and 'don@improving.com'
	Then that customer is added as a member
	And that member has 'Red' status
	And that member has 0ytd miles
	And that member has 10000 balance miles

Scenario : Duplicate Username
	Given a customer registers with 'don' and 'don@improving.com'
	When a customer registers with 'don' and 'don@improving.com'
	Then an error message "Duplicate Username!" is displayed






//our stories
Scenario: 1
Given a username, password, and email
When the customer registers
Then create a new member profile
And the customer is notified of successful registration by email

Scenario: 2
Given a new member confirms their email by replying
When the customer registers
Then 10000 balance miles are rewarded for confirming email

Scenario: 3
Given an already registered username or email
When the customer registers
Then an error message is shown indicating username already in use
