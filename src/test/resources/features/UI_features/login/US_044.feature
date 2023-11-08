@UI
Feature: After logging in as User (Therapist), I should be able to see the Clients page

  Background:
     Given a Therapist User is logged in

    Scenario: US_044
    Then user verifies the Client button is clickable
    When user clicks on Client button
    Then user sees the Client page




