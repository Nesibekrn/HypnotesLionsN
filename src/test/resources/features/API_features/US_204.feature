#As a user, I should be able to get all meeting information on Calendar Api pge
  #Dashboard - therapist- client
  #User needs to be logged in to get response.
  #https://test.hypnotes.net/api/settings/meeting/get
  #Details on the swagger document.
Feature: All meeting
  Scenario: Get all meeting info API
    Given the user sends a request to get all meeting info on the Hypnotes calendar page
    #Then user verifies that status code is 200
    And the user verifies id of client

