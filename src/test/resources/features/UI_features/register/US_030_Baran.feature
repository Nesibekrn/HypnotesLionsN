@UI @US030_B
Feature: Therapist Sign Up Feature B

  Background: user_goes_to_therapist_register_page B
    Given user goes to therapist register page B

  Scenario: User must be able to sign up with valid full name, email and password (Positive) B
    When user submits a valid name to the Full Name section B
    And user submits a valid email to the Email section B
    And user submits a valid passowrd to the Password section B
    Then user clicks on Sign Up button B
    And user verifies 'Verify Email' header is displayed B

  Scenario: User must not be able to sign up with invalid email (Negative) B
    When user submits a valid name to the Full Name section B
    But user submits an invalid email to the Email section B
    And user submits a valid passowrd to the Password section B
    Then user clicks on Sign Up button B
    And user verifies a warning message contains "Please include an '@'" B

  Scenario: User must not be able to sign up with invalid email (Negative2) B
    When user submits a valid name to the Full Name section B
    But user submits another invalid email to the Email section B
    And user submits a valid passowrd to the Password section B
    Then user clicks on Sign Up button B
    And user verifies the pop-up message is 'Validation error.' B