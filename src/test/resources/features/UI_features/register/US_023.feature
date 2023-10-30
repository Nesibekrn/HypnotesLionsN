Feature: Email verification
  Background:User successfully registers with valid information (Positive)
    Given user goes to client register page
    When user enters a valid Name
    And user enters a valid Surname
    And user enters a valid email
    And user enters a valid  Password
    And the user clicks the Sign Up button
    @UI @US23
  Scenario: Verify that user is able verify email once registered with valid credentials
      And  User receives  verify email request in the mailbox
    And user clicks verify email button
    And user is on login page
    And user enters verified email address and password
    When user clicks on the login button
    Then user verifies  that it's account is opened
