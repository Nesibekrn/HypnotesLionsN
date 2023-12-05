@US_227
  Feature: Therapist creates individual session and delete
    Background:
      Given the user take token from api
      Scenario:
        Given the user request to add individual session category
        And the user verify that category is added
        And the user deletes individual session category
        Then the user verifies session is deleted from api
