Feature:Therapist Register(Sign Up)

#1.User opens the browser
#"2.User navigates to the homepage with url: Test Data
#https://test.hypnotes.net/"
#3.User clicks to Sign Up For Free button
#4.Login page is visible
#5.User clicks to Password button.
#6.user types '' x'' as a lowercase letter in the password box
  Background:
    Given user goes to therapist register page
   @UI @US_31
   Scenario: TC_001 Lowercase letter
      When user types lowercase "x" in the password field
      Then the expression A lowercase letter returns green



