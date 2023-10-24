#The login button must be clickable
  #When the Login button is clicked, the Therapist Login menu should appear.
  #In the Therapist Login menu, click Client Login, Forgot your password?, Need an account? buttons must be clickable
  #The password should be visible when user clicks Show Password Icon
  #Client Login, Forgot your password?, Need an account? The buttons must give correct results. Necessary checks should be made.
  @UI @US_034
  Feature: As a User (Therapist) I should be able to log in to the home page
    Background:
      When user goes to home page
    Scenario: When the Login button is clicked, the Therapist Login menu should appear.
      When user clicks on Login button
      Then user can see Therapist Login menu
