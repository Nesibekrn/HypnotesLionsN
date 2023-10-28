@UI
@US_020
Feature: Client Register Page Check

  Background: User should be able to access the client register page.
    Given User goes to "https://test.hypnotes.net"
    And User verify that homepage is loaded
    When the user clicks on Sign Up free button
    Then User lands on register page
    And "I am a Client" link should be visible and clikable.
    When User clicks I am Client underneath the Sign up button.
    Then Client register page should be accessible.

  Scenario: User must enter only letters in name and surname fields.
    When user enters letters in name and surname inputboxes
    Then name and surname fields functions as expected.

  Scenario: User must enter valid email with "@ " and ".<something>"
    When user enters a valid Name
    And user enters a valid Surname
    And user enters invalid emails and gets proper warning message
      | jhondoe         |Please include an '@' in the email address. 'jhondoe' is missing an '@'.|
      | jhondoe@        |Please enter a part following '@'. 'jhondoe@' is incomplete.            |
      | tatagsh @gmail. |A part followed by '@' should not contain the symbol ' '.               |
      | jhondoe@gf.     |'.' is used at a wrong position in 'gf.'.|

  Scenario: User must enter valid email with "@ " and ".<something>"
    When user enters a valid Name
    And user enters a valid Surname
    And user enters invalid email as "jhondoe@gmail"
    And user enters a valid password.
    And user clicks the Sign Up button
    Then user verifies the pop-up message is 'Validation error.'