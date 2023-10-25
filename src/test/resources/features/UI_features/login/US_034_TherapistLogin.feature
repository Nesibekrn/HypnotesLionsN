#The login button must be clickable
#When the Login button is clicked, the Therapist Login menu should appear.
#In the Therapist Login menu, click Client Login, Forgot your password?, Need an account? buttons must be clickable
#The password should be visible when user clicks Show Password Icon
#Client Login, Forgot your password?, Need an account? The buttons must give correct results. Necessary checks should be made.
@UI
Feature: US_034 As a User (Therapist) I should be able to log in to the home page

  Background:
    Given user goes to home page

  @UI @US_034_TC-01
  Scenario: TC-01 The login button must be clickable
    Then user verify Login button is clickable
    When user clicks on Login button
    Then user can see The Therapist Login menu
    And user verify Client Login is clickable
    * user verify Forgot your password is clickable
    * user verify Need an account is clickable

  @UI @US_034_TC-02
  Scenario: TC_02 The password should be visible when user clicks Show Password Icon
    Given user clicks on Login button
    When user types password on password field
    And user clicks on show password icon
    Then user verify password is visible

  @UI @US_034_TC-03
  Scenario: TC-03 Client Login, The buttons must give correct results. Necessary checks should be made.
    Given user clicks on Login button
    When user clicks Client Login link
    Then user can see Client Login Page

  @UI @US_034_TC-04
  Scenario: TC-04 Forgot your password?, Need an account? The buttons must give correct results. Necessary checks should be made.
    Given user clicks on Login button
    When user clicks Forgot your password link
    Then user can see Forgot your password Page

  @UI @US_034_TC-05
  Scenario: TC-05 Need an account? The buttons must give correct results. Necessary checks should be made.
    Given user clicks on Login button
    When user clicks Need an account link
    Then user can see Need an account Page


