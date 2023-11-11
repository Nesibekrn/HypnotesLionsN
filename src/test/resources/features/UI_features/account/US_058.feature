@UI  @US_058 @TherapistLoginUSA
Feature: As a user (Therapist), I should be able to perform various actions in the Profile(Specialties & Certifications) section
Background:
  And the user clicks on the account logo
  And the user clicks on the profile
  Then user click the certifications button
@HL-341
  Scenario: TC_01 Therapist can add some specialities from the profile section
    Then user verifies that the add new certificate button should be visible.
    Then Verify that the attached certificate is visible.
@HL-342
  Scenario: TC_02 Verify Visibility of Fields on Add License/Certification Page
    Then user click the add new certificate button
    Then Verify that add license  or certification screen should be visible
    Then Verify that all input title should be visible
    Then Verify that the "Save" and Cancel buttons are functional
@HL-343
  Scenario: TC_03 Verify Functionality of Add Certificate Fields and Buttons
      Then user click the add new certificate button
      Then user enter the valid info to the certification field
      Then User click the save button
      Then Verify that certificate is added successfully message



