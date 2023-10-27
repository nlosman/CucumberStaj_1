Feature: School Locations functionality


  Background: Navigate to School Locations and Verifying the position of the buttons
    Given Navigate to Campus
    When Enter username and password and click login button
    Then Click on the element in Side
      | setup       |
      | schoolSetup |
      | locations   |

  @School, @Smoke, @Regression
  Scenario: Create a new Location
    When Click to add button in Side
    Then Should be open the toolbar for Locations
    And Create a Location name as "testname" short name as "testshort"
    Then Add classroom and capacity to toolbar
    And Click to Save button
    And Success message should be displayed

  @School, @Smoke, @Regression
  Scenario: Edit a School Location
    When Click to edit button in School Setup
    Then Should be open the toolbar for Locations
    And  Edit a Location name as "fn111" short name as"ddff"
    Then Click to Save button
    And Success message should be displayed

  @School, @Smoke, @Regression
  Scenario: Delete a School Location
    When Click to delete button in Locations
    Then  Should be open the Delete toolbar
    When Click for verify deletion
    Then Success message should be displayed

#  @School, @Smoke, @Regression
#  Scenario: School Locations feature
#    When Activity button verification










