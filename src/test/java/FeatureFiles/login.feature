Feature: Login Functionality
  Scenario: Login with  valid username and password
    Given Navigate to Campus
    When Enter username and password and click and click clicklogin button
    Then User should login successfully