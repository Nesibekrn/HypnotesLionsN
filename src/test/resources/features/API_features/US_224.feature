Feature: Services/ Individual Session

  Background:
    Given user gets phpSessid for authentication

  @US_224
  Scenario: As a user, I must be able to add new individual session with using API endpoints on Services module
    When user sends a post request to add a new individual session
    Then user verifies the title,meeting type,duration
    When user sends the request to get all individiual sessions
    Then user should see the added session in this list
    When user sends the request to delete added session
    Then added session should be deleted successfully.