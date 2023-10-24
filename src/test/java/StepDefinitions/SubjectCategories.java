package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectCategories {

    Side sde = new Side();
    Content cnt = new Content();


    @Then("Click on the element in Sides")
    public void clickOnTheElementInSides() {
    }
    @Then("Should be open the toolbar for Subject Categories")
    public void shouldBeOpenTheToolbarForSubjectCategories() {
    }

    @And("Create a Subject Categories name as {string} short code as {string}, and click to save button")
    public void createASubjectCategoriesNameAsShortCodeAsAndClickToSaveButton(String arg0, String arg1) {
    }

    @When("Click to delete button in Subject Categories")
    public void clickToDeleteButtonInSubjectCategories() {
    }


}
