@UI @us06_UI
Feature: week1
  Scenario: US 006
    Given user goes to home page
    Then  assert first header color should be white
    And assert first header background color is green
    When user scroll to second header
    Then  assert first header color should be black
    And assert first header background color should be grey

