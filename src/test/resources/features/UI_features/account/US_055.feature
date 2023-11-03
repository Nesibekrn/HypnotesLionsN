@UI @US_055 @Therapist
  Feature:Profile(Educations) section must perform with various actions
    Background:
      And the user clicks on the account logo
      And the user clicks on the profile

   Scenario:As a user I should able to view new education page
     Given the user clicks Add new Education button
     And the user verifies that related page is appeared
     Then the user verifies that below fields are displayed
       | School Name |
       | Department  |
       | Start Date  |
       | End Date    |
       | Description |
       | Save        |
       | Cancel      |

     Scenario: As a user I should able to fill valid values on the fields
       Given the user is able to fill values on the below fields
         | Camridge   |
         | SDET       |
         | 11/03/2023 |
         | 11/10/2023 |
         | EXCELLENT  |
       And the user clicks on the save button
       Then the user verifies the added message

    Scenario:Verify that user is able to update and delete training
      Given the user clicks on update buton
      And the user update and clicks save buton
      Then the user verifies updated message is visible
      And the user clicks on delete buton
      Then the user verifies delete message is visible









