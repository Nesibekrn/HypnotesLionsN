@UI
Feature: As a user Forgot your password? and I should be able to check the new password creation process


  Background:
    Given user take an valid Email and Create An Account

  @UI
  Scenario: The user sould be able to successfully create a new password

    Then Click Login
    Then User click Forgot Your Password
    * Forgot Password window should be functional
    * User enters a valid email
    * Send Email button should be functional Click Send Email
    * User should receive a successful reset message
    * User receives email reset request in the mailbox
    * New Password  screen should appear
    * User enter valid email for New Password
    * User enter new Password
    * User enter comfirm Password
    * Click button Submit
    * user should be able to see Password has been updated
    * Click Go to Login Page
    And Therapist Login  should be seen
