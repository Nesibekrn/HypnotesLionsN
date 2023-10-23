@UI @US_002
Feature: The user goes to home page
  Scenario: US_004
    Given User goes to "https://test.hypnotes.net"
    Then The user clicks the language button
    Then If the user click USA flag language should be English
    And If the user click Turkiye flag language should be Turkish
    Then If the user click Germany flag language should be German
    And If the user click France flag language should be French
    Then If the user click Spain flag language should be Spanish
    And If the user click Russia flag language should be Russian