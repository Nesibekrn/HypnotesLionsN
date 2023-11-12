@UI
Feature:US-68 As a user(therapist), I should be able to see the various headings when I click Presenting Issue button

  Background:
    Given user goes to home page
    When clicks the login button
    And clicks to Sign in with linkedIn
    When enters the LinkedIn e-mail address and password

  Scenario: US68_TC001 the clients added on the Search Client page
    Given User clicks to clients section
    And clicks to view details button
    And click on the Presenting Issue section
    And Click on presenting issue