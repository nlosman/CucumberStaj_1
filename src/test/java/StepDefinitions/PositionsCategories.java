package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PositionsCategories {
    Content c = new Content();
    Side sd = new Side();


    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        sd.myClick(sd.HumanRecources);
        sd.myClick(sd.Setup);
        sd.myClick(sd.PositionsCategories);
    }

    @And("Navigate to Positions Categories")
    public void navigateToPositionsCategories() {

        c.myClick(c.Addbutton);
        c.mySendKeys(c.Nameinput,"Categories positions name");
        c.myClick(c.Savebutton);
    }

    @When("Create a Positions Categories name as {string}")
    public void createAPositionsCategoriesNameAs(String arg0) {
        c.myClick(c.Addbutton);

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }

    @When("User delete the {string}")
    public void userDeleteThe(String arg0) {      }


}
