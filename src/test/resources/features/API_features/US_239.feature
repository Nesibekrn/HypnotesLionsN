Feature: US_239
  Scenario:As a user, I should be able to delete any client on therapist client Api section
    Given the user takes token from login  api
    And user adds a client with api/dashboard/client/add
    Given the user sends a valid endpoint for api/dashboard/client/delete
    And the user verifies that the client is deleted
    And the  status code is 200 success
