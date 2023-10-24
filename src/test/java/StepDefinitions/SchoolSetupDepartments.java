package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SchoolSetupDepartments {

    Side sd = new Side();
    Content ct = new Content();


    @And("Write name as {string}")
    public void writeNameAs(String arg0) {

        ct.mySendKeys(ct.nameInput,arg0);
    }

    @And("Write code as {string}")
    public void writeCodeAs(String arg0) {

        ct.mySendKeys(ct.codeInput, arg0);

    }

    @Then("Edit a name as {string} code as {string}")
    public void editANameAsCodeAs(String arg0, String arg1) {
        ct.nameInput.clear();
        ct.mySendKeys(ct.nameInput,arg0);
        ct.mySendKeys(ct.codeInput,arg1);

    }
}
