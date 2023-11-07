@UI
Feature:Questionnaires Page

  @UI @Therapist
  Scenario:User goes to Questionnaires page
    When User should see Questionnaires section
    And Questionnaires button should be clickable
    Then User clicks on Questionnaires section button
    Then relevant page "https://test.hypnotes.net/dashboard/questionnaires" should be visible