package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BankAccount {
    Content content = new Content();
    Side side = new Side();

    @Given("Navigate to Bank account")
    public void navigateToBankAccount(DataTable links) {
        List<String> linkList = links.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = side.getWebElement(linkList.get(i));
            side.myClick(linkWebElement);
        }
    }

    @When("Click to add button")
    public void clickToAddButton() {
        content.myClick(content.addButton);
    }

    @Then("Should be open the add Bank account toolbar")
    public void shouldBeOpenTheAddBankAccountToolbar() {
//        content.verifyContainsText(content.toolbarName, "Bank");
    }

    @When("Create a bank account name as {string} IBAN as {string} code as {string} and click to save button")
    public void craeteABankAccountNameAsIBANAsCurrencyAsCodeAsAndClickToSaveButton(String name, String iban, String code) {
        content.mySendKeys(content.nameInput, name);
        content.mySendKeys(content.ibanInput, iban);
        content.mySelect(content.currency, content.currencyOption);
        content.mySendKeys(content.searchIntegrationCode, code);
        content.myClick(content.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }

    @When("Edit bank account name as {string} IBAN as {string} code as {string} and click to save button")
    public void editBankAccountNameAsIBANAsCodeAsAndClickToSaveButton(String name, String iban, String code) {
        content.mySendKeys(content.nameInput, name);
        content.mySendKeys(content.ibanInput, iban);
        content.mySendKeys(content.searchIntegrationCode, code);
        content.myClick(content.saveButton);
    }
}
