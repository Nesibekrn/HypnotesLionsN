Feature: User Login


    Background:
    Given user goes to home page
  @US_039
@UI
  Scenario: Successful login with valid email and password
    Given clicks the login button
    When the user enters a valid email address "hypnotes2022tr1@gmail.com"
    And the user enters a valid password "Aydinlik2023/"
    And clicks the login
    Then the user should be successful message