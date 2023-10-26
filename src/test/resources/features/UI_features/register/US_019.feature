@UI @US_019
Feature: User Registration Functionality

  Background:
    Given user goes to client register page


  @UI @US_019
  Scenario: User successfully registers with valid information (Positive)
    When user enters a valid Name
    And user enters a valid Surname
    And user enters a valid Email
    And user enters a valid Password
    And the user clicks the Sign Up button
    Then user is on the Verify Email page


  @UI @US_019
  Scenario: User leaves the Name field blank (Negative)
    When user leaves the Name field blank
    And user enters a valid Surname
    And user enters a valid Email
    And user enters a valid Password
    And the user clicks the Sign Up button
    Then user verifies Name warning message contains "Please fill in this field."


  @UI @US_019
  Scenario: User leaves the Surname field blank (Negative)
    When user enters a valid Name
    And user leaves the Surname field blank
    And user enters a valid Email
    And user enters a valid Password
    And user clicks the Sign Up button
    Then user verifies Surname warning message contains "Please fill in this field."


  @UI @US_019
  Scenario: User leaves the Email field blank (Negative)
    When user enters a valid Name
    And user enters a valid Surname
    And user leaves the Email field blank
    And user enters a valid Password
    And user clicks the Sign Up button
    Then user verifies Email warning message contains "Please fill in this field."


  @UI @US_019
  Scenario: User leaves the Password field blank (Negative)
    When user enters a valid Name
    And user enters a valid Surname
    And user enters a valid Email
    And user leaves the Password field blank
    Then the Sign Up button should not be clickable
