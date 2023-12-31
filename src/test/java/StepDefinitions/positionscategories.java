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
    public void navigateToPositionsCategories(){
        sd.myClick(sd.humanRecources);
        sd.myClick(sd.humanRecourcesSetup);
        sd.myClick(sd.positionsCategories);

    }
    @When("Create a Positions Categories name as {string} and click to save button")
    public void createAPositionsCategoriesNameAsAndClickToSaveButton(String arg0) {
        c.mySendKeys(c.nameInput, arg0);
        c.myClick(c.saveButton);

    }
    @When("Edit positions categories name as {string} and click to save button")
    public void editPositionsCategoriesNameAsAndClickToSaveButton(String arg1) {
        c.nameInput.clear();
        c.mySendKeys(c.nameInput, arg1);
        c.myClick(c.saveButton);

    }

    @Then("Should be open the positions categories toolbar")
    public void shouldBeOpenThePositionsCategoriesToolbar() {
        c.verifyToolbarOpened(c.toolbarName, "Position Category");
    }


    @When("Write positions categories name as {string} and click to search button")
    public void writePositionsCategoriesNameAsAndClickToSearchButton(String arg2) {
        c.mySendKeys(c.nameInput_2, arg2);
        c.myClick(c.searchButton);

    }


    @Then("Click to delete Button")
    public void clickToDeleteButton() {
        c.myClick(c.deleteButton_1);
        c.myClick(c.deleteButton_2);
    }
}
