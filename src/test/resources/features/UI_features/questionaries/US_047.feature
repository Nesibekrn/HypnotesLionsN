@UI @Therapist
Feature:Questionnaires Page

  @UI @Therapist @HL-15  @HL_323
  Scenario:Questionnaires section should be clickable and relevant page should be visible
    When User should see Questionnaires section
    And Questionnaires button should be clickable
    Then User clicks on Questionnaires section button
    Then relevant page "https://test.hypnotes.net/dashboard/questionnaires" should be visible