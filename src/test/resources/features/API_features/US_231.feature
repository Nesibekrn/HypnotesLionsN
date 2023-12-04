#As a user, I should be able to delete any session on  Packages sessions with using API endpoints
# on Services module
#Dashboard - therapist -Services- Packages session
#https://test.hypnotes.net/api/settings/meeting/categoryType/deleteCategoryType
#Therapist needs to delete any session on  Packages sessions endpoint
Feature: US_231 Api
  Scenario: Deleting any session on Packages sessions
    Given user login to website
    Then the api responds with a status code 200
    When user makes a post request to delete any session on package session
    And the package session should be successfully deleted from the website
    Then the user add new category type