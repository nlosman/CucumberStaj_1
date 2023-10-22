package StepDefinitions;

import Pages.Content;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankAccount {
    Content ct=new Content();
    @Given("Navigate to Bank account")
    public void navigateToBankAccount() {
    }

    @When("Click to add button")
    public void clickToAddButton() {
        ct.myClick(ct.addButton);

    }

    @Then("should be open the add Bank account toolbar")
    public void shouldBeOpenTheAddBankAccountToolbar() {
    }

    @When("Craete a bank account name as {string} IBAN as {string} currency as {string} code as {string} and click to save button")
    public void craeteABankAccountNameAsIBANAsCurrencyAsCodeAsAndClickToSaveButton(String arg0, String arg1, String arg2, String arg3) {
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        ct.verifyContainsText(ct.successMessage,"success");
    }
}
