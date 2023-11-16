@UI @US_085 @Therapist
  Feature: Perform various actions in the calendar page
    Background:
      And the user clicks on Calendar button
      And the user verifies Calendar page

      Scenario: As a user I should be able perform Schedule duration menu
        Given the user verifies schedule menu is functional
        And the user clicks on the schedule menu
        And the user verifies below menu is selectable
          | Month  |
          | Week   |
          | 3 Days |
          | Day    |
        And the user clicks and verifies the month page
        And the user verifies next month button is active
        And the user clicks on the next button
        And the user verifies related month page
        And the user clicks on the Week
        And the user view  rows at the week page
        And the user clicks on the Three Days
        And the user verifies related Three Days page
        And the user clicks on the Day
        And the user verifies related Day page

    Scenario: As a user I should able to verify Calendar menu
      Given the user verify that Schedule an Appointment button is clickable
      And the user clicks and verifies related page title is "Schedule an Appointment"
      And the user verifies that Add New event button is clickable
      And the user clicks and verifies that related page title is "Add Event"
      And the user verifies that Block Time button is clickable
      And the user clicks and verifies that page title is "Block Dates"
      And the user verifies that Scheduling Setting button is clickable
      And the user clicks and verifies that related page is "https://test.hypnotes.net/dashboard/settings"




