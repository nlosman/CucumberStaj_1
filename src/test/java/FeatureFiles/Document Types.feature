Feature: Arrange Document Types Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Given Navigate to Document Types

  @Docs @Smoke
  Scenario: Add Document Types
    When Click to add button
    Then Should be open the Document Types toolbar
    When Create a new Document Types name as "test16" and select stage and click to save button
    Then Success message should be displayed

  @Docs @Smoke
  Scenario: Edit Document Types
    When Write Document Types name as "test16" and click to search button
    Then Click to edit button
    And Should be open the Document Types toolbar
    When Edit a Document Types name as "test16new" and select stage and click to save button
    Then Success message should be displayed

  @Docs @Smoke
  Scenario: Delete Document Types
    When Write Document Types name as "test16new" and click to search button
    Then Click to delete button
    And Success message should be displayed