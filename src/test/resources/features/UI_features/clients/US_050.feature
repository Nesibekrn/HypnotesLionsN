@UI @Therapist  @US050
Feature: As a user (therapist) I should be able to add new client

  Background:
    Given user clicks on Clients button
    And user clicks Add New Client button

  Scenario: TC001-Name and Surname are required (at least 2 letter character).Middle Name This field cannot include numbers or special characters.
    Given user types name in the First Name section
      | f  | This field cannot include numbers or special characters. |
      | 12 | This field cannot include numbers or special characters. |

  @TC002
  Scenario: TC002-
    Given user types name in the first name section
    And user types middle name in the middle name section
      | 1  | This field cannot include numbers or special characters. |
      | ?, | This field cannot include numbers or special characters. |

  Scenario: TC003-
    Given user types name in the first name section
    * user types last name in the Last Name section
      | c  | This field cannot include numbers or special characters. |
      | 12 | This field cannot include numbers or special characters. |

  Scenario: TC004-
    Given user types name in the first name section
    And user types last name in the last name section
    * user types email in the email section
      | f            | Invalid input detected, please review and correct. |
      | fatma@gmail  | Invalid input detected, please review and correct. |
      | fatma@gmail. | Invalid input detected, please review and correct. |

  Scenario: TC005-Gender menu must be functional. Client gender is selectable
    Then user verify gender menu is functional
    When user select "Female" in the gender section
    * user verify gender menu is selectable

  @TC006
  Scenario: TC006-The correct code should appear when you click on the country flags in the phone menu.
    Then user verify Phone menu is functional
    When user select country flag in the menu and write phone number
    Then user verify the correct code should appear in the phone menu

  @TC007
  Scenario: TC007-Occupation menu must be functional. Client occupation must be written.This field cannot include numbers or special characters.
    Given user types occupation in the occupation section
      | 1 | This field cannot include numbers or special characters. |
      | ? | This field cannot include numbers or special characters. |

  @TC008
  Scenario: TC008-Zip Code menu must be functional. Zip Code must be written.This field cannot contain letters or special characters.
    When user types zip code in the zip code inbox
      | £ | Please enter a valid zip code. |
      | ~ | Please enter a valid zip code. |
   #   | ? | This field cannot include letters or special characters.Invalid input detected, please review and correct. |

  @TC009
  Scenario Outline: TC009-Country, state, city menu must be functional. Client country, state, city  is selectable
    When user types "<country>", "<state>", "<city>" in the relevant section
    Then user sees "<country>", "<state>", "<city>" written
    Examples:
      | country        | state          | city      |
      | United Kingdom | Leicestershire | Leicester |


  Scenario: TC010-Address menu must be functional. Address must be written.
    When user types "80 Repton Road" in the address section
    Then user can see "80 Repton Road" in the address section

  Scenario: TC011-Time Zone menu must be functional. Client time is selectable
    When user types "(UTC-02:00) UTC-02 - Atlantic/South Georgia" in the Time Zone section
    Then user can see "(UTC-02:00) UTC-02 - Atlantic/South Georgia" in the Time Zone section

  Scenario: TC012-Upload Profile Image menu must be functional.When the Upload Profile Image button is clicked, the image should be uploaded. The image should be visible after uploading
    When user clicks on Upload Profile Image menu
    Then user should be able to upload profile image

  Scenario: TC013-Add New Client
    Given user types name in the first name section
    And user types last name in the last name section
    * user types email in the email sections
    * user select "Female" in the gender section
    * user select country flag in the menu and write phone number
    * user types "SDET" in the occupation sections
    * user types zip code in the Zip Code inbox
    * user types "United Kingdom" in the country section
    * user types "Leicestershire" in the state section
    * user types "Leicester" in the city section
    * user types "80 Repton Road" in the address section
    * user types "(UTC-02:00) UTC-02 - Atlantic/South Georgia" in the Time Zone section
    * user clicks on Upload Profile Image menu
    * the user clicks on the save button
    Then user can see "To ensure appointments are scheduled in the proper Time Zone, please confirm the client Time Zone you have selected." warning message
    And the user clicks on the yes button
    Then user can see 'New Client is successfully added.' message

  Scenario: TC014
    Given user types name in the first name section
    And user types last name in the last name section
    * user types email in the email sections
    * the user clicks on the save button
    * the user clicks on the yes button
    * user clicks on Clients button
    Then user can see new client is in the Clients module
    Given user clicks delete button for last added Client
    Then user sees that the last added client has been deleted

  Scenario: TC015
    Given user types name in the first name section
    And user types last name in the last name section
    * user types email in the email sections
    * the user clicks on the save button
    * user clicks on the No button
    * user clicks Cancel button
    Then user can not add client

  Scenario: TC016-Please enter First Name
    Given user can not write anything in the First Name section
    Then user can see "Please enter First Name" warning

  Scenario: TC017-Please enter Last Name
    Given user can not write anything in the Last Name section
    Then user can see "Please enter Last Name" warning

  Scenario: TC018-Please enter Email
    Given user can not write anything in the email section
    Then user can see "Please enter Email" warning


  #When you click the Save button warning message should appear:
 # To ensure appointments are scheduled in the proper Time Zone, please confirm the client Time Zone you have selected. Europe/Istanbul
#No/Yes seçenekleri işlevsel olmalıdır. Her iki buton da doğru sonuç vermelidir.
#Yes butonuna tıklayınca client eklenmelidir. ''New Client is successfully added'' mesajı görülmelidir.
  #Eklenen client Clients sayfasında görülmelidir.
  #The Cancel button must be functional. When the Cancel button is clicked, the add client operation should be canceled.
