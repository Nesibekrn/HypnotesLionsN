Feature: User Registration
  @US_024
  Scenario: User clicks on "Sign Up for Free" button and verifies registration options
    Given the user is on the home page
    When the user clicks on the "Sign Up for Free" button
    Then the "Sign Up for Free" button should be clickable
    And the "Register As a Therapist" menu should appear