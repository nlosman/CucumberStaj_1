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


}