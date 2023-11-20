@UI @smoke
Feature: User goes to home page.

  @US_024
@UI
  Scenario: TC001
    Given User goes to "https://test.hypnotes.net"
    Then the Sign Up for Free button should be clickable
    Then  User clicks Sign in button on nav-bar.
    Then the Register As a Therapist menu should appear
