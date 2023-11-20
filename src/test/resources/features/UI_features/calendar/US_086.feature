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







  #As a user, I should be able to perform various actions to create an appointment with the Register Services - Register Clients options
    #Registered Service-Registered Clients-Part 1
    #The current day should be visible with a different color
    #When the user select any date, the 'Schedule an appointment' page should appear
    #Registered Services default should appear in the Select Service Type section
    #Service dropdown menu must be functional
    #Registered Services should appear in the service drop down menu
    #Any service can be selected in the service drop down menu.
    #Location dropdown menu should be functional
    #Various options should be visible in the location dropdown menu
    #Any location can be selected in the location drop down menu