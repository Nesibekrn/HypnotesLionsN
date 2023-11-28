@API @US235
Feature:As a user, I should be able to delete any session on  Group Session  with using API endpoints on Services module
  Scenario: User needs to be delete any session on  Group Session into post response through API
    When user sends Post request to add group session
    Then user validates the response for add group session
    And user sends Post request to update group session
    Then user validates the response for update group session
    And user sends Post request to delete group session
    Then user validates the response for delete group session

    #Dashboard - therapist -Services- Group Session
    #https://test.hypnotes.net/api/settings/meeting/categoryType/deleteCategoryType
    #Therapist needs to delete any session on  Group Session  endpoint