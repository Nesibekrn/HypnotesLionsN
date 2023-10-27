
Feature: US_011 When I enter the home page as a user, I should be able to see various titles and perform various controls.

  Background:
    Given User goes to "https://test.hypnotes.net"
    Then  User navigates to the Footer Section

  Scenario: TC_001 Help & Support section and its elements on the footer should be visible.
    Then  Verify that Help&Support header and its elements are visible.

  Scenario: TC_002 Help & Support section elements on the footer should be clickable.
    And  Verify that Help&Support elements are clickable and relevant page should be displayed.

  Scenario: TC_003 Company section and its elements on the footer should be visible.
    Then  Verify that Company header and its elements are visible.
      | Company           |
      | About Us          |
      | Mission Statement |
      | Privacy Policy    |
      | Terms Of Service  |
      | Careers           |
      | Contact Us        |


  Scenario: TC_004 Company section elements on the footer should be clickable.
    Then Verify that Company elements are clickable and relevant page should be displayed.


