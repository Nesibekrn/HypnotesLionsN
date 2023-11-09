@UI  @TherapistLoginUSA
Feature: US_53 As a user (Therapist), I should be able to perform various operations on the Client Info page

  Scenario: TC_001 Therapist Can Perform Various Operations on Client Info Page
    Then user click the client form the side menu
    Then user click add new button
    Then user click export button
    Then verify that add new client  page is visible
    Then verify that clients  file should be downloaded
    Then verify that refer a friend should be clickable and relevant page is visible

  Scenario: TC_002 Verify Clickable Reference URL and Copy to Clipboard
    Then user click the client form the side menu
    Then user click refer a friend button
    Then user click the copy url button
    Then user verify that payment url copied to clipboard message

  Scenario:TC_003 Verify Email Invitation Functionality
      Then user click the client form the side menu
      Then user click refer a friend button
      Then user enter the valid email
      Then user click the send invitation
      Then user verifies that  email sent message

  Scenario: TC_004 Verify Clickable "Start Meeting" Button Functionality
      Then user click the client form the side menu
      Then user verifies that start meeting should be clickable
      Then user verifies that hypnotes meet should be visible

  Scenario: TC_005 Verify Account Activity Button Functionality

    Then user click the client form the side menu
    Then user click the account activity and account activity button should be functional
    Then user click mark as read button
    Then user click see all account activity
    Then user verifies that relevant page should be visible
  @US_053
Scenario:TC_006 Verify Clickable Account Icon Functionality
  Then user click the client form the side menu
  Then user click the account icon
  Then Verify that the content of the account-related page is displayed.
      | threapistlions@yopmail.com  |
      | Profile          |
      | Account Statement |
      | Subscription    |
      | Security  |
      | Settings|
      | Integrations        |
      | Dark Mode|
      | Help|
      | Logout|


