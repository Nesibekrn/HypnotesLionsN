Feature: User Login
  @US_039


  Scenario: Successful login with valid email and password
    Given the user is on the login page
    When the user enters a valid email address "user1@gmail.com"
    And the user enters a valid password "user1Passsword"
    And clicks the login button
    Then the user should be successfully logged in