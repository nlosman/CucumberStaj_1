package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AttestationsSteps {
    Side sd = new Side();
    Content ct=new Content();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {
        sd.myClick(sd.humanRecources);
        sd.myClick(sd.humanRecourcesSetup);
        sd.myClick(sd.attestations);
    }

    @Then("Should be open the attestations toolbar")
    public void shouldBeOpenTheAttestationsToolbar() {
        ct.verifyToolbarOpened(ct.toolbarName, "Attestation");
    }

    @When("Create a new attestations name as {string} and click to save button")
    public void createANewAttestationsNameAsAndClickToSaveButton(String arg0) {
        ct.mySendKeys(ct.nameInput, arg0);
        ct.wait.until(ExpectedConditions.invisibilityOf(ct.notMessage));
        ct.myClick(ct.saveButton);

    }

    @When("Write attestations name as {string} and click to search button")
    public void writeAttestationsNameAsAndClickToSearchButton(String arg0) {
        ct.mySendKeys(ct.nameInput_2, arg0);
        ct.myClick(ct.searchButton);
    }

    @When("Edit a attestations name as {string} and click to save button")
    public void editAAttestationsNameAsAndClickToSaveButton(String arg0) {
        ct.mySendKeys(ct.nameInput, arg0);
        ct.wait.until(ExpectedConditions.invisibilityOf(ct.notMessage));
        ct.myClick(ct.saveButton);
    }
}
