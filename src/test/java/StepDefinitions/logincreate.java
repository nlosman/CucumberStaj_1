package StepDefinitions;

import Pages.Content;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class logincreate {
    Content c = new Content();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        Driver.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password and click and click clicklogin button")
    public void enterUsernameAndPasswordAndClickAndClickClickloginButton() {
        c.mySendKeys(c.username,"turkeyts");
        c.mySendKeys(c.password,"TechnoStudy123");
        c.myClick(c.loginbuton);


    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        c.verifyContainsText(c.textTechnoStudy,"Techno Study");

    }
}
