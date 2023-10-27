package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class DocumentTypesSteps {
    Side sd = new Side();
    Content ct=new Content();
    @Given("Navigate to Document Types")
    public void navigateToDocumentTypes() {
        sd.myClick(sd.setup);
        sd.myClick(sd.parameters);
        sd.myClick(sd.documentTypes);

    }

    @Then("Should be open the Document Types toolbar")
    public void shouldBeOpenTheDocumentTypesToolbar() {
        ct.verifyToolbarOpened(ct.toolbarName, "Document");
    }

    @When("Create a new Document Types name as {string} and select stage and click to save button")
    public void createANewDocumentTypesNameAsAndSelectStageAndClickToSaveButton(String arg0) {
        ct.mySendKeys(ct.nameInput, arg0);
        ct.mySelect(ct.stage, ct.nextGradeOption);
        new Actions(Driver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        ct.myClick(ct.saveButton);
    }

    @When("Write Document Types name as {string} and click to search button")
    public void writeDocumentTypesNameAsAndClickToSearchButton(String arg0) {
        ct.mySendKeys(ct.nameInput_2, arg0);
        ct.myClick(ct.searchButton);
    }

    @When("Edit a Document Types name as {string} and select stage and click to save button")
    public void editADocumentTypesNameAsAndSelectStageAndClickToSaveButton(String arg0) {
        ct.mySendKeys(ct.nameInput, arg0);
        ct.myClick(ct.saveButton);

    }

}
