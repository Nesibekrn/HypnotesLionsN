Feature: US025
  @UI @smoke
  Scenario: US25_TC_001 Positive scenario for Login with Google account
    Given user goes to home page
    And  the user clicks Sign Up free button
    And the user clicks on the Sign with Google button
    And the user enter an email address
    And the user clicks on next button
    And the user enter an password
    When the user clicks on next button
    Then  User is on the calender page

