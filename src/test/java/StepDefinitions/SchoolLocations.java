package StepDefinitions;

import Pages.Side;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SchoolLocations {

    Side sde = new Side();


    @Then("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable buttonLocations) {
        List<String> strLocations = buttonLocations.asList(String.class);

        for (String strlocator : strLocations){
            WebElement buttonLink = sde.getButtons(strlocator);
            sde.myClick(buttonLink);


        }


    }
}
