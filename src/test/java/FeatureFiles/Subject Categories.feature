Feature: Login Functionality

  Scenario: Login with  valid username and password
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Then Click on the element in Sides
      | Education|
      | EducationSetup|
      | SubjectCategories|


  Scenario: Configuring Subject Categories
    When Click to add button in Side
    Then Should be open the toolbar for Subject Categories
    And Create a Subject Categories name as "hypo" short code as "history", and click to save button
    And Success message should be displayed


  Scenario: Configuring Subject Categories
    When Click to add button in Side
    Then Should be open the toolbar for Subject Categories
    And Create a Subject Categories name as "geography" short code as "world", and click to save button
    And Success message should be displayed


  Scenario: Delete Subject Categories
    When Click to delete button in Subject Categories
    Then  Should be open the Delete toolbar

    When Click for verify deletion
    And Success message should be displayed