Feature: User Login
  @UI
  @US_039

    Background:
    Given user goes to home page
@UI
  Scenario: Successful login with valid email and password
    Given clicks the login button
    When the user enters a valid email address "user1@gmail.com"
    And the user enters a valid password "user1Passsword"
    And clicks the login
    Then the user should be successfully logged in