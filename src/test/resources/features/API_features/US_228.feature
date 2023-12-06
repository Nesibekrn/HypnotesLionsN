Feature: As a user, I should be able to add new Packages with using API endpoints on Services module
  Background:
    Given the user takes token from api
  Scenario: Verify that api/settings/meeting/categoryType/addCategoryType api is executed with valid payload, it returns 200 success code
    Given the user adds individual session category
    And the user verifies that category is added
    And the  status code is 200
