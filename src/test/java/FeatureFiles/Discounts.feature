Feature: Arrange Discounts Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click and click clicklogin button
    Given Navigate to Discount

  Scenario: Add Discount

    When Click to add button
    Then Should be open the discount toolbar
    When Create a new discount description as "test" integration code as "test123" priority as "1"  and click to save button
    Then Success message should be displayed

  Scenario: Edit Discount
    When Write description as "test" and integration code as "test123" and click to search button
    Then Click to edit button
    And Should be open the discount toolbar
    When Edit a discount description as "testnew" integration code as "test123new" priority as "2"  and click to save button
    Then Success message should be displayed

  Scenario: Delete Discount
    When Write description as "testnew" and integration code as "test123new" and click to search button
    Then Click to delete button
    And Success message should be displayed