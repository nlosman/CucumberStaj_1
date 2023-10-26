package StepDefinitions;

import Pages.Content;
import Pages.Side;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GradeLevel {
    Content content = new Content();
    Side side = new Side();
    @Given("Navigate to Grade Levels")
    public void navigateToGradeLevels(DataTable links) {
        List<String> linkList = links.asList(String.class);

        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = side.getButtons(linkList.get(i));
            side.myClick(linkWebElement);
        }
    }

    @Then("Should be open the add Grade level toolbar")
    public void shouldBeOpenTheAddGradeLevelToolbar() {
        content.verifyToolbarOpened(content.toolbarName, "Grade");
    }

    @When("Create a Grade level name as {string} Short name as {string} Order as {string} Next Grade as {string} Max application count as {string} and click to save button")
    public void createAGradeLevelNameAsShortNameAsOrderAsNextGradeAsMaxApplicationCountAsAndClickToSaveButton(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }
}
