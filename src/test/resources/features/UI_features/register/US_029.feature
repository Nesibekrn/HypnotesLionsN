@UI
Feature: Therapist Register Page Check


  Background:
    Given user goes to therapist register page

  @UI
  @US_029
  Scenario: Verify that Full Name field must be functional on the the therapist register page
    When user enters valid full name.
    Then the name is accepted without error.
  @US_029
  Scenario: Verify that Full Name field must NOT be left blank on the the therapist register page
    When user leaves empty full name field.
    And user enters a valid email address.
    And user enters a valid password.
    And user clicks on Sign Up button.
    Then The full name field should display a message as "Please fill in this field."
  @US_029
  Scenario: Verify that email field must NOT be left blank on the the therapist register page
    When user enters valid full name.
    And user leaves empty email field.
    And user enters a valid password.
    And user clicks on Sign Up button.
    Then The email field should display a message as "Please fill in this field."
  @US_029
  Scenario: Verify that password field must NOT be left blank on the the therapist register page
    When user enters valid full name.
    And user enters a valid email address.
    And user leaves empty password field.
    Then Sign Up button should be disabled.


