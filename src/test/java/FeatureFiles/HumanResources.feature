Feature: Human Resources Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then Navigate to Human Resources

  Scenario: Create positions to Human Resources
    Given Click to Human Resources button
    When  Click to Setup button
    Then Should be open the positions toolbar

  Scenario: Add Positions
    Given Click to add button
    When Create add New Position  name as "Program Coordinator" and short name as "Pc"
    When Click to Save button
    Then Success message should be displayed


  Scenario: Edit positions
    Given Click to edit button
    And Delete what is written
    And Write new name as "Education Coordinator" and short name as "Ec"
    When Click to save button
    Then Success message should be displayed



  Scenario: Delete Positions
    Given Click to delete button in positions
    Then  Should be open the Delete toolbar
    When Click for verify deletion
    Then Success message should be displayed







