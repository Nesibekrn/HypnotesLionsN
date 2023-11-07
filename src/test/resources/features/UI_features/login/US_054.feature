@UI
Feature: As a user (Therapist), I should be able to see various information on the profile page


  Background:
    Given User Login on the Profile Page



  @US_054_TC_001
  Scenario:Profile tab must be viewable and buttons must be functional


    When Clicks on the profile icon.
    Then Check that the profile icon is clickable.
    When When the profile icon is clicked
    Then Check if that their titles are displayed;Profile,Account Statement,Substriction,Security,Settings,Integrations,Dark mode
    And  Clicks on the profile title.
    Then Check that the Your profile page opens
    Then On the Your profile page
    Then Check if that the titles are displayed ; About, Please write something about yourself
    Then Check if that the titles are displayed; Education,Experience,Specialisties,Certifications,Your Company,Change Phone
    Then Check if that the titles are clickable;Education,Experience,Specialisties,Certifications,Your Company,Change Phone
    Then Clicks on the Education title
    Then Check that the Education page opens
    And  Check that the Add new education button is displayed.






