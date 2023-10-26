@UI @US030
Feature: Therapist Sign Up Feature
  Background: user_goes_to_therapist_register_page
    Given user goes to therapist register page
  Scenario: User must be able to sign up with valid full name, email and password (Positive)
    When user submits a valid name to the Full Name section
    And user submits a valid email to the Email section
    And user submits a valid passowrd to the Password section
    Then user clicks on Sign Up button
    And user verifies 'Verify Email' header is displayed
  Scenario: User must not be able to sign up with invalid email (Negative)
    When user submits a valid name to the Full Name section
    But user submits an invalid email to the Email section
    And user submits a valid passowrd to the Password section
    Then user clicks on Sign Up button
    And user verifies a warning message contains "Please include an '@'"
  Scenario: User must not be able to sign up with invalid email (Negative2)
    When user submits a valid name to the Full Name section
    But user submits another invalid email to the Email section
    And user submits a valid passowrd to the Password section
    Then user clicks on Sign Up button
    And user verifies the pop-up message is 'Validation error.'




