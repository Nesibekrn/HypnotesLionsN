@DB @US_304
Feature: As a therapıst, when i should add new educatıon on your profıle then I Should be able to see new clıent  in the correct  schema and columns in DB
  Scenario:  TC01 adding new education to the api  and Validate new education from database

    Given user login the website as a therapist
    When user sends post request request to add new education
    Then user find the new education
    Then user validate the data from database
    Then user delete new education from the api
