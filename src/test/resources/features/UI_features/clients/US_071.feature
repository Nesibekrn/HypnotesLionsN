#AYSE ARI
#As a user, I should be able to update in Session	Sessions
#	"Note updated" warning should be seen after Key Points update
#	Key Points, Applications & Suggestions güncellendikten sonra ''Note updated'' warning should appear
#	"After Thoughts updated" warning should be seen after After Thoughts update
@UI @Therapist @US_071
Feature: As a user (Therapist),I should be able to update in Session	Sessions

  Background:
    Given user clicks on Client button
    When user clicks on  client name

  @UI @Therapist @US_071
  Scenario: US_071_TC_01
    When the user clicks on the Sessions button
    Then user updates the "keyPoints" field
    And user verifies "Note Updated" message seen on the page
    Then user updates the "afterThoughts" field
    And user verifies "After thoughts updated" message seen on the page
    Then user updates the "suggestions" field
    And user verifies "Note Updated" message seen on the page