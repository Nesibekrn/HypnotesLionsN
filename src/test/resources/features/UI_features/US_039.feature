Feature: User Login
  @US_039


  Scenario: Successful login with valid email and password
    Given the user is on the login page
    When the user enters a valid email address ""
    And the user enters a valid password ""
    And clicks the login button
    Then the user should be successfully logged in