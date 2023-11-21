#fatih
#"Dashboard - therapist- calendar
#User needs to be creat new client on clients page
#https://test.hypnotes.net/api/dashboard/client/add
#Details on the swagger document."


@API @US_205   # api tag ile her defasinda login olacak ve spec objemizi dolduracak
Feature: US_205 API

  Scenario: add new client

    Given kullanici API istegi gonderir create client
    Then response alir
    Then status cod assert edilir













