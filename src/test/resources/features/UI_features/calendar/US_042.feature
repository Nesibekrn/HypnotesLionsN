@UI @US_042
  Feature: The Calendar page must be seen
    Background:
    Given user login as therapist

    Scenario:As a Therapist I should be able to see the Calendar page
      Given the user verifies that Calendar button is clickable
      And the user clicks on Calendar button
      Then the user verifies Calendar page