Feature:Profile(Educations) section must perform with various actions
  Background:
    And the user clicks on the account logo
    And the user clicks on the profile

  @UI @US_055 @Therapist
  Scenario: Verify that the user is able to view and click on the Add New Your Company button and page
    When the user is able to view and click on the Add New Education button

  @UI @US_055 @Therapist
  Scenario: Verify that School Name, Department,Start Date,End Date,Description,Save,Cancel titles should be visible
    When the user clicks on the Add New Education button
    And the user verifies that below titles are displayed
      | School Name |
      | Department  |
      | Start Date  |
      | End Date    |
      | Description |
      | Save        |
    Then user verifies that Cancel buton is visible

  @UI @US_055 @Therapist
  Scenario: As a user I should able to fill valid values on the fields
    When the user clicks on the Add New Education button
    Given the user enter School name
    And the user enter Department
    And the user enter Start Date
    And the user enter End Date
    And the user enter Description
    And the user clicks on the save button
    Then the user verifies the added message
  @UI @US_055 @Therapist
  Scenario:Verify that user is able to update and delete training
    Given the user clicks on update buton
    And the user update and clicks save buton
    Then the user verifies updated message is visible
    And the user clicks on delete buton
    Then the user verifies delete message is visible
    And the user clicks OK button
    Then the user verifies that education is deleted









