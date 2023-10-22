Feature: Positions Categories Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Positions Categories

  Scenario:  Create to Positions Categories
    When Create a Positions Categories name as "<mehmet>"
    Then Success message should be displayed


    When User delete the "<name>"
    Then Success message should be displayed


