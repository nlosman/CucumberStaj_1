Feature: Human Resources Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then Navigate to Human Resources

  @HR, @Smoke, @Regression
  Scenario: Add Positions
    Given Click to add button
    Then Should be open the Postion toolbar
    When Create add New Position  name as "Program Coordinator" and short name as "Pc"
    When Click to Save button
    Then Success message should be displayed

  @HR, @Smoke, @Regression
  Scenario: Edit positions
    When Write new name as "Program Coordinator" and click to search button
    Then Click to edit button
    And Should be open the Postion toolbar
    When Create add New Position  name as "Education Coordinator" and short name as "Ec"
    When Click to Save button
    Then Success message should be displayed

  @HR, @Smoke, @Regression
  Scenario: Delete Positions
    Given Write new name as "Education Coordinator" and click to search button
    Then Click to delete button
    And Success message should be displayed







