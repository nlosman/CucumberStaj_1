Feature: Positions Categories Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Positions Categories

  Scenario:  Create to Positions Categories
    When click to Add button
    Then should be open the positions toolbar
    When Create a Positions Categories name as "<mehmet>" and click to save button
    Then Success message should be displayed



  Scenario: Delete Discount
    When Write name as "Mehmet" and click to search button
    Then Click to delete button
    And Success message should be displayed



