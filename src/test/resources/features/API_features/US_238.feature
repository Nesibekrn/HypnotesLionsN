@US_238
  Feature:Therapist add new client and update
    Background:
      Given the user take token from api
      Scenario:As a user, I should be able to update any client on therapist client Api section
        Given the user request to add a new client from api
        And the user validates the response for add new client
        And the user request to update the client from api
        Then the user verifies client is updated

