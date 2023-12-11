Feature: Update any Questionnaires on therapist Questionnaires Api section
  Scenario: Verify Therapist user is able to update any Questionnaires on Questionnaires Api section
    Given  user logs in website
    And user adds new category to do questionnaires
    And user requests to update the new category from Api
    Then user verifies new category is updated

