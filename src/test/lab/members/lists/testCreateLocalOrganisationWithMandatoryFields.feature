Feature: test creation of local organisation with mandatory fields

Background:
Given I am on the sports-id homepage

Scenario: Add new local organisation
When I create a valid local organisation named "some org"
Then the list contains the new local organisation named "some org"