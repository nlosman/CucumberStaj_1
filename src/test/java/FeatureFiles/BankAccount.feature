Feature: Bank Account Functionality

  Scenario: Create a new bank account
    Given Navigate to Bank account
    When Click to add button
    Then should be open the add Bank account toolbar
    When Craete a bank account name as "test" IBAN as "testIban" currency as "curency" code as "code" and click to save button
    Then Succes message should be displayed


#  Scenario: Edit bank account
#
#
#  Scenario: Delete bank account
