@TherapistQuestionnaire   @DB
Feature:Add Client

  Scenario: TC01_ adding new client_API and Validate_new_client_Database

  #Given user should be able access as therapist
  When user sends post request request to add new  client
    Then user find Client
    Then user Validate data
    And user delete client in API


