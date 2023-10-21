

Feature: Register functionality with Google account
  @US_015
  @UI
  Scenario: Verify that user is able to register with an google account
    Given the user navigates Hypnotes web page
    And the user clicks on Sign up for free  button
    And the user clicks on Client login
    And the user clicks on the Sign with Google button
    And the user enter an email address
    And the user clicks on next button
    And the user enter an password
    When the user clicks on next button
    Then  User is registered successfully