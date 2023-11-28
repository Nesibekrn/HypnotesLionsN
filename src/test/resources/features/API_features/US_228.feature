Feature: As a user, I should be able to add new Packages with using API endpoints on Services module
  Background:
    Given user take token from api
  Scenario: Verify that api/settings/meeting/category/add is executed with valid payload, it returns 200 success code
    When the user sends POST request to api/settings/meeting/category/add
    Then the  200 status code is returned for api/settings/meeting/category/add