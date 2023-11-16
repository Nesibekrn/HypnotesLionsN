Feature: Login

  Scenario: Login api
    Given the user sends a request to log in to Hypnotes
    Then the user verify that status code is 200
    And the user verify authenticated is true
    And the user get phpSessId

  Scenario: Login from APIUtilities
    Given the user login from api utilities

  Scenario: Login from APIUtilities with Enum
    Given the user login from APIUtilities with Enum

  Scenario: get user id with api
    Given the user login from APIUtilities with Enum
    Then the user gets user id from response
