package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Education {

    Content c= new Content();
    Side s= new Side();
    @Given("Navigate to education subject categories")
    public void navigateToEducationSubjectCategories(DataTable links) {

        List<String> linkList = links.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = s.getButtons(linkList.get(i));
            s.myClick(linkWebElement);
        }
    }

    @Then("Should be open the education subject categories  toolbar")
    public void shouldBeOpenTheEducationSubjectCategoriesToolbar() {
        c.verifyToolbarOpened(c.toolbarName,"Subject Category");

    }

    @When("Write name as {string} and  code as {string} and click to search button")
    public void writeNameAsAndCodeAsAndClickToSearchButton(String arg0, String arg1) {
        c.mySendKeys(c.nameInput_2,arg0);
        c.mySendKeys(c.codeInput_2,arg1);
        c.myClick(c.searchButton);

    }

    @Then("Create a Location name as {string} code as {string}")
    public void createALocationNameAsCodeAs(String arg0, String arg1) {
        c.mySendKeys(c.nameInput,arg0);
       c.mySendKeys(c.codeInput,arg1);


    }
    @When("Edit a name as {string} integration code as {string}  and click to save button")
    public void editANameAsIntegrationCodeAsAndClickToSaveButton(String arg0, String arg1) {

        c.mySendKeys(c.nameInput,arg0);
        c.mySendKeys(c.codeInput,arg1);
        c.myClick(c.saveButton);

    }
}
