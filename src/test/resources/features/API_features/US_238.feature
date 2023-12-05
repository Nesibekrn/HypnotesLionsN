@US_238
  Feature:Therapist add new client and update
    Background:
      Given the user take token from api
      Scenario:As a user, I should be able to update any client on therapist client Api section
        Given the user request to add a new client from api
        Then the user request to update the client from api
