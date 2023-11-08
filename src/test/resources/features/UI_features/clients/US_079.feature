Feature:  Import clients functionality


  @UI @US_079 @TherapistLoginUSA
  Scenario: Verify that  the Import Client button should be clickable and the relevant page should be seen
    Given the user clicks on client title on the left menu
    Then Import Client button is displayed
    Then the user is able to open to the relavant page once clicked on the import client button

  @UI @US_079 @TherapistLoginUSA
    Scenario: Verify that user is able to import a client successfully
      Given the user clicks on client title on the left menu
      And the user clicks on the import client button
      And the user clicks Easy Practice on the choose import method window
      And the user selects a csv file
      Then the user clicks on the upload button
      Then user is able to view imported clients on the page


