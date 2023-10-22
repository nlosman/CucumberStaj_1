Feature: School Locations functionality

  Background: Navigate to SchoolLocations
    Given Navigate to Campus
    When Enter username and password and click and click clicklogin button

    Then Click on the element in Side
      | setup       |
      | schoolSetup |
      | locations   |

  Scenario: Create a New Location
    When Click to add button in Side
    Then Should be open the discount toolbar for Locations
    And Create a Location name as "fn000" short name as "ccbb"

    Then Add classroom and capacity to toolbar
    And Click to Save button

    And Success message should be displayed

    Scenario: Edit Location
      When Click to edit button in School Setup
      Then Should be open the discount toolbar for Locations
      And  Edit a Location name as "fn111" short name as"ddff"

      Then Click to Save button
      And Success message should be displayed

      Scenario: Delete Location
        When Click to delete button in Locations
        Then  Should be open the Delete toolbar

        When Click for verify deletion
        And Success message should be displayed









