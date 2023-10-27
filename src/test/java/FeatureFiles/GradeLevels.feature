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
    When Create a Grade level name as "Grade Level" Short name as "TR26" Order as "1" Max application count as "2" and click to save button
    Then Success message should be displayed


  Scenario: Edit Grade Level
    When Click to edit button with list item text as "Grade Level"
    When Edit Grade level name as "Grade Level" Short name as "TR2666" Order as "1" Max application count as "2" and click to save button
    Then Success message should be displayed

  Scenario: Delete Grade Level
    When Click to delete button with list item text as "Grade Level"
    Then Success message should be displayed