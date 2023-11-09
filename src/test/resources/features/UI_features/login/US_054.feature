@UI
@Profile
Feature: As a user (Therapist), I should be able to see various information on the profile page


  @US_054_TC_001
  Scenario:Profile tab must be viewable and buttons must be functional


    Then Check that the profile icon is clickable.
    When The profile icon is clicked
    Then Check if that their titles are displayed;Profile,Account Statement,Substriction,Security,Settings,Integrations,Dark mode
    And  Clicks on the profile title.
    Then Check that the Your profile page opens
    Then Check if that the titles are displayed ; About, Please write something about yourself
    Then Check if that the titles are displayed; Education,Experience,Specialisties,Certifications,Your Company,Change Phone
    Then Check if that the titles are displayed; Education,Experience,Specialisties,Certifications,Your Company,Change PhoNe.
          #bu stepde DataTable kullaniyorum 16.satir ile ayni step,fakat farkli cozum
      | Experience     |
      | Specialties    |
      | Certifications |
      | Your Company   |
      | Change Phone   |
    Then Check if that the titles are clickable;Education,Experience,Specialisties,Certifications,Your Company,Change Phone
    Then Clicks on the Education title
    Then Check that the Education page opens
    And  Check that the Add new education button is displayed.






