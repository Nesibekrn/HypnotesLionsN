@UI @US_083
@TherapistLoginUSA
Feature: Group Session Creation


  Background:
    Given a Therapist User is logged
    And the user clicks on the Services page
    When the user clicks on the Group Session button

  @UI @US_083
  @TherapistLoginUSA
  Scenario: Creating a new Group Session
    Then the user clicks on the Add New Group Session button
    Then the Adding Group Session page should appear

    When the user enters a valid name in the Name field
    And selects a meeting type from the meeting type menu
    And enters a valid price in the Price field
    And activates the Show service price on the initial scheduler page button
    And selects any duration from the Duration drop-down menu
    And enters a number value in the Buffer Time Before Appointment min field
    And enters a number value in the Buffer Time After Appointment min field
    And selects a value from the Advance Notice menu
    And adjusts the cursors on the right of the menu for increasing and decreasing numbers
    And activates the Show service price on the initial scheduler page button
    And activates the Payment Required button
    And activates the Service Active button
    And selects required documents from the Required Forms and eSign Documents menu
    And checks the Would you like this service to be provided online? menu
    And enters values in the Total Sessions and Session Interval Weeks menus
    And adjusts the cursors on the right of the menus for increasing and decreasing numbers

    And adds various notes to the Description section
    And adds various notes to the Terms & Conditions section

    When the user clicks the Save button
    Then an individual session should be created
    And the Group Session has been added message should appear

  Scenario: Canceling Group Session Creation
    Then the user clicks the Edit button
    When the user clicks the Cancel button
    Then the Add New Group Session page should appear

  Scenario Outline: Validation for Group Session Creation
    Given the user is on the Adding Group Session page
    When the user tries to save without entering "<Field1>", "<Field2>", "<Field3>", and "<Field4>" information
    Then a validation message should appear stating that the group session cannot be created without entering the required information

    Examples:
      | Field1                             | Field2                        | Field3                 | Field4                                          |
      | Name                               | Meeting Type                  | Price                  | Duration                                        |
      | Maximum Number Of Attendees        | Date Time Session             | Description            | Information                                     |

  Scenario: Viewing the Added Group Session
    Then the added Group Session should appear in the session table
