package StepDefinitions;

import Pages.Content;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logincreate {
    Content c = new Content();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        Driver.getDriver().get("test.mersys.io/");

    }

    @When("Enter username and password and click and click clicklogin button")
    public void enterUsernameAndPasswordAndClickAndClickClickloginButton() {


    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
    }
}
