package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(css = "span[class='title dialog-title']")
    public WebElement toolbarName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    public WebElement descriptionInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement integrationCodeInput;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@data-placeholder='Description']")
    public WebElement searchDescription;
    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    public WebElement searchIntegrationCode;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    public void staleElement() {wait.until(ExpectedConditions.elementToBeClickable(searchButton));}

    @FindBy(xpath = "//ms-edit-button//button")
    public WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteButton_1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton_2;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement nameInput_2;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-placeholder='IBAN']")
    public WebElement ibanInput;

    @FindBy(xpath="//mat-select[@formcontrolname='currency']")
    public WebElement currency;

    @FindBy(xpath="//div[@role='listbox']//mat-option[1]")
    public WebElement currencyOption;

    @FindBy(xpath = "//input[@data-placeholder='name']")
    public WebElement searchInput;





    @FindBy(css = "[id='ms-text-field-1'][type='text']")
    public WebElement shortName;

    @FindBy(css = "mat-select[role='combobox'][id='mat-select-4']")
    public WebElement classroom;

    @FindBy(css = "input[type='text'][inputmode='numeric']")
    public WebElement capacity;

    @FindBy(css = "[id='ms-text-field-0'][type='text']")
    public WebElement name;

    @FindBy (xpath = "(//ms-edit-button[@table='true'])[1]")
    public WebElement editBtnSchoolSetup;

    @FindBy (css = "div[class='mdc-dialog__container'] h3")
    public WebElement deleteText;








    @FindBy(css = "span[class='mat-mdc-button-touch-target")
    public WebElement Addbutton;


    @FindBy(css = "div[class=mat-form-field-infix ng-tns-c2794762957")
    public WebElement Nameinput;
    @FindBy(css = "span[style='visibility:visible;']")
    public WebElement Savebutton;

    @FindBy (css = "button[role='switch']")
    public List<WebElement> activeButtonList;




}