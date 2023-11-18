#fatih
#"Dashboard - therapist- calendar
#User needs to be creat new client on clients page
#https://test.hypnotes.net/api/dashboard/client/add
#Details on the swagger document."



  Feature: US_205 API
    Scenario: add new client

      Given  endpoint
      When add new client POST API
      Then assert response statuscode
      Then assert responseBody












