@UI

Feature: After logging in as User, I should be able to see the Coupons page

  Background:
    Given  user Login
  @UI
  Scenario: Coupons should be clickable and relevant page should be visible

    When user verifies the Coupons button is clickable and clicks
    Then user sees the Coupons page