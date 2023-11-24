#As a user, I should be able to update  block times that was created before with using API endpoints
#Dashboard - therapist - calendar- block time - Recurring Date and Time
#User needs to be logged in to get response.
# https://test.hypnotes.net/api/hypnotherapist/timeoff/update
#Details on the swagger document.
Feature:Recurring block time update
  Scenario:Recurring Day Block Time update
   Then user creates a Recurring Block Time from api
    Then user updates a Recurring Block Time from api
    And user verifies status is true
    And user verifies that response is as expected
   Then user deletes the recurring Block Time from api