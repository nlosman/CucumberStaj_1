package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Side extends Parent {


    public Side() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    public WebElement discounts;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;


        return null;

    }


    @FindBy(className = "nav-link-title ng-tns-c3380182179-15 ng-star-inserted")
    public WebElement HumanRecources;
    @FindBy(className = "nav-link-title ng-tns-c3380182179-16 ng -star-inserted")
    public WebElement Setup;
    @FindBy(className = "nav-link-title ng-star-inserted")
    public WebElement PositionsCategories;




}
