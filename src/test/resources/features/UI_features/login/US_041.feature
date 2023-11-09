@UI
Feature: After logging in as Therapist I should be able to see the Dashboard page

  Background:
    Given  user Login
  @UI
  Scenario: Dashboard should be clickable and relevant page should be visible

    When user verifies the Dashboard button is clickable and clicks
    Then user sees the Dashboard page