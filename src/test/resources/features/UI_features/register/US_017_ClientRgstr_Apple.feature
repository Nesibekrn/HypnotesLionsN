Feature: Registration must be created with Sign in Apple account.
  @UI @US_017

  Scenario:  Verify that user be able to register with Apple account
    Given the user goes to hypnotes web page
    And the user clicks Sign Up free button
    And the user clicks on Client Log in
    And the user clicks Sign in with Apple button
    And the user enters a valid  email in the email field
    And the user enters a  password in the password fields.
    And the user verifies alert message


    #Testler benim apple account ile gectikten sonra bilgilerimi kaldirdim
    #Apple verification code ve alertler olmasindan dolayi automation test ile devam edilemedi.





