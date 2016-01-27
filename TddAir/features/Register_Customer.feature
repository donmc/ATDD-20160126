Feature: Register Customer
As a Customer
I want to register as a Member
So that I can start accruing miles for rewards.

Scenario: Happy Path
When a customer registers with "don" and "don@improving.com"
Then that customer is added as a member
And that member has 0 ytd miles
And that member has "RED" status
And that member has 10000 balance miles

Scenario: Duplicate Username
Given a customer registers with "don" and "don@improving.com"
When a customer registers with "don" and "bob@improfing.com"
Then an error message "Duplicate username!" is displayed

Scenario: Duplicate Email Address
Given a customer registers with "don" and "don@improving.com"
When a customer registers with "bob" and "don@improfing.com"
Then an error message "Duplicate email address!" is displayed