Feature: As a user (Therapist), I should be able to perform various actions in the Profile(Your Company) section
  Background:
    And the user clicks on the account logo
    And the user clicks on the profile
  @UI @US_059 @Therapist
  Scenario: Verify that user is able to view /clicks on the your company title when the user is on the user  profile
    Then the user view and clicks on the your Company title



  @UI @US_059 @Therapist
  Scenario: Verify that the user is able to view and click on the Add New Your Company button
    When the user clicks on the your Company title
    Then the user is able to view and click on the Add New Company button

  @UI @US_059 @Therapist
  Scenario: Verify that Your Logo, Your Company, Company's Address,City, State, Zip, Country, Company's URL, Company's Phone Number fields should be appeared when the user clicks to  Add New Company button
    And the user clicks on the your Company title
    When the user clicks on the Add New Company button
    Then  your logo button is displayed
    Then the below fields are displayed
      | Your Company    |
      | Company Address |
      | City,State,Zip  |
      | Company URL     |
      | Company Phone   |
      | Company Email   |
    Then Your Country dd filed is displayed

  @UI @US_059 @Therapist
  Scenario: Verify that user is able to add a valid logo successfully
    And the user clicks on the your Company title
    And the user clicks on the Add New Company button
    And the user adds a logo on the Your Logo button
    Then  a valid logo is displayed successfully

  @UI @US_059 @Therapist
  Scenario: Verify that the user is able to enter valid values on the multiple fields
    And the user clicks on the your Company title
    When the user clicks on the Add New Company button
    Then the user is able to enter values on the below fields
      | zeynep              |
      | pittsburgh          |
      | Pittsburgh,PA,15108 |
      | www.hypnotes.net    |
      | 444444444           |
      | zeynep@gmail.com    |
    Then the user is able to select a country from country drop down