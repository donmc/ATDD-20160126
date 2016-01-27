Feature: Track Flight

As a Member 
I want to be able to track my flights
so that my balance is increased and status upgrades

 
Scenario: Mileage Accrual
When a member takes a flight
Then that members mileage balance should be accrued

Scenario: Status to Green
When a members mileage balance reaches 25,000 miles
Then members status should change to "green".

Scenario: Status to blue
When a members mileage balance reaches 50,000 miles
Then members status should change to "blue".

Scenario: Status to Golden
When a members mileage balance reaches 75,000 miles
Then members status should change to "golden".

