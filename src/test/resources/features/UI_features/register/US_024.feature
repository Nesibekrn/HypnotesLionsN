@UI
Feature: User goes to home page.

  @US_024
@UI
  Scenario: TC001
    Given user goes to home page
    Then the Sign Up for Free button should be clickable
    When the user clicks on the Sign Up for Free button
    Then the Register As a Therapist menu should appear
