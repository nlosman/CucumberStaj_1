package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class positionscategories {
    Content c = new Content();
    Side sd = new Side();

    @And("Navigate to Positions Categories")
    public void navigateToPositionsCategories() {
        sd.myClick(sd.humanrecources);
        sd.myClick(sd.Setup);
        sd.myClick(sd.positionscategories);

    }

    @When("Create a Positions Categories name as {string} and click to save button")
    public void createAPositionsCategoriesNameAsAndClickToSaveButton(String arg0) {
        c.mySendKeys(c.nameInput, arg0);
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).build().perform();
        c.myClick(c.saveButton);
    }

    @When("Edit positions categories name as {string} and click to save button")
    public void editPositionsCategoriesNameAsAndClickToSaveButton(String arg0) {
        c.nameInput.clear();
        c.mySendKeys(c.nameInput, arg0);
        c.myClick(c.saveButton);
    }

    @When("Write positions categories name as {string} and click to search button")
    public void writePositionsCategoriesNameAsAndClickToSearchButton(String arg0) {
        c.mySendKeys(c.nameInput_2, arg0);
        c.myClick(c.searchButton);

    }

    @Then("Should be open the positions toolbar")
    public void shouldBeOpenThePositionsToolbar() {
        c.verifyToolbarOpened(c.toolbarName, "positions categories");
    }



    @Then("Click to delete Button")
    public void clickToDeleteButton() {
        c.myClick(c.deleteButton_2);
    }
}

