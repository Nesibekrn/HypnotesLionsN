@US_227
  Feature: Therapist creates individual session and delete
    Background:
      Given the user take token from api
      Scenario:
        Given the user request to add new individual session
        And the user verify that response is success
        And the user deletes individual session
        Then the user verifes session is deleted from api
