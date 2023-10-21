package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DiscountStep {

    Side sd = new Side();
    Content ct=new Content();
    @Given("Navigate to Discount")
    public void navigateToDiscount() {

        sd.myClick(sd.setup);
        sd.myClick(sd.parameters);
        sd.myClick(sd.discounts);

    }

    @When("Create a new discount description as {string} integration code as {string} priority as {string}  and click to save button")
    public void createANewDiscountDescriptionAsIntegrationCodeAsPriorityAsAndClickToSaveButton(String arg0, String arg1, String arg2) {
        ct.mySendKeys(ct.descriptionInput, arg0);
        ct.mySendKeys(ct.integrationCodeInput, arg1);
        ct.mySendKeys(ct.priorityInput, arg2);
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).build().perform();
        ct.myClick(ct.saveButton);

    }

    @When("Click to edit button")
    public void clickToEditButton() {
        ct.staleElement();
        ct.myClick(ct.editButton);
    }

    @Then("Should be open the discount toolbar")
    public void shouldBeOpenTheDiscountToolbar() {
        ct.verifyToolbarOpened(ct.toolbarName, "Discount");
    }
    @Then("Click to delete button")
    public void clickToDeleteButton() {
        ct.staleElement();
        ct.myClick(ct.deleteButton_1);
        ct.myClick(ct.deleteButton_2);    }

    @When("Write description as {string} and integration code as {string} and click to search button")
    public void writeDescriptionAsAndIntegrationCodeAsAndClickToSearchButton(String arg0, String arg1) {
        ct.mySendKeys(ct.searchDescription, arg0);
        ct.mySendKeys(ct.searchIntegrationCode, arg1);
        ct.myClick(ct.searchButton);

    }
    @When("Edit a discount description as {string} integration code as {string} priority as {string}  and click to save button")
    public void editADiscountDescriptionAsIntegrationCodeAsPriorityAsAndClickToSaveButton(String arg0, String arg1, String arg2) {
        ct.mySendKeys(ct.descriptionInput, arg0);
        ct.mySendKeys(ct.integrationCodeInput, arg1);
        ct.mySendKeys(ct.priorityInput, arg2);
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).build().perform();
        ct.myClick(ct.saveButton);
    }
}
