@UI @Therapist
Feature: As a user (Therapist), I should be able to perform various actions in the Profile(Your Company) section

  Background:
    When The profile icon is clicked
    And  Clicks on the profile title.

  @US060
  Scenario Outline: TC001
    When the user clicks on the your Company title
    Then the user can see the previously attached company information
    When the user clicks the Edit button
    Then the user can see "Edit your company information." page
    When the user edits "<Company Name>"
    * the user edits "<Company Address>" in the company address
    * the user edits "<City,State,Zip>" in the City State Zip
    * the user edits "<Country>" in the country section
    * the user updates "<Company URL>" in the company url section
    * the user edits "<Company Phone Number>" in the Company Phone Number section
    * the user updates "<Company email>" in the Company email section
    * the user updates image
    * the user clicks save button
    Then user can see "Your company information has been updated"
    Examples:
      | Company Name    | Company Address | City,State,Zip | Country       | Company URL                | Company Phone Number | Company email |
      | AFG Consultancy | 56 Repton Road  | Leicester      | United States | https://afgconsultancy.com | 07823167             | afgcon@gmail.com |
    #Your Company
    #Your Company title must be clickable
    #When the user enters the page, the previously attached company information should be visible
    #When the user clicks the Edit button, the Edit your company information page should be displayed
    #The Your Company field should be able to update with the current company name
    #The Company's Address field should be able to update with the current Company's Address
    #State, Zip field should be able to update with current State, Zip
    #The Country field should be able to update with the current Country
    #The Company's URL field should be able to update with the current Company's URL
    #The Company's Phone Number field should be able to update with the current Company's Phone Number
    #The image in the Image field should be able to replace with the current image
    #The message Your company information has been updated should appear.