Feature: As a user I should be able to verify  after entering valid information
  Background:User successfully registers with valid information (Positive)
    Given user goes to client register page
    When user enters a valid Name
    And user enters a valid Surname
    And user enters a valid email
    And user enters a valid Password
    And the user clicks the Sign Up button
    Scenario: Verify email
      When user clicks verify email button
      Then user verifies that login page appear
      And user able to log in correct credentials
