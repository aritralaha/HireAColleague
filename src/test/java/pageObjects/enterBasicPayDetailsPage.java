package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

public class enterBasicPayDetailsPage extends basePage {

    public enterBasicPayDetailsPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//input[@title='Press WINDOW to select the structure unit the employee belongs to']")
    WebElement entrStructureUnit;

    @FindBy(xpath = "//button[contains(@id,'EffectiveDate-W2Button')]")
    WebElement clkOnCalendar;

    @FindBy(xpath="//div[@class='webview-datepicker']//table//tr[@class='webview-datepicker__body']//tr")
    WebElement listOfDates;


   public void setEntrStructureUnit(String structureUnit) throws InterruptedException {
       Thread.sleep(2000);
       driver.switchTo().frame(iframe);
       Thread.sleep(500);
       entrStructureUnit.sendKeys(structureUnit);
       Actions act = new Actions(driver);
       act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
       driver.switchTo().defaultContent();
       Thread.sleep(500);
       }

       }







