package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class NationalitiesStep {
    Side sd =
            new Side();
    Content ct=new Content();
    @Given("Navigate Nationalities")
    public void navigateNationalities() {
        sd.myClick(sd.setup);
        sd.myClick(sd.parameters);
        sd.myClick(sd.nationalities);
    }

    @When("Create a new nationalities name as {string} and click to save button")
    public void createANewNationalitiesNameAsAndClickToSaveButton(String arg0) {
        ct.mySendKeys(ct.nameInput, arg0);
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).build().perform();
        ct.myClick(ct.saveButton);
    }

    @When("Edit a name as {string} and click to save button")
    public void editANameAsAndClickToSaveButton(String arg0) {
        ct.nameInput.clear();
        ct.mySendKeys(ct.nameInput, arg0);
        ct.myClick(ct.saveButton);

    }
    @When("Write name as {string} and click to search button")
    public void writeNameAsAndClickToSearchButton(String arg0) {
        ct.mySendKeys(ct.nameInput_2, arg0);
        ct.myClick(ct.searchButton);

    }

    @Then("Should be open the nationalities toolbar")
    public void shouldBeOpenTheNationalitiesToolbar() {

        ct.verifyToolbarOpened(ct.toolbarName, "Nationality");
    }
}
