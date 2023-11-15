#When the user clicks to Calendar button, the Calendar page should be displayed.
#Schedule duration menu must be functional
#Month, week, 3 Days, Day must be selectable
#When the user selects month, week, day, the page must be updated according to the relevant title.
#Any duration should be selected from the Schedule duration menu
#The > cursor in the Calendar menu must be active
#The buttons on the Calendar menu screen should be active and the relevant pages should be displayed:
#The Schedule an Appointment button should be clickable and the relevant page should be displayed when clicked.
#The Add New Event button should be clickable and the relevant page should be displayed when clicked.
#The Go to Scheduling Settings button should be clickable and the relevant page should be displayed when clicked.
#When the user clicks on Block Time, the relevant Block Dates page should appear

@UI @US_085 @Therapist
  Feature: Perform various actions in the calendar page
    Background:
      And the user clicks on Calendar button
      And the user verifies Calendar page

      Scenario : As a user I should be able perform Schedule duration menu
        Given the user verifies schedule menu is functional
        And the user clicks on the schedule menu
        And the user verifies below menu is selectable
          | Month  |
          | Week   |
          | 3 Days |
          | Day    |
        And the user clicks and verifies the month page
        And the user verifies next month button is active
        And the user clicks on the next button
        And the user verifies related month page
        And the user clicks on the Week
        And the user view  rows at the week page
          | all day |  | Sunday |  | Monday |  | Tuesday |  | Wednesday |  | Thursday |  | Friday |  | Saturday |

        And the user clicks on the Three Days
        And the user verifies related Three Days page
        And the user clicks on the Day
        And the user verifies related Day page

    Scenario: As a user I should able to perform









