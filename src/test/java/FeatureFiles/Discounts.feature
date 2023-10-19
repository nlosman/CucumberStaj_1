Feature: Arrange Discounts Functionality

  Background: Given Navigate to Campus
    When Enter username and password and click and click clicklogin button
    Given Navigate to Discount

  Scenario: Add Discount
    When Click to add button
    Then Should be open the New Discount toolbar
    When Craete a new discount description as "test" integration code as "test123" priority as "1"  and click to save button
    Then Success message should be displayed

  Scenario: Edit Discount
    When Click to edit button
    Then Should be open the Discount toolbar
    When Craete a new discount description as "testnew" integration code as "test123new" priority as "2"  and click to save button
    Then Success message should be displayed

  Scenario: Delete Discount
    When Click to delete button
    Then Should be open the Delete toolbar and click to delete button
    And Success message should be displayed