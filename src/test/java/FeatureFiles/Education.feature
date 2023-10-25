Feature: Education Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    Given Navigate to education subject categories
      | education |
      | educationStp |
      | educationSubjectCategories |

  Scenario: Add to education subject categories
    When Click to add button
    Then Should be open the education subject categories  toolbar
    Then Create a Location name as "grup16" code as "grup16code"
    And Click to Save button
    And Success message should be displayed

  Scenario: Edit subject categories
    When Write name as "grup16" and  code as "grup16code" and click to search button
    Then Click to edit button
    And Should be open the discount toolbar
    When Edit a name as "newgrup" integration code as "newgrup123"  and click to save button
    Then Success message should be displayed

  Scenario: Delete education subject categories
    When Write name as "newgrup" and  code as "newgrup123" and click to search button
    Then Click to delete button
    And Success message should be displayed