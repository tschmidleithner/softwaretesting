Feature: invalid login

Background:
Given I am on the sportsid homepage

Scenario: invalid login
When login with invalid credentials
Then i am on the error page