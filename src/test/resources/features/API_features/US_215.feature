Feature: As a user, I should be able to delete  block times that was created before with using API endpoints

  Scenario: User needs to be delete date  Interval into post response through API

    Given user sends a request to log in to home page
    * user adds a date into the date interval button
    * user verifies that status code is 200
    * user deletes date  block times that was created before with using API endpoints
    Then verify status is true
