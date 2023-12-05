@API_232
Feature: Add Group Session
  Scenario: Therapist add new group session
    Given User login to the system as therapist
    When User sent a Post request to the "https://test.hypnotes.net/api/settings/meeting/categoryType/addCategoryType"
    Then The User verifies that status code is 200
    And verify that title is Group Session

