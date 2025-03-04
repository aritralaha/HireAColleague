package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class personalDetailsPage extends basePage{



    public personalDetailsPage(WebDriver driver){
        super(driver);
    }

    public Actions act=new Actions(driver);

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//input[contains(@id,'-SurnameInput')]")
    WebElement enterSurname;

    @FindBy(xpath="//button[contains(@id,'-TitleButton')]")
    WebElement clkOnTitleArrow;

    @FindBy(xpath="//div[contains(@id,'-TitleInput')]//table[@class='zds-select-table']//span[text()='DR']")
    WebElement clkOnDrOption;

    @FindBy(xpath="//input[(contains(@id,'-FirstForenameText'))]")
    WebElement entrFirtstName;

    @FindBy(xpath="//input[contains(@id,'-GenderText')]")
    WebElement enterGender;

    @FindBy(xpath="//input[contains(@id,'-DateOfBirthInput')]")
    WebElement enterDOB;

    @FindBy(xpath ="//input[contains(@id,'-NINOText')]")
    WebElement enterNINo;





    public void setEnterSurname(String surnames) throws InterruptedException {

        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        enterSurname.sendKeys(surnames);
    }

    public void setClkOnTitleArrow() throws InterruptedException {
        Thread.sleep(1000);
        clkOnTitleArrow.click();
    }

    public void setClkOnDrOption() throws InterruptedException {

        Thread.sleep(1000);
        clkOnDrOption.click();
    }

    public void setEntrFirtstName(String firstname) throws InterruptedException {
        Thread.sleep(1000);
        entrFirtstName.sendKeys(firstname);
        act.keyDown(Keys.TAB).keyDown(Keys.TAB);
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(1500);
    }

    public void setEnterGender(String gender) throws InterruptedException {
        enterGender.sendKeys(gender);
       enterGender.sendKeys(Keys.TAB);
        Thread.sleep(3000);
    }

    public void setEnterDOB(String dob) throws InterruptedException {

        enterDOB.sendKeys(dob);
        Thread.sleep(500);
        enterDOB.sendKeys(Keys.TAB);
        Thread.sleep(1500);
    }

    public void setEnterNINo(String nino) throws InterruptedException {

        enterNINo.sendKeys(nino);
        Thread.sleep(1500);

        driver.switchTo().defaultContent();

    }

    public void clearAndEnterSurname(String surname) throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        enterSurname.clear();
        Thread.sleep(500);
        enterSurname.sendKeys(surname);
        Thread.sleep(500);
        enterSurname.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }


}
