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

    @FindBy(css = "[class='nav-link-title ng-tns-c2089661534-8 ng-star-inserted']")
    public WebElement schoolSetup;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-star-inserted'])[15]")
    public WebElement locations;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    public WebElement bankAccount;

    public WebElement getButtons(String element){
        switch (element){

            case "setup" : return this.setup;
            case "schoolSetup" : return this.schoolSetup;
            case "locations" : return this.locations;
            case "parameters": return this.parameters;
            case "bankAccount": return this.bankAccount;

        }

        return null;

    }


    @FindBy(className = "nav-link-title ng-tns-c3380182179-15 ng-star-inserted")
    public WebElement HumanRecources;
    @FindBy(className = "nav-link-title ng-tns-c3380182179-16 ng -star-inserted")
    public WebElement Setup;
    @FindBy(className = "nav-link-title ng-star-inserted")
    public WebElement PositionsCategories;




}
