Feature: Therapist Management (Client Info)
  @UI
  @therapist
    @US_072
    Scenario: As a user, I must be able to perform various actions in the Attachments section.
   When user clicks on Client button
    And user clicks on the client name
    Then user should be able to Client Info page
    When user adds a session
    And user clicks on the choose file in the attachment
    Then user should be able to add a file to the attachments
    Then user should see "1 files added." message