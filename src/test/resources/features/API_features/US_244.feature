
Feature: Question Category Management API

  Background: User logs in with valid credentials
    When user has valid login credentials
    And user sends a POST request to the valid username and password
    Then API responds with a status code 200
    And response contains an authentication token
    And user gets phpSessId

  Scenario: Create a new Question Category
    When the user makes a POST request to create add new Question Category in the Questionnaire Forms
    Then the API responds with a status code 200
    And the new Question Category should be successfully created in the Questionnaire Forms
    And the user verifies that response is as expected Question Category for add new Question Category
    And the user makes a POST request to get all Question Category
    And the response should contain a list of Question Category
    And the user gets questionCategoryId
    And the user makes a POST request to delete a specific Question Category


  Scenario: Get all Question Category
    When the user makes a POST request to create add new Question Category in the Questionnaire Forms
    And the user makes a POST request to get all Question Category
    Then the API responds with a status code 200
    And the response should contain a list of Question Category
    And the user gets questionCategoryId
    And the user makes a POST request to delete a specific Question Category


  Scenario: Update an existing Question Category
    When the user makes a POST request to create add new Question Category in the Questionnaire Forms
    And the user makes a POST request to get all Question Category
    And the response should contain a list of Question Category
    And the user gets questionCategoryId
    And the user makes a POST request to update Question Category
    Then the API responds with a status code 200
    And the Question Category should be successfully updated in the Questionnaire Forms
    And the user verifies that response is as expected Question Category for update Question Category
    And the user makes a POST request to delete a specific Question Category


  Scenario: Delete a Question Category
    When the user makes a POST request to create add new Question Category in the Questionnaire Forms
    And the user makes a POST request to get all Question Category
    And the response should contain a list of Question Category
    And the user gets questionCategoryId
    And the user makes a POST request to delete a specific Question Category
    Then the API responds with a status code 200
    And the Question Category should be successfully deleted from the Questionnaire Forms
    And the user verifies that response is as expected Question Category for delete Question Category