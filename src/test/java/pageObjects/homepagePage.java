package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepagePage extends basePage {

    public homepagePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//ul[@class='zds-left-panel__collapsed-menu zds-left-panel__collapsed-menu--active']//li[1]//button")
    WebElement clkOnShortCuts;

    @FindBy(xpath="//span[text()='Create New Employee']")
    WebElement clkOnCreateNewEmp;

    @FindBy(xpath="//input[@placeHolder='Enter fast path']")
    WebElement entrFastpath;

    @FindBy(xpath="//span[contains(@class,'fast-path__btn')]")
    WebElement clkOnSearchBtn;

    @FindBy(xpath="//div[contains(@class,'fast-path__dropdown')]//span[text()='HREMPALL']")
    WebElement clkOnDesiredFastpath;


    public void setClkOnShortCuts(){
        clkOnShortCuts.click();
    }

    public void setClkOnCreateNewEmp(){
        clkOnCreateNewEmp.click();
    }

    public void setEntrFastpath(String fastpath){

        entrFastpath.sendKeys(fastpath);


    }

    public void setClkOnSearchBtn(){
        clkOnSearchBtn.click();
    }

    public void setClkOnDesiredFastpath(){
        clkOnDesiredFastpath.click();
    }






}
