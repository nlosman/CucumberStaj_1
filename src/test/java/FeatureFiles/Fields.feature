
Feature: Arrange Fields Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Given Navigate Fields

  Scenario: Add Fields
    When Click to add button
    Then Should be open the fields toolbar
#    When Create a new field name as "testmavi" code as "test123" field type as "Integer" and click to save button
    When Create a new field name as "testmavi" code as "test123" and click to save button
    Then Success message should be displayed

  Scenario: Edit Fields
    When Write fields name as "testmavi" and click to search button
    Then Click to edit button
    And Should be open the fields toolbar
    When Edit field name as "testyesil" and click to save button
    Then Success message should be displayed

  Scenario: Delete Discount
    When Write fields name as "testyesil" and click to search button
    Then Click to delete button
    And Success message should be displayed