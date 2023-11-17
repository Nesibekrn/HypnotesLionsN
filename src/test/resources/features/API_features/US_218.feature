@API @US218
Feature: As a user, I should be able to update  block times that was created before with using API endpoints

  Scenario: User needs to be add block times into post response through API
    When user sends Post request to add block times
    Then user validates the response

  Scenario: User needs to be update  block times into post response through API
    When user sends Post request to update block times
    Then user validates the response

  Scenario: User needs to be delete block times into post response through API
    When user sends Post request to delete block times
    Then user validates the response

  Scenario: User needs to be all block times into post response through API
    When user sends Post request to all block times
    Then user validates the response
    #Dashboard - therapist - calendar- block time - Specific Date & Time
    #User needs to be logged in to get response.
    #https://test.hypnotes.net/api/hypnotherapist/timeoff/update
    #Details on the swagger document.