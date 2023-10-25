@UI
Feature: The user changes languages settings and verify languages
  Scenario: TC_01
    Given User goes to "https://test.hypnotes.net"
    When The user clicks usa flag language button
    Then The user verify navbar buttons if they are visible and English
    And The user clicks features button and verify if all the features are English
    And The user clicks Pricing button and verify if the page is English
    And The user clicks Resources button and verify if all resources are English
    And The user clicks Contact us button and verify if the page is English
    And The user clicks Login button and verify the page is English
    And The user clicks Sign up for free button and varify the page is English

  Scenario:TC_02
    When The user clicks Turkiye flag language button
    Then The user verify navbar buttons if they are visible and Turkish
    And The user clicks features button and verify if all the features are Turkish
    And The user clicks Pricing button and verify if the page is Turkish
    And The user clicks Resources button and verify if all resources are Turkish
    And The user clicks Contact us button and verify if the page is Turkish
    And The user clicks Login button and verify the page is Turkish
    And The user clicks Sign up for free button and varify the page is Turkish

  Scenario:TC_03
    When The user clicks Germany flag language button
    Then The user verify navbar buttons if they are visible and German
    And The user clicks features button and verify if all the features are German
    And The user clicks Pricing button and verify if the page is German
    And The user clicks Resources button and verify if all resources are German
    And The user clicks Contact us button and verify if the page is German
    And The user clicks Login button and verify the page is German
    And The user clicks Sign up for free button and varify the page is German

  Scenario:TC_04
    When The user clicks France flag language button
    Then The user verify navbar buttons if they are visible and French
    And The user clicks features button and verify if all the features are French
    And The user clicks Pricing button and verify if the page is French
    And The user clicks Resources button and verify if all resources are French
    And The user clicks Contact us button and verify if the page is French
    And The user clicks Login button and verify the page is French
    And The user clicks Sign up for free button and varify the page is French

  Scenario: TC_05
    When The user clicks Russia flag language button
    Then The user verify navbar buttons if they are visible and Russian
    And The user clicks features button and verify if all the features are Russian
    And The user clicks Pricing button and verify if the page is Russian
    And The user clicks Resources button and verify if all resources are Russian
    And The user clicks Contact us button and verify if the page is Russian
    And The user clicks Login button and verify the page is Russian
    And The user clicks Sign up for free button and varify the page is Russian

  Scenario: TC_06
    When The user clicks Spain flag language button
    Then The user verify navbar buttons if they are visible and Spanish
    And The user clicks features button and verify if all the features are Spanish
    And The user clicks Pricing button and verify if the page is Spanish
    And The user clicks Resources button and verify if all resources are Spanish
    And The user clicks Contact us button and verify if the page is Spanish
    And The user clicks Login button and verify the page is Spanish
    And The user clicks Sign up for free button and varify the page is Spanish


