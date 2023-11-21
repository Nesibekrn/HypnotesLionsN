@UI @Therapist
@US_087
Feature: Register Services - Register Clients options

  Background: User is on the Calender page
    Given the user clicks on Calendar button

  @US_087
  Scenario: User creates an appointment with the Register Services - Register Clients options
    When user select any date
    Then Repeat Options dropdown menu should be appear
    Then Repeat Options dropdown menu should be functional
    Then Various options should appear in the Repeat Options dropdown menu
    And Any option should be selectable in the Repeat Options section
    And The repeat option should not appear when Does not repeat is selected
    And Repeat times drop down menu should be visible when any of the Daily, Weekly, Biweekly, Monthly options are selected
    And A number should be selectable from the Repeat times dropdown menu




