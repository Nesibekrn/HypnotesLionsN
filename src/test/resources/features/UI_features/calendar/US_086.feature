@UI @Therapist
Feature: Register Services - Register Clients options

  Background: User is on the Calender page
    Given the user clicks on Calendar button

  @UI @Therapist
  Scenario: Verify the current day is visible with a different color
    When user should see the current day
    Then the current day should be visible with a different colour

  @UI @Therapist
  Scenario: Verify after user selecting any date 'Schedule an Appointment' page appear
    When user select any date
    Then "Schedule an Appointment" page should be appeared
    And Registered Services default should be appeared in the Select Service Type section
    When user see the Service menu
    Then user clicks on Service menu button
    And user should see the services
    Then user should see Location dropdown menu
    And location dropdown menu should be clickable
    Then any location can be selected in the location drop down menu
