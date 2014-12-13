Feature: test creation of member with mandatory fields

Background:
Given I am on the sportsid homepage

Scenario: Add new Member
When I create a valid user named "Peter"
Then the list contains the new user "PETER"