@UI @US_083
@TherapistLoginUSA
Feature: Group Session Creation

  Background:
    Given a Therapist User is logged
    And the user clicks on the Services page
    When the user clicks on the Group Session button

  @UI @US_083
  @TherapistLoginUSA
  @smoke
  Scenario: Creating a new Group Session
    Then the user clicks on the Add New Group Session button
    Then the Adding Group Session page should appear
    When the user enters a valid name in the Name field
    And enters a valid price in the Price field
    And activates the Show service price on the initial scheduler page button
    And selects any duration from the Duration drop-down menu
    And activates the Show service price on the initial scheduler page button
    And activates the Payment Required button
    And activates the Service Active button
    And selects required documents from the Required Forms and eSign Documents menu
    And checks the Would you like this service to be provided online? menu
    And enters a location in the Session Locations field
    And enters attendees in the Maximum Number Of Attendees field
    And adjusts the cursors on the right of the menus for increasing and decreasing numbers
    And selects a Date from the Date calender menu
    And selects a Time from the Time panel
    And adds various notes to the Session Description optional section
    When the user clicks the Save button
    And the Group Session has been added message should appear

  @UI @US_083
  @TherapistLoginUSA
  Scenario: Canceling Group Session Creation
    Then the user clicks on the Add New Group Session button
    Then the Adding Group Session page should appear
    When the user clicks the Cancel button
    Then the Add New Group Session page should appear

  @UI @US_083
  @TherapistLoginUSA
  Scenario: Verify that multiple warning message are displayed under the relevant field once user clicks on the save button without filling fields
    Then the user clicks on the Add New Group Session button
    Then the Adding Group Session page should appear
    When the user leaves the Group Session fields as empty
    When the user clicks on the save button on the Adding Group Session page without entering necessary information
    Then warning messages are displayed under the relevant fields for
      | Group Name                  | Please enter Form Name                    |
      | Price-USD                   | Please enter Price                        |
      | Duration                    | Please enter Duration                     |
      | Maximum Number Of Attendees | Please enter maximum number of attendees  |
      | Date Session                | Enter Date                                |
      | Time Session                | Please enter Time                         |

  @UI @US_083
  @TherapistLoginUSA
  Scenario: Viewing the Added Group Session
    Then the added Group Session should appear in the session table
