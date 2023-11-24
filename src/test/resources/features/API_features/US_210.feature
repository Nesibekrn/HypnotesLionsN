@API @US_210
Feature: Event Management API


  Scenario: Create a new event
    When the user makes a POST request to create event details
    Then the API should respond with a success status code
    And the event should be successfully created in the system


  Scenario: Get all events information
    When the user makes a POST request to get all events
    Then the API should respond with a success status code
    And the response should contain a list of events


  Scenario: Update an existing event
    When the user makes a POST request to update event details
    Then the API should respond with a success status code
    And the event should be successfully updated in the system


  Scenario: Delete an event
    When the user makes a POST request to delete a specific event
    Then the API should respond with a success status code
    And the event should be successfully deleted from the system


   #"Dashboard - therapist - calendar
   #User needs to be update existing event
   #https://test.hypnotes.net/api/event/updateEvent
   #Details on the swagger document."
