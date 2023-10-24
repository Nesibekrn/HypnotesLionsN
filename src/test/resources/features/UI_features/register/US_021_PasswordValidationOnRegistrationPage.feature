@UI @US_021
Feature: Password Validation on Registration Page

  Background:
    Given user goes to client register page
    Then user enters a valid Name
    And user enters a valid Surname
    And user enters a valid Email
    When user clicks password field

  @UI @US_021
  Scenario: User successfully registers with valid password (Positive)
    When user clicks password field
    Then the color in the characters section should be red
    And the color in the A lowercase letter section should be red
    And the color in the A capital uppercase letter section should be red
    And the color in the A number section should be red
    And the color in the A special character section should be red
    When the user enters a password that meets the criteria.
    Then the color in the characters section should be green
    And the color in the A lowercase letter section should be green
    And the color in the A capital uppercase letter section should be green
    And the color in the A number section should be green
    And the color in the A special character section should be green
    And user clicks the Sign Up button


  @UI @US_021
  Scenario: User enters a password with less than 8 characters (Negative)
    When user enters a password with less than eight characters
    Then the Sign Up button should not be clickable
    And the color in the characters section should be red
    And registration should not proceed


  @UI @US_021
  Scenario: User enters a password with more than 50 characters (Negative)
    When user enters a password with more than fifty characters
    Then the Sign Up button should not be clickable
    And the color in the characters section should be red
    And registration should not proceed


  @UI @US_021
  Scenario: User enters a password missing a lowercase letter (Negative)
    When user enters a password that meets all the criteria except it does not contain a lowercase letter
    Then the Sign Up button should not be clickable
    And the color in the A lowercase letter section should be red
    And registration should not proceed


  @UI @US_021
  Scenario: User enters a password missing an uppercase letter (Negative)
    When user enters a password that meets all the criteria except it does not contain an uppercase letter
    Then the Sign Up button should not be clickable
    And the color in the A capital uppercase letter section should be red
    And registration should not proceed


  @UI @US_021
  Scenario: User enters a password missing a number (Negative)
    When the user enters a password that meets all the criteria except it does not contain a number
    Then the Sign Up button should not be clickable
    And the color in the A number section should be red
    And the registration should not proceed


  @UI @US_021
  Scenario: User enters a password missing a special character (Negative)
    When the user enters a password that meets all the criteria except it does not contain a special character
    Then the Sign Up button should not be clickable
    And the color in the A special character section should be red
    And the registration should not proceed
