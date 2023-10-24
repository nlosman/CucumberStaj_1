Feature: SchoolSetupDepartments Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the element in Side

      | setup |
      | schoolSetup |
      | departments |

  Scenario: School Departments Setup

    Then Click to add button
    And Write name as "Math Department"
    And Write code as "MT"
    And Click to Save button
    Then Success message should be displayed

    When Click to edit button in School Setup
    Then Edit a name as "Math" code as "mth"
    And Click to Save button
    And Success message should be displayed

    Then Click to delete button
    And Success message should be displayed

