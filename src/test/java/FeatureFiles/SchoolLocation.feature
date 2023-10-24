Feature: School Locations functionality

  Background: Navigate to School Locations and Verifying the position of the buttons
    Given Navigate to Campus
    When Enter username and password and click login button
    Then Click on the element in Side
      | setup       |
      | schoolSetup |
      | locations   |

  Scenario: Create a new Location
    When Click to add button in Side
    Then Should be open the toolbar for Locations
    And Create a Location name as "fn000" short name as "ccbb"

    Then Add classroom and capacity to toolbar
    And Click to Save button
    And Success message should be displayed

  Scenario: Edit a School Location
    When Click to edit button in School Setup
    Then Should be open the toolbar for Locations
    And  Edit a Location name as "fn111" short name as"ddff"

    Then Click to Save button
    And Success message should be displayed

  Scenario: Delete a School Location
    When Click to delete button in Locations
    Then  Should be open the Delete toolbar

    When Click for verify deletion
    Then Success message should be displayed

  Scenario: School Locations feature
    When Activity button verification










