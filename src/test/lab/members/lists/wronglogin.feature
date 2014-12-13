Feature: invalid login

Scenario: I am not able to login
Given I am on the login homepage
When I enter wrong credentials
Then I am not forwared to another page