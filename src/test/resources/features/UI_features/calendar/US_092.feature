@UI @US_092 @Therapist
Feature: Calendar(Meeting Info)
  @TC_001
  Scenario: User must be able to see Meeting Details page when the created appointment is clicked
    When user clicks on 1 more text on any date on the calendar
    And user clicks on particular appointment
    Then user should see "Meeting Details" page
    When user clicks on Google button on meeting details page
    Then user verifies that google calendar page is displayed
    When user clicks on Outlook button on meeting details page
    Then user verifies that outlook calendar page is opened


