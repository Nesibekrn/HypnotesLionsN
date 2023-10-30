Feature:Therapist Register(Sign Up)
#As a user, I should be able to check valid and invalid passwords.	When appropriate expressions are entered in the 'Password must contain the following' section, there should be a color change (red-green)
#	It should not be possible to register with invalid passwords.
#	Password must contain the following: 8-50 characters, A lowercase letter, A capital (uppercase) letter, A number, A special character
  Background:
    Given user goes to therapist register page
    When user submits a valid name to the Full Name section
    And user submits a valid email to the Email section

   @UI @US_31
   Scenario: TC_001 user can check the valid password
     When user enters a password that meets these five criteria
     And the expression characters size returns green
     And the expression A lowercase letter returns green
     And the expression A capital uppercase letter returns green
     And the expression A number returns green
     And the expression A number letter returns green
     And the expression A special characterA lowercase letter returns green
     Then user clicks on Sign Up button




