Feature: Registration must be created with Sign in Facebook.
@US_026
@UI
Scenario: Verify that user is able to register with an facebook account
Given the user navigates Hypnotes web page
And the user clicks on login  button
And the user clicks on the Sign in with facebook button
Then user is registered successfully
