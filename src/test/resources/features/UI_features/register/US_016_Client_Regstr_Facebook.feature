Feature: Registration must be created with Sign in Facebook.
  @UI @US_016

  Scenario:  Verify that user is able to register with a facebook account
    Given the user navigates hypnotes web page
    And the user clicks on Sign Up free button
    And the user clicks on the Client Log in
    And the user verifies Sign in with Facebook button
    And  user enters a valid Facebook email in the email field.
    And user enters a valid Facebook password in the password fields.
    Then Click the Log in button.
    Then user verifies related pages are visible
