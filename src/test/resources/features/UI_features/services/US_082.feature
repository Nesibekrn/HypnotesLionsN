Feature: Adding new packages functionality

  Scenario: Verify that the user is able to view Add New Packages  field once clicks on the Package tab
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    Then Add New Package field is displayed


    Scenario:Verify that the user is able view relevant page when clicked on the add new Package button
      Given the user clicks on the  Services title
      And the user clicks on the Packages tab
      And Add New Package field is displayed
      When the user clicks on the Add New Package title
      Then the relevant page is opened


      Scenario: Verify that the user is able enter valid values on the Package Name field
        Given the user clicks on the  Services title
        And the user clicks on the Packages tab
        And Add New Package field is displayed
        And the user clicks on the Add New Package title
        When the relevant page is opened
        Then the user is able to enter valid values on the Package Name field

  Scenario: Verify that  the Package Name field should not accept  space as a name
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    When user enters a space on the Package Name field
    Then A warning message should be displayed

  Scenario: Verify that multiple warning message are displayed under the relevant field once user clicks on the save button without filling fields
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    And the user leaves the Package field as empty
    When the user clicks on the save button on the Add New package page
    Then below  warning messages are displayed under the relevant fields
      | Package Name                   | Please enter Form Name                                           |
      | Price-USD0                     | Please enter Price                                               |
      | Duration                       | Please enter a valid appointment duration.                       |
      | Buffer Time Before Appointment | Enter the amount of Buffer Time required before the appointment. |
      | Buffer Time After Appointment  | Buffer Time After Appointment                                    |
      | Advance Notice-Service         | This field is required                                           |
      | Total Sessions                 | Please enter total session                                       |
      | Session Intervals              | Please enter session interval                                    |
      | Description                    | Please enter a description of the service package.               |


  Scenario: Verify that the user is able to select Meeting Type
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    And the user clicks on the Meeting Type
    Then the below fields are displayed
      | Standard           |
      | Phone Consultation |
    And the user is able select Phone Counsultation


    Scenario: Verify that the Price field is functional and a valid price is entered
      Given the user clicks on the  Services title
      And the user clicks on the Packages tab
      And Add New Package field is displayed
      And the user clicks on the Add New Package title
      When the relevant page is opened
      Then the user enters a valid values on the price field
      And Show service price on the initial scheduler page button is activated

      #Duration drop down
   Scenario: Verify that the user is able to enter a positive value on the Duration field
  Given the user clicks on the  Services title
  And the user clicks on the Packages tab
  And Add New Package field is displayed
  And the user clicks on the Add New Package title
  When the relevant page is opened
  Then the user clicks  the Duration field
     Then the user enters a positive value on  Duration field



  Scenario: Verify that Duration field must be functional and the number value should be able to entered
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    And the user clicks on Duration field
    Then the user verfies Duration is functional and enters  value
    And the user is able to select value from dd




  Scenario: Verify that the Duration field does not accept negative numbers and alpha characters
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    And the user clicks on the Duration field
    When the user enters negative value as a "-5"
    Then the warning message 'Please enter a valid appointment duration.' is displayed
    And the user enters a string value 'fdfsd"
    Then the warning message 'Please enter a valid appointment duration.' is displayed


Scenario: Verify that Buffer Time Before Appointment (min) field is functional and the user is able to enter  a number value
  Given the user clicks on the  Services title
  And the user clicks on the Packages tab
  And Add New Package field is displayed
  And the user clicks on the Add New Package title
  When the relevant page is opened
  When the user clicks on the Buffer Time Before Appointment (min) field
  Then Buffer Time Before Appointment (min) field is enabled
  And the user is able to enter a valid value on Buffer Time Before Appointment (min) field


  Scenario: Verify that Buffer Time After Appointment (min) field is functional and the user is able to enter  a number value
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    When the user clicks on the Buffer Time After Appointment (min) field
    Then Buffer Time After Appointment (min) field is enabled
    And the user is able to enter a valid value on Buffer Time After Appointment (min) field



  Scenario: Verify that The Advance Notice menu is functional, the cursors on the right of the menu is functional, Numbers are  increased and decreased.
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    Then The Advance Notice menu is enabled
    And the cursors on the right of the menu is  functional
    And the user is able to incrase or decrase the values


Scenario: Verify that  Service Active button and Payment Required buttons are functional
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    Then Service Active button and Payment Required buttons are functional


  Scenario: Verify that  the user is able to select a document from Required Forms and eSign Documents field
   # Pre-request:A document is added from documents menu
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    Then the user is able to select a document from Required Forms and eSign Documents field



Scenario: Verify that  Would you like this service to be provided online? menu is checked
  Given the user clicks on the  Services title
  And the user clicks on the Packages tab
  And Add New Package field is displayed
  And the user clicks on the Add New Package title
  When the relevant page is opened
  Then Would you like this service to be provided online? menu is be checked


  Scenario: Total Sessions, Session Interval (Weeks) menus must be functional, the cursors on the right of the menu must be functional,  Numbers should be increased or decreased
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    And Total Sessions, Session Interval (Weeks) menus are functional
    And the cursors on the right of the menu must be functional
    Then Numbers should be increased or decrased


  Scenario: Verify that the user is able to enter values on Description section
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    Then the user is able to enter vales on the Desvcription section
#save
  Scenario: Verify that the user is able to create a new package
    Given the user clicks on the  Services title
    And the user clicks on the Packages tab
    And Add New Package field is displayed
    And the user clicks on the Add New Package title
    When the relevant page is opened
    And the user fills all mandatory fields with valid values
    When the user clicks on the Save button on add new package page
    Then a new package is created

#cancel
    Scenario: Verify that the Add New Package page is appeared when the user clicks to Cancel button
      Given the user clicks on the  Services title
      And the user clicks on the Packages tab
      And Add New Package field is displayed
      And the user clicks on the Add New Package title
      When the relevant page is opened
      When the user clicks to Cancel button
      And the Add New Package page is appeared

















