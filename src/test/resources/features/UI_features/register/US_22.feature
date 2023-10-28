@UI @US22
Feature: US_022 As a user I should be able to successfully complete the register after entering valid information.

  Background:
    Given User goes to "https://test.hypnotes.net"
    Then  User clicks Sign in button on nav-bar.
    And User clicks I am Client underneath the Sign up button.
    And User enters valid credentials,then clicks Sign up button.

  Scenario: TC_001 Client should be signed up successfully after entering valid credentials.
    Then  User verifies Verify Email warning window displayed.

  Scenario: TC_002 "Verify email" window should be displayed, all contents should be visible and functional after signed up..
    Then  User verifies all warning texts are visible on Verify Email section.
    And  User verifies Send again button is clickable.
    And User verifies that warning message is pops up after clicking Send again button.