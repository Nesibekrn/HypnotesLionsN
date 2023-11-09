@UI
Feature: After logging in as User (Therapist), I should be able to see the Settings page

  @Therapist @US_49
  Scenario: US_49
    Then user verifies the Settings button is clickable
    When user clicks on Settings button
    Then useees the Settings page