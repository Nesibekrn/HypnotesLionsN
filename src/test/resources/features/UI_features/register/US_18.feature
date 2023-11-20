
Feature: US018 Clients register with the LinkedIn feature.
  @UI @US18
  Scenario: TC001 As a user I should be able to register with my LinkedIn account

    Given User goes to "https://test.hypnotes.net"
    Then User clicks Sign in button on nav-bar.
    Then User clicks I am Client underneath the Sign up button.
    Then user verifies Sign in with LinkedIn button is visible and clickable
    And  user enters a valid LinkedIn "pluskesif@gmail.com" in the email field.
    And  user enters a valid LinkedIn "123456Kesif" in the password fields.
    And  user clicks sign-in button
    Then user verifies related pages are visible