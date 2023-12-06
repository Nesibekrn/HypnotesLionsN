Feature: As a user, I should be able to update any session on  Group Category
  with using API endpoints on Services module
  Scenario: Update Group Session
    Given user get token with ApiUtilities
    When user send Post Request to add Group Category
    And user send Post Request to update Group Category
    Then user verifies response body from update request
    When user send Post Request to delete Group Session
    Then user verifies response from delete request