package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HumanResourcesStep {
    Side sd = new Side();
    Content ct = new Content();



    @Then("Navigate to Human Resources")
    public void navigateToHumanResources() {
        sd.myClick(sd.humanRecources);
        sd.myClick(sd.humanRecourcesSetup);
        sd.myClick(sd.humanRecourcesPositions);

    }

    @Then("Should be open the Postion toolbar")
    public void shouldBeOpenThePostionToolbar() {
        ct.verifyToolbarOpened(ct.toolbarName, "Position");
    }

    @When("Create add New Position  name as {string} and short name as {string}")
    public void createAddNewPositionNameAsAndShortNameAs(String name1, String shortName1) {
        ct.mySendKeys(ct.nameInput, name1);
        ct.mySendKeys(ct.shortNameInput, shortName1);

    }

    @And("Write new name as {string} and click to search button")
    public void writeNewNameAsAndClickToSearchButton(String name2) {
        ct.mySendKeys(ct.nameInput_2, name2);
       ct.myClick(ct.searchButton);
    }

    @Then("Then  Should be open the Postion toolbar")
    public void thenShouldBeOpenThePostionToolbar() {
    }

}
