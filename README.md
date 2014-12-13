# Software Testing Report
===

## General selection of Tests

We tried to write tests for the (in our point of view) most important parts of the application. The tests are focused especially on the member- and club management so we do not cover all parts of the full application.

## Test automation approach

For the test automation approach, we selected tests which have at least a priority higher than middle. Therefore, we have the most important use cases in an automation environment and can also use them for automated regression tests.

### Selected Test Cases

* REF_C_MEMBER_0007 - `testCreateMemberWithMandatoryFields`
* REF_C_MEMBER_0001 - `testCreateNewMemberWithEmptyMandatoryFields`
* REF_C_PERSMEMBER_0006 - `testCreateMemberWithMandatoryFields`
* REF_A_CLUB_0004 - `testCreate_validName`
* REF_A_LORG_0004 - `testCreate_validName`
