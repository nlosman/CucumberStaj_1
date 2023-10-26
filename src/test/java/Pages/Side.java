package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Side extends Parent {


    public Side() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
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

    @FindBy(xpath = "(//span[text()='Grade Levels'])[1]")
    public WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement departments;

  
    public WebElement getButtons(String element){
        switch (element){

            case "setup" : return this.setup;
            case "schoolSetup" : return this.schoolSetup;
            case "locations" : return this.locations;
            case "parameters": return this.parameters;
            case "bankAccount": return this.bankAccount;
            case "departments": return this.departments;
            case "gradeLevels": return this.gradeLevels;

        }

        return null;

    }

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement fields;
    @FindBy(xpath = "(//span[text()='Human Resources'])[1]")
    public WebElement humanRecources;
    @FindBy(css = "[class='nav-link ng-tns-c2089661534-16 ng-star-inserted']")
    public WebElement humanRecourcesSetup;

    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement positionsCategories;

    @FindBy(xpath = "//span[text()='Positions']")
    public WebElement humanRecourcesPositions;

}





