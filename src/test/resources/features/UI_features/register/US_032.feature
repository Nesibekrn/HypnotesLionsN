#As a user I should be able to successfully complete the register after entering valid information	Sign Up should be clickable after valid information is entered
#	When the user clicks on the Sign Up button, the Email section should be opened
#	Did you not receive the email, or has it expired? the text must be seen.
#	"If you are not able to verify this email, try to signup with different email." the text must be seen
#	Send again! button should be functional
#	When the user clicks on the Send again! button, the user should see the “A verification email has been sent” popup message
@UI @US32
Feature: As a user I should be able to successfully complete the register after entering valid information

  Background: user_goes_to_therapist_register_page
    Given user goes to therapist register page

  @UI @US32
  Scenario: User must be able to sign up with valid full name, email and password (Positive)
    When user submits a valid name to the Full Name section
    And user submits a valid email to the Email section
    And user submits a valid passowrd to the Password section
    Then user clicks on Sign Up button
    And user verifies 'Verify Email' header is displayed
    And User verifies all warning texts are visible on Verify Email section.
    And  User verifies Send again button is clickable.
    And User verifies that warning message is pops up after clicking Send again button.


