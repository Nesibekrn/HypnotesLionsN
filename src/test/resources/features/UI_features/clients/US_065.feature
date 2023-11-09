@UI @US_065
Feature: Appointments Section for Therapists

  Background:
    Given a Therapist User is logged
    And the user is on the Clients page
    When the user clicks on the View Details button
  @UI @US_065
  Scenario: Managing Appointments
    Given As a Therapist user clicks on Appointments
    Then the Appointments page should open
    And the user should see the details of pending appointments in the Pending Appointments section
    And the user should see the details of past appointments in the Past Appointments section
    And the user clicks on the sorting buttons to sort in ascending order
    Then the user should receive correctly sorted results in ascending order
    And the user clicks on the sorting buttons to sort in descending order
    Then the user should receive correctly sorted results in descending order