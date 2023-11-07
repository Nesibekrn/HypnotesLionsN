
@UI
Feature:US-52 The user should be able to see the customers added to the customer search page.

  Background:
    Given user goes to home page
    When clicks the login button
    And clicks to Sign in with linkedIn
    When enters the e-mail address and password

    @UI
    Scenario: US52_TC001 the clients added on the Search Client page
      Given user click to client section
      And sees the customer list in search client form
      Then Verify customer list is in alphabetical order

  @UI
   Scenario:US52_TC002 the clients added on the Search Client page
     Given User clicks on Clients section
     And Clicks on Search Client
     And chooses to sort by name
     Then Verify that it is in alphabetical order

  @UI
  Scenario:US52_TC003 the clients added on the Search Client page
    Given User clicks on Clients section
    And Clicks on Search Client
    And chooses to sort by surname
    Then Verify that it is in alphabetical order

  @UI
  Scenario:US52_TC004 the clients added on the Search Client page
    Given User clicks on Clients section
    And Clicks on Search Client
    And chooses to sort by date added
    Then Verify that it is in alphabetical order

