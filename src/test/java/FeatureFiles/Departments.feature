Feature: SchoolSetupDepartments Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the element in Side

      | setup       |
      | schoolSetup |
      | departments |

  @School, @Departments, @Smoke, @Regression
  Scenario: School Departments Setup
    Then Click to add button
    And Write name as "Math Departmenttt"
    And Write code as "MTD"
    And Click to Save button
    Then Success message should be displayed

    When Click to edit button in School Setup
    Then Edit a name as "Mathhad" code as "mthhad"
    And Click to Save button
    And Success message should be displayed

    Then Click to delete button in departments
    And Success message should be displayed

