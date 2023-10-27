Feature: Registration must be created with Sign in Apple account.
  @UI @US_017

  Scenario:  Verify that user be able to register with Apple account
    Given the user goes to hypnotes web page
    And the user clicks Sign Up free button
    And the user clicks on Client Log in
    And the user clicks Sign in with Apple button
    And the user enters a valid  email in the email field
    And the user enters a  password in the password fields.
    #Apple verification code gerektiginden test yapamadim
    #And the user clicks on the continue button
    #Then user verifies related page





