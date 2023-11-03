
#As a user, I should be able to check valid and invalid passwords.	When appropriate expressions are entered in the 'Password must contain the following' section, there should be a color change (red-green)
#	It should not be possible to register with invalid passwords.
#	Password must contain the following: 8-50 characters, A lowercase letter, A capital (uppercase) letter, A number, A special character

Feature: As a user, I should be able to check valid and invalid passwords
  @UI
  @US31
  Scenario Outline: TC_001 Appropriate expressions entered in the Password section should change the color (red to green)
    Given user goes to therapist register page
    Then Verify that the color of messages for "<Chars>" and "<LowerCase>" and "<UpperCase>" and "<Number>" and "<Special>"
     Then Verify that the sign up button for Password is clickable for only "<Val>" is True

    Examples:
      | Val | Chars                                               | LowerCase | UpperCase | Number | Special |
      | F   | 1234567                                             |           |           |        |         |
      | F   | 123456789012345678901234567890123456789012345678901 |           |           |        |         |
      | F   | 1234567890                                          | a         |           |        |         |
      | F   | 1234567890                                          | a         | B         |        |         |
      | F   | 1234567890                                          | a         | B         | 3      |         |
      | T   | 1234567890                                          | a         | B         | 3      | @       |




