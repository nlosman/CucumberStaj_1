package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class Parent {

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    public WebElement positions;

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void mySendKeys(WebElement element, String str) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(str);
    }

    public void verifyContainsText(WebElement element, String str) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, str));
        Assert.assertTrue(element.getText().toLowerCase().contains(str.toLowerCase()));
        new Actions(Driver.getDriver()).sendKeys(Keys.ESCAPE).build().perform(); }


    public void verifyToolbarOpened(WebElement element, String str) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, str));
        Assert.assertTrue(element.getText().toLowerCase().contains(str.toLowerCase()));

    }

    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void mySelect(WebElement select, WebElement option){
        wait.until(ExpectedConditions.elementToBeClickable(select));
        scrollToElement(select);
        Actions aksiyonlar = new Actions(Driver.getDriver());

        aksiyonlar.moveToElement(select).click().build().perform();
        aksiyonlar.moveToElement(option).click().build().perform();
    }



}
