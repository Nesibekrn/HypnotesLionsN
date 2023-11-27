@API
Feature: Event Management API

  Scenario: User logs in with valid credentials
    Given the user has API base URL
    And the user has valid login credentials
    When the user sends a POST request to the valid username and password
    Then the API responds with a status code 200
    And the response contains an authentication token
    And the user gets phpSessid

  Scenario: Create a new event
    When the user makes a POST request to create event details
    Then the API responds with a status code 200
    And the event should be successfully created in the system


  Scenario: Get all events information
    When the user makes a POST request to get all events
    Then the API responds with a status code 200
    And the response should contain a list of events


  Scenario: Update an existing event
    When the user makes a POST request to update event details
    Then the API responds with a status code 200
    And the event should be successfully updated in the system


  Scenario: Delete an event
    When the user makes a POST request to delete a specific event
    Then the API responds with a status code 200
    And the event should be successfully deleted from the system


   #"Dashboard - therapist - calendar
   #User needs to be update existing event
   #https://test.hypnotes.net/api/event/updateEvent
   #Details on the swagger document."
