Feature: Arrange Fields Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Given Navigate Fields

  Scenario: Add Fields
    When Click to add button
    Then Should be open the nationalities toolbar
    When Create a new nationalities name as "Metonya" and click to save button
    Then Success message should be displayed

  Scenario: Edit Fields
    When Write name as "Metonya" and click to search button
    Then Click to edit button
    And Should be open the Fields toolbar
    When Edit a name as "Minlandiya" and click to save button
    Then Success message should be displayed

  Scenario: Delete Discount
    When Write name as "Minlandiya" and click to search button
    Then Click to delete button
    And Success message should be displayed

