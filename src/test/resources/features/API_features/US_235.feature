@API_F
Feature:As a user, I should be able to delete any session on  Group Session  with using API endpoints on Services module

  Scenario: User needs to be delete any session on  Group Session into post response through API
    When user sends Post request to add group session
    Then user validates the response for add group session
    And user sends Post request to update group session
    Then user validates the response for update group session
    And user sends Post request to delete group session
    Then user validates the response for delete group session
  @US235
  Scenario: User needs to be delete any session on  Group Session
    When user sends Post request to add Category Type Group Session
    Then user verify the response Category Type Group Session is added
    And user sends Post request to update Category Type Group Session
    Then user verify the response Category Type Group Session is updated
    And user sends Post request to delete Category Type Group Session
    Then user verify the response Category Type Group Session is deleted
    #Dashboard - therapist -Services- Group Session
    #https://test.hypnotes.net/api/settings/meeting/categoryType/deleteCategoryType
    #Therapist needs to delete any session on  Group Session  endpoint