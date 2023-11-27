@UI @TherapistFtm
Feature: As a user, I should be able to schedule an Appointment

  Background:
    Given user clicks on Clients button
    And user clicks Schedule an Appointment at the selected client
  @US_093
  Scenario: TC01
    When user selects service at the Service section
    And user selects Online at the Locations section
    * user selects tomorrows date at the calendar
    * user select available hours at the Available Hours section
    * user clicks Yes at the Confirm This Time? message
    * user clicks Click here to send the document
    * user clicks Sent to Client button and can see Sent to Client message
    * user clicks Next button and can see Confirm Meeting Details
    * user can see Notify client checkbox is clicked
    * user can see Send a confirmation email to the client. checkbox is clicked
    * user clicks Submit button
    * user can see Meeting Details
    * user clicks Close button and user see clients page

     # * user clicks Open Document button and see the document

