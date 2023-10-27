package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GradeLevel {
    Content content = new Content();
    Side side = new Side();
    @Given("Navigate to Grade Levels")
    public void navigateToGradeLevels(DataTable links) {
        List<String> linkList = links.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = side.getButtons(linkList.get(i));
            side.myClick(linkWebElement);
        }
    }

    @Then("Should be open the add Grade level toolbar")
    public void shouldBeOpenTheAddGradeLevelToolbar() {
        content.verifyToolbarOpened(content.toolbarName, "Grade");
    }

    @When("Create a Grade level name as {string} Short name as {string} Order as {string} Max application count as {string} and click to save button")
    public void createAGradeLevelNameAsShortNameAsOrderAsNextGradeAsMaxApplicationCountAsAndClickToSaveButton(String name, String shortName, String order, String max) {
        content.mySendKeys(content.nameInput, name);
        content.mySendKeys(content.shortNameInput, shortName);
        content.mySendKeys(content.orderInput, order);
        content.mySelect(content.nextGrade, content.nextGradeOption);
        content.mySendKeys(content.maxApplicationCount, max);
        content.myClick(content.saveButton);
    }

    @When("Click to edit button with list item text as {string}")
    public void clickToEditButtonWithListItemTextAs(String text) {
        content.myClick(content.editGrade);
    }

    @When("Edit Grade level name as {string} Short name as {string} Order as {string} Max application count as {string} and click to save button")
    public void editGradeLevelNameAsShortNameAsOrderAsMaxApplicationCountAsAndClickToSaveButton(String name, String shortName, String order, String max) {
        content.mySendKeys(content.nameInput, name);
        content.mySendKeys(content.shortNameInput, shortName);
        content.mySendKeys(content.orderInput, order);
        content.mySelect(content.nextGrade, content.nextGradeOption);
        content.mySendKeys(content.maxApplicationCount, max);
        content.myClick(content.saveButton);
    }

    @When("Click to delete button with list item text as {string}")
    public void clickToDeleteButtonWithListItemTextAs(String str) {
        content.myClick(content.deleteButtonGrade);
        content.myClick(content.deleteButton_2);
    }
}
