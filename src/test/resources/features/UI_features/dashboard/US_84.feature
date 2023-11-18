#Settings(Availability)
#Flex Start button must be active and give correct results.
#Day off options must be tickable and must give correct results.
#Add New Block Time option must be functional and give correct results
#The Max appointments button must be functional, a number must be entered on the resulting screen, and limitations must be visible in the Calendar view.
#The save button should be clickable and the Saved message should appear when save is clicked.
#Settings(Calendar Display)
#Changes made to show and color settings in the Calendar Display section should be visible on the calendar page.
#Settings(Calendar Display)
#Time zone change must be visible
#Settings(Schedule Url)
#Schedule Url should be changed and the changed url should appear
#The Scheduler URL has been updated message should appear.
#Note: The correctness of updating all changes should be tested on the relevant pages
@UI @TherapistLoginUSA @US_84_TC01
Feature: US_84
  Scenario: As a user, I should be able to perform various actions in the Settings Page
    Given User clicks on settings button on dashboard page
    When User verifies if Flex Start button is active and give correct results
    Then User verifies if Day off is tickable and give correct results
    And User verifies if Add New Block Time option is functional and give correct result
    Then User verifies The Max appointments button is fonctional and can enter number on the screen
    And User verifies if save button is clickable and checks the saved message
    Then User verifies color changes on the calendar display section
    And User verifies if time zone change is visible
    Then User verifies if the url changes and changed url is appeared on the page
    And User verifies if Schedular url has been updated message appeared in the page
