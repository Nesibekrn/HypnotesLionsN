@UI
@US_81
Feature: Creation individual sessions

  Background: Add new individual session
    Given user goes to home page
    When user login as therapistt
    And user clicks on Services button
    When user clicks on individual Sessions button, Add New Individual Sessions field should appear
    And user clicks on the Add New Individual Sessions

  Scenario: TC_01_Individual Session can be added to the Add New Individual Sessions

    Then The Name field must be functional and a valid name should be able to enter
    Then The meeting type menu must be functional and any meeting type must be selected from the menu
    Then Price must be functional and a valid name should be able to enter
    And When the price is entered, the Show service price on the initial scheduler page button must be active
    Then Any Duration in the Duration drop-down menu should be selectable
    Then Buffer Time Before Appointment (min) field must be functional and the number value should be able to enter
    Then Buffer Time After Appointment (min) field must be functional and the number value should be able to enter
    Then Advance Notice menu must be functional, cursors to the right of the menu must be functional
    Then Payment Required button must be functional
    Then Service Active button must be functional
    Then Would you like this service to be provided online? menu must be checked
    Then Various notes should be added to the Description section.
    Then Various notes should be added to the Terms & Conditions section
    When the Save button is clicked, an individual session should be created.
    Then when user clicks on the save button, "Individual Session has been added" message should appear.
    Then Individual Session should appear in the list

  Scenario: TC_02_Cansel button

    Then Cancel button should be functional
    When the user clicks to Cancel, the Add New Individual Sessions page should appear








