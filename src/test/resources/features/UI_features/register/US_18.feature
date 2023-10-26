
Feature: US018 Clients register with the LinkedIn feature.
  @UI @US18
  Scenario: TC001 As a user I should be able to register with my LinkedIn account

    Given user goes to home page
    Then the user clicks on the Sign Up for Free button
    Then User clicks I am Client underneath the Sign up button.
    Then user verifies Sign in with LinkedIn button is visible and clickable
    And  user enters a valid LinkedIn "pluskesif@gmail.com" in the email field.
    And  user enters a valid LinkedIn "123456Kesif" in the password fields.
    And  user clicks sign-in button
    Then user verifies related pages are visible