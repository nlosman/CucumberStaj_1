package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HumanResourcesStep {
    Side sd = new Side();
    Content ct=new Content();

    @Then("Navigate to Human Resources")
    public void navigateToHumanResources() {
        sd.myClick(sd.HumanResources);
        sd.myClick(sd.setup);
        sd.myClick(sd.positions);
    }

    @Given("Click to Human Resources button")
    public void clickToHumanResourcesButton() {
        sd.myClick(sd.HumanResources);
    }

    @When("Click to Setup button")
    public void clickToSetupButton() {
        sd.myClick(sd.setup);
    }

    @Then("Should be open the positions toolbar")
    public void shouldBeOpenThePositionsToolbar() {
        sd.myClick(sd.positions);
    }

    @When("Create add New Position  name as {string} and short name as {string}")
    public void createAddNewPositionNameAsAndShortNameAs(String name1, String shortName1) {
        ct.mySendKeys(ct.name, name1);
        ct.mySendKeys(ct.shortName, shortName1);

    }

    @And("Delete what is written")
    public void deleteWhatIsWritten() {
        ct.myClick(ct.deleteButton_1);
    }

    @And("Write new name as {string} and short name as {string}")
    public void writeNewNameAsAndShortNameAs(String name2, String shortName2) {
        ct.mySendKeys(ct.name, name2);
        ct.mySendKeys(ct.shortName, shortName2);

    }

    @When("Click to save button")
    public void clickToSaveButton() {
        ct.myClick(ct.saveButton);
    }

    @Given("Click to delete button in positions")
    public void clickToDeleteButtonInPositions() {
        ct.myClick(ct.deleteButton_2);
    }
}
