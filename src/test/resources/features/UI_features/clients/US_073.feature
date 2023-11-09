Feature:Voice Notes Section

  @UI
  @US_73
  Scenario: TC_01_Files can be added to the Voice Notes section
    Given user goes to home page
    When user login as therapistt
    And user clicks on Clients button
    And user clicks on  client name
    And the user clicks on the sessions button
    When user clicks on the microphone
    Then recording should appear
    When  user clicks on the microphone again and the file should be added
    Then  "Recording added" message should appear
    And  user must see the attached file
    When  user Press play the audio file should be played
    Then Send to client, Convert to Text, Delete Recording buttons should appear
    Then Send to client button should give valid results
    Then Convert to Text button should give valid results
    Then Delete Recording button should give valid results

