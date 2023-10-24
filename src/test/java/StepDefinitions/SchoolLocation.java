package StepDefinitions;
import Pages.Content;
import Pages.Side;
import Utilities.Driver;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.*;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
public class SchoolLocation {

    Side side1 = new Side();
    Content cnt = new Content();


    @Then("Click on the element in Side")
    public void clickOnTheElementInSide(DataTable buttonLocations) {

        List<String> strLocations = buttonLocations.asList(String.class);

        for (String strlocator : strLocations){

            WebElement buttonLink = side1.getButtons(strlocator);
            side1.myClick(buttonLink);

        }
    }

    @When("Click to add button in Side")
    public void clickToAddButtonInSide() {cnt.myClick(cnt.addButton);}

    @Then("Should be open the toolbar for Locations")
    public void shouldBeOpenTheToolbarForLocations() {
        cnt.verifyToolbarOpened(cnt.toolbarName, "Location");
    }

    @And("Create a Location name as {string} short name as {string}")
    public void createALocationNameAsShortNameAs(String name, String shortName) {

        cnt.mySendKeys(cnt.name, name);
        cnt.mySendKeys(cnt.shortName, shortName);

    }

    @Then("Add classroom and capacity to toolbar")
    public void addClassroomAndCapacityToToolbar() {
        new Actions(Driver.getDriver()).moveToElement(cnt.classroom)
                .click().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
                .build().perform();
        cnt.mySendKeys(cnt.capacity, "20");
        cnt.myJsClick(cnt.name);
    }

    @And("Click to Save button")
    public void clickToSaveButton() {cnt.myClick(cnt.saveButton);}

    @When("Click to edit button in School Setup")
    public void clickToEditButtonInSchoolSetup() {
        cnt.myClick(cnt.editBtnSchoolSetup);
    }

    @And("Edit a Location name as {string} short name as{string}")
    public void editALocationNameAsShortNameAs(String name2, String shortname2) {
        cnt.name.clear();
        cnt.mySendKeys(cnt.name, name2);
        cnt.mySendKeys(cnt.shortName, shortname2);
    }

    @Then("Click to delete button in Locations")
    public void clickToDeleteButtonInLocations() {cnt.myClick(cnt.deleteButton_1);}

    @When("Should be open the Delete toolbar")
    public void shouldBeOpenTheDeleteToolbar() {
        cnt.verifyToolbarOpened(cnt.deleteText, "Delete");
    }

    @When("Click for verify deletion")
    public void clickForVerifyDeletion() {

        new Actions(Driver.getDriver()).moveToElement(cnt.deleteButton_2)
                .click().sendKeys(Keys.ENTER)
                .build().perform();

    }

    @When("Activity button verification")
    public void activityButtonVerification() {

        List<WebElement> activeButtons =Driver.getDriver().findElements(By.cssSelector("button[role='switch']"));

        for (int i = 0; i < cnt.activeButtonList.size(); i++) {

            if (activeButtons.get(i).equals("true"))
                Assert.assertEquals(cnt.activeButtonList, "true");
            else
                Assert.assertEquals(cnt.activeButtonList, "false");}

    }

}
