@UI @Therapist
@US_087
Feature: Register Services - Register Clients options

#  Background: User is on the Calender page
#   Given the user clicks on Calendar button
#    And the user verifies Calendar page

  @UI
  @Therapist
  @US_087
  Scenario:US_087 TC_01 User creates an appointment with the Register Services - Register Clients options
#    Given the user clicks on "Dashboard" title on Dashboard menu
#   Given the user clicks on Calendar button
    When user select a date
    Then Repeat Options dropdown menu should be appear
    Then Repeat Options dropdown menu should be functional
    And user verifies "Does not repeat" option is default
    And Any option should be selectable in the Repeat Options section
      | Daily           |
      | Weekly          |
      | Biweekly        |
      | Monthly         |

Scenario:US_087 TC_02  Repeat times
  When user select a date
  When user clicks on any options
  Then user sees repeat times
  And A number should be selectable from the Repeat times dropdown menu
    And The repeat option should not appear when Does not repeat is selected




