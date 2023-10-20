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
    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(css="span[class='title dialog-title']")
    public WebElement toolbarName;

    @FindBy(xpath="//ms-text-field[@formcontrolname='description']//input")
    public WebElement descriptionInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    public WebElement integrationCodeInput;
    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityInput;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@data-placeholder='Description']")
    public WebElement searchDescription;
    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    public WebElement searchIntegrationCode;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    public WebElement editButton;

    @FindBy(xpath="//ms-delete-button//button")
    public WebElement deleteButton_1;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteButton_2;





}