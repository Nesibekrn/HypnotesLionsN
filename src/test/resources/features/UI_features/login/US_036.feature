Feature: US036 Therapist login with Facebook feature
  @UI @US36
  Scenario: TC001 As a user I should be able to login to my Therapist Account

    Given User goes to "https://test.hypnotes.net"
    Then  The user clicks on the login button
    Then  The user verifies the sign-in with the Facebook button is visible and clickable.
    And   user enters the registered "denemekesif@gmail.com" in the field.
    And   user enters the "kesifplus123" in the fields.
    Then  Click the login button.
    Then  user verifies related pages are visible after login.
