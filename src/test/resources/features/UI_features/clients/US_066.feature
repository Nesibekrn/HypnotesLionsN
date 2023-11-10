Feature:As a user (Therapist), I should be able to perform various actions in the Payments button
  @UI @TherapistLoginUSA
  Scenario:Payment status changing
  Given the user clicks on client title on the left menu
  When user clicks clients name
  And user clicks Payments section
  Then user verify that Payments page is open
  And user verify that payment status can be updated
  And user verify that updated Payment status is seen on the Appointment page.
  And user verify that Sorting buttons is giving correct result
