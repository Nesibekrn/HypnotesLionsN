@UI
@Therapist
@US_072
 @HL-371
Feature: Therapist Management (Client Info)
@TEST_HL-370
    Scenario: As a user, I must be able to perform various actions in the Attachments section.
   When user clicks on Client button
    And user clicks on the client name
    Then user should be able access Client Info page
    When the user clicks on the Sessions button
    And the user clicks the Add new session button
    Then user should be able to see Attachments in the added session
    When user clicks on the plus circle icon under attachments
    Then user should be able to see choose file button
    And user adds a new file
    Then user verifies the success message is "1 file added."
