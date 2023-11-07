@UI @US_070 @Therapist
  Feature:Session must be deleted
   Background:
    And the user click on the Clients page
    And the user clicks on the View Details button
    And the user clicks on the sessions button
   Scenario:The user should be able to delete the Session
    Given the user clicks on the delete button
      And the user verifies delete Session message
      And the user verifies yesNo buttons functionalities
      And the user clicks on the yes button
      And the user verifies deleted popup message





