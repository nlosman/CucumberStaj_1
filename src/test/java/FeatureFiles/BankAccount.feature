Feature: Bank Account Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click and click clicklogin button
    Then User should login successfully
    Given Navigate to Bank account
      | setup |
      | parameters |
      | bankAccount |

  Scenario: Create a new bank account
    When Click to add button
    Then Should be open the add Bank account toolbar
    When Create a bank account name as "Deposit" IBAN as "TR26262682" code as "TR2" and click to save button
    Then Success message should be displayed


  Scenario: Edit Bank account
    When Write name as "Deposit" and click to search button
    When Click to edit button
    Then Should be open the add Bank account toolbar
    When Edit bank account name as "Deposit" IBAN as "TR262626829" code as "TR22" and click to save button
    Then Success message should be displayed

  Scenario: Delete bank account
    When Write name as "Deposit" and click to search button
    When Click to delete button
    Then Success message should be displayed