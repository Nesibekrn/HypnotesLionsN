Feature:Therapist Register Page Check

  @UI
  @US_029
  Background:
    Given User is on the therapist register page.

#FullName input functions as expected.
  Scenario : Verify that Full Name field must be functional on the the therapist register page
    When user enters valid full name.
    Then the name is accepted without error.

  Scenario : Verify that Full Name field must NOT be left blank on the the therapist register page
    When user leaves empty full name field.
    And user enters a valid email address.
    And user enters a valid password.
    And user clicks on Sign Up button.
    Then The full name field should display a message as "Please fill in this field."
    #Email field should not be left blank
  Scenario : Verify that email field must NOT be left blank on the the therapist register page
    When user enters valid full name.
    And user leaves empty email field.
    And user enters a valid password.
    And user clicks on Sign Up button.
    Then The email field should display a message as "Please fill in this field."
    #Password field should not be left blank
  Scenario : Verify that password field must NOT be left blank on the the therapist register page
    When user enters valid full name.
    And user enters a valid email address.
    And user leaves empty password field.
    Then Sign Up button should be disabled.


