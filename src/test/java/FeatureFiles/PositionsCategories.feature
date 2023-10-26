Feature: Positions Categories Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Positions Categories

  Scenario:  Create to Positions Categories
    When Click to add button
    Then Should be open the positions categories toolbar
    When Create a Positions Categories name as "testmehmet" and click to save button
    Then Success message should be displayed

  Scenario: Edit Positions Categories
    When Write positions categories name as "testmehmet" and click to search button
    Then Click to edit button
    And Should be open the positions categories toolbar
    When Edit positions categories name as "testmehmet1" and click to save button
    Then Success message should be displayed

  Scenario: Delete Positions Categories
    When Write positions categories name as "testmehmet1" and click to search button
    Then Click to delete Button
    And Success message should be displayed






