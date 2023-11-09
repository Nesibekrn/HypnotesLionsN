Feature: As a user (Therapist), I should be able to perform various actions in the Profile(Specialties & Certifications) section
  Background:
    And the user clicks on the account logo
    And the user clicks on the profile
  @UI @US_059 @TherapistLoginUSA
    Scenario: TC_01 Therapist can add some specialities from the profile section

    Then user click the certifications button
    Then user verifies that the add new certificate button should be visible.
    Then Verify that the attached certificate is visible.

