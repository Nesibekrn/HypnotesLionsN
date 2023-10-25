Feature: Registration must be created with Sign in Facebook.
  @UI @US_016
  Scenario:  Verify that user goes facebook page
    Given the user navigates hypnotes web page
    And the user clicks on Sign Up free button
    And the user clicks on the Client Log in
    And the user verifies Sign in with Facebook button
    Then the user verifies related page
