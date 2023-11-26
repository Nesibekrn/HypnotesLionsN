@UI @US_085 @Therapist
Feature: As a user, I should be able to perform various actions to create an appointment with the  Custom Service-Registered Clients options
  Background:
    And the user clicks on Calendar button

  Scenario: As a user I should be able perform Schedule duration menu
    Given user selects a day from the calendar
    Then user selects Select Service Type as Custom Service
    And user fills in the information
    Then color