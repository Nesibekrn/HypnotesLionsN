 @US247 @TherapistQuestionnaire
Feature: US_247
  Scenario:As a user, I should be able to delete any Questionnaires



    //Given user should be able access as therapist
    When user sends post request request to add new Questionnaires
    And user sends post request request to delete any Questionnaire
    Then user assert for delete