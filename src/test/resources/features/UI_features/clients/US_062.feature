#AYSE ARI
# As a user (Therapist), I should be able to perform various actions in the Edit section
#	The Edit button should be visible and when clicked, the relevant page should be seen.
#	Show other fields button must be functional. When clicked, other fields should be seen.
#	After various edits, the page should be client info updated.
@UI @Therapist @US_062
Feature: As a user (Therapist), I should be able to perform various actions in the Edit section

  Background:
    Given user clicks on Client button
    When user clicks on  client name

  @UI @Therapist @US_062
  Scenario: US_062_TC_01
    When user verifies the edit button is visible
   Then user verifies that the relevant page of edit button is disable
    And user verify that show other fields button is not clicked


  @UI @Therapist @US_062
  Scenario: US_062_TC_02
    When user verifies the edit button is visible
    Then user clicks on the edit button
    And user edit middle  name of the client
    Then user verify that show other fields button is clicked
    And user verify that after clicking show other fields button the relevant page is enable
    Then user edit Guardian Email of the client
    And user clicks on the save button after editing various information
    Then the user clicks on the yes button
    And the user verifies that client info has been successfully updated popup message is visible
