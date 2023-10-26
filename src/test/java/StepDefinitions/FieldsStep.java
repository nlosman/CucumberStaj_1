package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FieldsStep {
    Side sd = new Side();
    Content ct=new Content();
    @Given("Navigate Fields")
    public void navigateFields() {
        sd.myClick(sd.setup);
        sd.myClick(sd.parameters);
        sd.myClick(sd.fields);
    }

    @Then("Should be open the fields toolbar")
    public void shouldBeOpenTheFieldsToolbar() {
        ct.verifyToolbarOpened(ct.toolbarName, "Field");
    }

//    @When("Create a new field name as {string} code as {string} field type as {string} and click to save button")
//    public void createANewFieldNameAsCodeAsFieldTypeAsAndClickToSaveButton(String arg0, String arg1, String arg2) {
//    ct.mySendKeys(ct.nameInput, arg0);
//    ct.mySendKeys(ct.codeInput, arg1);
//    ct.mySelectByValue(ct.fieldType, arg2);
//    }


    @When("Edit field name as {string} and click to save button")
    public void editFieldNameAsAndClickToSaveButton(String arg0) {
        ct.mySendKeys(ct.nameInput, arg0);
        ct.myClick(ct.saveButton);

    }

    @When("Write fields name as {string} and click to search button")
    public void writeFieldsNameAsAndClickToSearchButton(String arg0) {
        ct.mySendKeys(ct.nameInput_2, arg0);
        ct.myClick(ct.searchButton);

    }

    @When("Create a new field name as {string} code as {string} and click to save button")
    public void createANewFieldNameAsCodeAsAndClickToSaveButton(String arg0, String arg1) {
        ct.mySendKeys(ct.nameInput, arg0);
        ct.mySendKeys(ct.codeInput, arg1);
        ct.myClick(ct.saveButton);
    }
}
