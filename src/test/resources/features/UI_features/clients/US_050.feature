@UI @Therapist
Feature: As a user (therapist) I should be able to add new client

  Background:
    Given user clicks on Clients button
    And user clicks Add New Client button

  Scenario: TC001-Name and Surname are required (at least 2 letter character).Middle Name This field cannot include numbers or special characters.
    Given user types name in the First Name section
      | f  | This field cannot include numbers or special characters. |
      | 12 | This field cannot include numbers or special characters. |
     # |    | Please enter First Name                                  |
     # | fatma |
  @TC002
  Scenario: TC002-
    Given user types name in the first name section
    And user types middle name in the middle name section
      | 1  | This field cannot include numbers or special characters. |
      | ?, | This field cannot include numbers or special characters. |
    #  | serra |                                                          |
  Scenario: TC003-
    Given user types name in the first name section
    * user types last name in the Last Name section
      | c  | This field cannot include numbers or special characters. |
      | 12 | This field cannot include numbers or special characters. |
    #  |       | Please enter Last Name                                   |
     # | cekim |                                                          |
  Scenario: TC004-
    Given user types name in the first name section
    And user types last name in the last name section
    * user types email in the email section
      | f            | Invalid input detected, please review and correct. |
      | fatma@gmail  | Invalid input detected, please review and correct. |
      | fatma@gmail. | Invalid input detected, please review and correct. |
    #  | fatma@gmail.com |                                                    |
  Scenario: TC005-Gender menu must be functional. Client gender is selectable
    Then user verify gender menu is functional
    When user select "Female" in the gender section
    * user verify gender menu is selectable

  @TC006
  Scenario: TC006-The correct code should appear when you click on the country flags in the phone menu.
    Then user verify Phone menu is functional
    When user select country flag in the menu
    Then user verify the correct code should appear in the phone menu

  Scenario: TC007-Occupation menu must be functional. Client occupation nmust be written.This field cannot include numbers or special characters.

  Scenario: TC008-Country, state, city menu must be functional. Client country, state, city  is selectable

  Scenario: TC009-Address menu must be functional. Address must be written.

  Scenario: TC010-Upload Profile Image menu must be functional.When the Upload Profile Image button is clicked, the image should be uploaded. The image should be visible after uploading
  #When you click the Save button warning message should appear:
 # To ensure appointments are scheduled in the proper Time Zone, please confirm the client Time Zone you have selected. Europe/Istanbul
#No/Yes seçenekleri işlevsel olmalıdır. Her iki buton da doğru sonuç vermelidir.
#Yes butonuna tıklayınca client eklenmelidir. ''New Client is successfully added'' mesajı görülmelidir.
  #Eklenen client Clients sayfasında görülmelidir.
  #The Cancel button must be functional. When the Cancel button is clicked, the add client operation should be canceled.
