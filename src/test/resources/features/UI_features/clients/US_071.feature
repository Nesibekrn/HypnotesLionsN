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
    Then use