Feature: Bank Account Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    Given Navigate to Grade Levels
      | setup |
      | parameters |
      | gradeLevels |

  Scenario: Create a new Grade Level
    When Click to add button
    Then Should be open the add Grade level toolbar
    When Create a Grade level name as "Grade Level" Short name as "TR26" Order as "2" Next Grade as "None" Max application count as "2" and click to save button
    Then Success message should be displayed


  Scenario: Edit Grade Level
#    When Click to edit button
#    Then Success message should be displayed

  Scenario: Delete Grade Level
#    When Click to delete button
#    Then Success message should be displayed