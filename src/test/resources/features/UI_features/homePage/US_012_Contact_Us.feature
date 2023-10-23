#Contact Us
#After clicking the Contact Us button, the Contact Us menu should appear.
#After entering the necessary information in the menu, the send button should be clicked.
@UI @US012
Feature:When I enter the home page as a user, I should be able to see various titles and perform various controls.

  Background:
    When user goes to home page

  @TC-01
  Scenario: TC-01-After clicking the Contact Us button, the Contact Us menu should appear.
    When user clicks on Contact Us button
    Then user can see Contact Us page

  @TC-02453
  Scenario Outline: TC-02-After entering the necessary information in the menu, the send button should be clicked.
    When user clicks on Contact Us button
    And user types subject section "<subject>"
    * user types Full Name section "<fullName>"
    * user types email section "<email>"
    * user types Phone Number section "<phoneNumber>"
    * user types Best Time section "<bestTime>"
    * user types Message section "<message>"
    * user clicks Send Message button
    Then user can see 'Message sent successfully' message
    Examples:
      | subject | fullName | email | phoneNumber | bestTime | message |
      |         |          |       |             |          |         |

