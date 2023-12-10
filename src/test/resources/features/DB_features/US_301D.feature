@US_301
Feature: Adding a new client to our database
  Scenario: As a clıent, when i should sign up then Should be able to see new user information
  in the correct user schema and columns
    Given the user register to the system
    Given the user connect to the database
    Then the user verifies the last client is the same with database
