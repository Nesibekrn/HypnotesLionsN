Feature: As a user, I should be able to perform various actions to create an appointment

  Scenario: Create appointment  with the Register Services - Register Clients options
    Given user in the calender page
    When user select any date
    Then user verifies that the date clicked on the Calendar should be visible by default
    And user verifies that date dropdown menu is functional
    And user verifies that any date is selectable from the date dropdown menu
    And user verifies that Time Start, Time End dropdown menus is functional
    And user verifies that Time Start, Time End dropdown is visible at various times
    And user verifies that any time is selectable in the Time Start, Time End dropdown menus
    And user verifies that Registered Clients, New Client (Enter Manually) options is visible under the Select Service Type heading.
    And user verifies that Registered Clients option is able to check
    And user verifies that Clients dropdown menu is functional and any client is selectable from the Clients dropdown menu.
    And user verifies that The Therapist Note screen is functional and notes can be added
    And user verifies that Notify client, Send a confirmation email to the client ,Collect Payment buttons are selectable
    And user verifies that Submit button is clickable
    When user clicks Submit button
    And user verifies that "Meeting Created" message appeared
    And user verifies that meeting appear on the calendar


