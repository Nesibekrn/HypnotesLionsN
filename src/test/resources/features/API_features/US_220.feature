Feature: Recurring Date and Time
  Background:
    Given user gets phpSessid for authentication
@US_220
  Scenario: As a user, I must be able to create recurring date and time with using API end point
   When user sends a request to create recurring date and time
    Then the user verifies that status codes is 200
    And the user verifies response body is expected.
   And user sends a request to delete the created recurring date and time