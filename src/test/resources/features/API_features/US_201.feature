@ApiClientLogin
Feature: Login As Client
  #ApiClientLogin tagi client olarak sisteme giris yapmami sagliyor hooks classta.
  @US201
  Scenario: As a user, I should be able to log in with API end point as a client
    Then the user verifies that status codes is 200
    Then the user verifies that authenticated is true
    Then the user verifies that type is client
    Then the user verifies that isVerified is true