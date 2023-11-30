@UI @TherapistLoginUSA

Feature: Adding new packages functionality
  Background:
    Given the user clicks on the  Services title on the left side menu
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    When the user clicks on the Add New Package title

    Scenario: Verify that the user is able view relevant page when clicked on the add new Package button
      Then the user is able view relevant page



      Scenario: Verify that the user is able enter valid values on the Package Name field
        Then the user is able to enter valid values on the Package Name field

  Scenario: Verify that  the Package Name field should not accept  space as a name
    When user enters a space on the Package Name field
    Then A warning message should be displayed

  Scenario: Verify that multiple warning message are displayed under the relevant field once user clicks on the save button without filling fields
    And the user leaves the Package fields as empty
    When the user clicks on the save button on the Add New package page
    Then below  warning messages are displayed under the relevant fields
      | Package Name                   | Please enter Form Name                                           |
      | Price-USD0                     | Please enter Price                                               |
      | Duration                       | Please enter Duration                                            |
      | Buffer Time Before Appointment | Enter the amount of Buffer Time required before the appointment. |
      | Buffer Time After Appointment  | Enter the Buffer Time after the appointment.                     |
      | Advance Notice-Service         | This field is required                                           |
      | Total Sessions                 | Please enter total session                                       |
      | Session Intervals              | Please enter session interval                                    |
      | Description                    | Please enter a description of the service package.               |


  Scenario: Verify that the user is able to select Meeting Type
    And the user clicks on the Meeting Type
    Then the below meetingType fields are displayed
      | Standard (Online or in-person) |
      | Phone Consultation             |
    And the user is able select Phone Counsultation


    Scenario: Verify that the Price field is functional and a valid price is entered
      Then the user enters a valid values on the price field
      And Show service price on the initial scheduler page button is activated

      #Duration drop down
   Scenario: Verify that the user is able to enter a positive value on the Duration field
  Then the user clicks on the Duration field
     Then the user enters a positive value as "5" on  Duration field



  Scenario: Verify that Duration field must be functional and the number value should be able to entered
    And the user clicks on the Duration field
    Then the user verifies Duration is functional
    And the user is able to select "130" from dd




  Scenario: Verify that the Duration field does not accept negative numbers and alpha characters
    And the user clicks on the Duration field
    When the user enters negative value as a "-5"
    Then the warning message "Please enter a valid appointment duration." is displayed
    And the user enters a string value "fdfsd"
    Then the warning message "Please enter a valid appointment duration." is displayed


Scenario: Verify that Buffer Time Before Appointment (min) field is functional and the user is able to enter  a number value
  When the user clicks on the Buffer Time Before Appointment (min) field
  Then Buffer Time Before Appointment (min) field is enabled
  And the user is able to enter a valid value on Buffer Time Before Appointment (min) field


  Scenario: Verify that Buffer Time After Appointment (min) field is functional and the user is able to enter  a number value
    When the user clicks on the Buffer Time After Appointment (min) field
    Then Buffer Time After Appointment (min) field is enabled
    And the user is able to enter a valid value on Buffer Time After Appointment (min) field



  Scenario: Verify that The Advance Notice menu is functional, the cursors on the right of the menu is functional, Numbers are  increased and decreased.
    Then The Advance Notice menu is enabled
    And the user is able to increase or decrease the values


Scenario: Verify that  Service Active button and Payment Required buttons are functional
  When the user enters a valid values on the price field
  Then Service Active button and Payment Required buttons are functional




  Scenario: Total Sessions, Session Interval (Weeks) menus must be functional, the cursors on the right of the menu must be functional,  Numbers should be increased or decreased
    And Total Sessions, Session Interval (Weeks) menus are functional
    Then Numbers should be increased or decrased



#save
  @smoke @US82
  Scenario: Verify that the user is able to create a new package
     # Pre-request:A document is added from documents menu
    And the user fills all mandatory fields with valid values
      | Price-USD0                     | 5                                                  |
      | Duration                       | 1                                                  |
      | Buffer Time Before Appointment | 1                                                  |
      | Buffer Time After Appointment  | 2                                                  |
      | Advance Notice-Service         | 1                                                  |
      | Total Sessions                 | 2                                                  |
      | Session Intervals              | 3                                                  |
      | Description                    | Please enter a description of the service package. |
    Then the user is able to select a document from Required Forms and eSign Documents field
    And Would you like this service to be provided online? menu is be checked
    When the user clicks on the Save button on add new package page
    Then the Package has been added message is displayed
    And Added Packages should appear in the package table

  Scenario: Verify that the user is not  able to create a new package with existing package name
    And the user fills all mandatory fields with valid values
      | Package Name                   | zeynep3                                            |
      | Price-USD0                     | 5                                                  |
      | Duration                       | 1                                                  |
      | Buffer Time Before Appointment | 1                                                  |
      | Buffer Time After Appointment  | 2                                                  |
      | Advance Notice-Service         | 1                                                  |
      | Total Sessions                 | 2                                                  |
      | Session Intervals              | 3                                                  |
      | Description                    | Please enter a description of the service package. |
    When the user clicks on the Save button on add new package page
    Then "zeynep3 already in use!" message is displayed
#cancel
    Scenario: Verify that the Add New Package page is appeared when the user clicks to Cancel button
      When the user clicks to Cancel button
      And the Add New Package page is appeared



















