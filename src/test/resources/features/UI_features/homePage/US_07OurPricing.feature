@UI
Feature: US_007 When I enter the home page as a user, I should be able to see various titles and perform various controls.
  Background:Home Page
    Given User Navigates to "https://test.hypnotes.net"

 Scenario: User selects a pricing package

    When User should see our pricing button
   Then User should see the following price packages are displayed:
      | Essentials      |
      | Standard        |
      | Premium         |
      | Most Popular    |
