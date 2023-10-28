@UI
Feature: US_007 When I enter the home page as a user, I should be able to see various titles and perform various controls.

  Background:Home Page
    Given User Navigates to "https://test.hypnotes.net/"

  Scenario: TC01
    When User should see our pricing button
    Then User should see Essentials price package
   # Then User clicks the Get started now button in the Essentials pricing package
    When clicked the Get started now, the relevant page Essential should be displayed..
   # Then User should see Standard price package
   # Then User clicks the Get started now button in the Standard price package
    #And the user enters the site
    #When clicked the Get started now, the relevant page Standard should be displayed..
    # Then User should see Premium price package
   # Then User clicks the Get started now button in the Premium price package
   # When clicked the Get started now, the relevant page Premium  should be displayed..
  #  Then User should see Premium plus price package
   # Then User clicks the Get started now button in the Premium plus price package
  #  When clicked the Get started now, the relevant Premium plus should be displayed..
