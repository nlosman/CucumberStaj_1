package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Content extends Parent {

    public Content() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginbuton;
    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement textTechnoStudy;

    @FindBy(css = "span[class='mat-mdc-button-touch-target")
    public WebElement Addbutton;

    @FindBy(css = "div[class=mat-form-field-infix ng-tns-c2794762957")
    public WebElement Nameinput;
    @FindBy(css = "span[style='visibility:visible;']")
    public WebElement Savebutton;


}