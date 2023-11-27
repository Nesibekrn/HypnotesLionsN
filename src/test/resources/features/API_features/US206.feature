Feature: User gives a new appointment for an existing client

  Background:

    Given user logins as a therapist and takes token from api
  Scenario: User gives a new appointment for an existing client
    When User selects a specific client
    And User selects an available date
    Then User creates a new appointment for a specific client
    Then User verifies if the status is True
    Then User verifies that if the response is as expected


