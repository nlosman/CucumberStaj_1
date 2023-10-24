Feature: Human Resources Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Given Navigate to Human Resources

  Scenario: Add positions to Human Resources
    When Click to Human Resources button
    And  Click to Setup button
    Then Should be open the positions toolbar

  Scenario:  Create to Positions Categories
    And Click to Positions button
    And Create add New Position  name as "<Program Coordinator>" and short name as "<Pc>"
    And Click to Save button


  Scenario: Edit positions
    Then Click to edit button
    And Delete what is written
    When Write new name as "<Education Coordinator>" and short name as "<Ec>"
    Then Click to save button
    Then Success message should be displayed



  Scenario: Delete Positions
    When Click to delete button in positions
    Then  Should be open the Delete toolbar
    When Click for verify deletion
    And Success message should be displayed







