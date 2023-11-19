@API @US_217
Feature: Hypnotes-API api/hypnotherapist/timeoff/all functionality
  Scenario: As a user, I should be able to get all block times with using API endpoints
    When user sends POST request to get all blocked times
    Then user see 200 status code and response body contains status as true

  Scenario: Verify that the user able to valid id on the response
    When user sends POST request to get all blocked times
    Then the response body contains specificDate as "2023-11-20T00:00:00+00:00"
    And the response contains startAt and finishAt values
    Scenario: Verify that when the user has no blocked time the response body return with an empty data array list
      When user sends POST request to get all blocked times
      Then the response returns empty array