@UI
Feature: After logging in as Therapist I should be able to see the Dashboard page

  Background:
    Given  a Therapist User is logged in
    Then user verifies the Dashboard button is clickable
    When user clicks on Client button
    Then user sees the Client page