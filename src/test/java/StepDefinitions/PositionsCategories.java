package StepDefinitions;

import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class PositionsCategories {
    Content c = new Content();
    Side sd = new Side();


    @And("Navigate to Positions Categories")
    public void navigateToPositionsCategories() {
        sd.myClick(sd.HumanRecources);
        sd.myClick(sd.Setup);
        sd.myClick(sd.PositionsCategories);


    }

    @When("click to Add button")
    public void clickToAddButton() {
        c.myClick(c.addButton);
    }

    @Then("should be open the positions toolbar")
    public void shouldBeOpenThePositionsToolbar() {
        c.verifyToolbarOpened(c.toolbarName, "PositionCategories successfully created");

    }

    @When("Create a Positions Categories name as {string} and click to save button")
    public void createAPositionsCategoriesNameAsAndClickToSaveButton(String arg0) {

        c.mySendKeys(c.Nameinput, "arg0");
        new Actions(Driver.getDriver()).sendKeys(Keys.ENTER).build().perform();
        c.myClick(c.Savebutton);

    }

    @When("User delete the {string}")
    public void userDeleteThe(String arg0) {
        c.myClick(c.Delete2);


    }

}
