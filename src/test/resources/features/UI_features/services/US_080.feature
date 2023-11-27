@UI
Feature: User (Therapist) should be able to see various headers on the Services page
  Scenario: User Therapist olarak sayfaya login olur
    Given User enters a valid email address
    And User enters a valid password
    Then User clicks the login

  Scenario: Verify the clickability of Services button
    Given Services button should be clickable
    And User clicks on the Services button
    And Headers of Individual Sessions, Packages, Group Session should appear
    And Individual Sessions should be seen as default page

  Scenario: Verify the content of Individual Sessions
    Given User clicks on the Individual Sessions button
    And New Individual Sessions and Generate Scheduler URL buttons should be visible
    And New Individual Sessions and Generate Scheduler URL buttons should be clickable
    And If there is a previously created service, it should be listed
    Then Table and card buttons should be clickable

  Scenario: Verify the content of Packages
    Given User clicks on the Packages button
    And New Package and Generate Scheduler URL buttons should be visible
    And New Package and Generate Scheduler URL buttons should be clickable
    And If there is a previously created service, it should be listed
    Then Table and card buttons should be clickable

  Scenario: Verify the content of Group Session
    Given User clicks on the Group Session button
    And New Group Sessions and Generate Scheduler URL buttons should be visible
    And New Group Sessions and Generate Scheduler URL buttons should be clickable
    And If there is a previously created service, it should be listed
    Then Table and card buttons should be clickable