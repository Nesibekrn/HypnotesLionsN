@UI @Therapist
Feature: Profile(Schedule Appointment) section

  @UI @Therapist
  Scenario: User(Therapist) should see the client's names and view details buttons
    When User should see Client section
    Then Client section button should be clickable
    And User should click on Client section button
    Then User should see the client's names on the page
    And User should see the view details buttons

  @UI @Therapist
  Scenario: User(Therapist) clicks on Client Detail, the Client Info page should open
    And User should click on Client section button
    Then the view details button should be clickable
    When User clicks on the view details button
    Then User should see the Clients info page

  @UI @Therapist
  Scenario: User(Therapist) perform various actions in the Profile(Schedule Appointment) section
    And User should click on Client section button
    Given User should see the Schedule an Appointment option
    And Schedule an Appointment option button should be clickable
    When User clicks on Schedule an Appointment option
    Then the relevant page should appear