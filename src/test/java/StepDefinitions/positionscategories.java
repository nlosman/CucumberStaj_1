package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class positionscategories {
    Content c = new Content();
    Side sd = new Side();
    @And("Navigate to Positions Categories")
    public void navigateToPositionsCategories() {
        c.myClick(c.);
    }

    @Then("Should be open the positions toolbar")
    public void shouldBeOpenThePositionsToolbar() {
    }

    @When("Create a Positions Categories name as {string} and click to save button")
    public void createAPositionsCategoriesNameAsAndClickToSaveButton(String arg0) {
    }

    @When("Write positions categories name as {string} and click to search button")
    public void writePositionsCategoriesNameAsAndClickToSearchButton(String arg0) {
    }

    @When("Edit positions categories name as {string} and click to save button")
    public void editPositionsCategoriesNameAsAndClickToSaveButton(String arg0) {
    }
}
