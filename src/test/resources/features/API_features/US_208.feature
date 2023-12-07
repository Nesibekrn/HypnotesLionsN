@API_208
Feature: Set New Event
  Scenario: Therapist set new event
    Given User login to the system as a therapist
    When User sent a Post request to "https://test.hypnotes.net/api/event/setEvent"
    Then The user verifies that status code is 200
    And verify that success is true
    And verify descr is "Event created success"