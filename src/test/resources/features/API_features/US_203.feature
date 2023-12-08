Feature: As a user, I should be able to get details clients basic info
  Scenario: Get Client info
    Given user get token with ApiUtilities
    When user send request to get all client info
    Then user verifies response body