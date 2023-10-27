Feature: Arrange Attestations Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Given Navigate to Attestations

  @HR @Smoke @Regression
  Scenario: Add Attestations
    When Click to add button
    Then Should be open the attestations toolbar
    When Create a new attestations name as "test16" and click to save button
    Then Success message should be displayed

  @HR @Smoke @Regression
  Scenario: Edit Attestations
    When Write attestations name as "test16" and click to search button
    Then Click to edit button
    And Should be open the attestations toolbar
    When Edit a attestations name as "test16new" and click to save button
    Then Success message should be displayed

  @HR @Smoke @Regression
  Scenario: Delete Attestations
    When  Write attestations name as "test16new" and click to search button
    Then Click to delete button
    And Success message should be displayed