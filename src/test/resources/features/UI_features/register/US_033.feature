@UI
@US_033
Feature: Verify email
  Scenario: Verify email in mailbox
    Given User goes to register page
    When User enters the fullname
    And User enters valid  email
    And User enters valid password
    And User clicks sign up button
    Then User should be able to see Verify Email text in mailbox
    When User click verify email in mailbox
    Then User should go login page
