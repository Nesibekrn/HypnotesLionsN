#As a user, I should be able to update  block times that was created before with using API endpoints
#Dashboard - therapist - calendar- block time - Recurring Date and Time
#User needs to be logged in to get response.
# https://test.hypnotes.net/api/hypnotherapist/timeoff/update
#Details on the swagger document.
Feature:Update
  Scenario:Updating block times
    Given the user login to the website
    When the user create a new block time
    Then  the user verify if the rspond is correct
    And the user update the block time
    And the user compares the results and respond body
