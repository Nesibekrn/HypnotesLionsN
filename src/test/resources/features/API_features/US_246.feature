Feature: Update any Questionnaires on therapist Questionnaires Api section
  Scenario: Verify Therapist user is able to update any Questionnaires on Questionnaires Api section
    Given therapist user logs in
    And user adds new catogory to do questionnaries
    And user requests to update the new catogory from Api
    Then user verifies new catogory is updated

