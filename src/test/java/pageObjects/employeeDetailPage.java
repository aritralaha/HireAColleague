package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class employeeDetailPage extends basePage {
    public employeeDetailPage(WebDriver driver){
        super(driver);
    }

   @FindBy(xpath="//input[contains(@id,'-OriginalStartText')]")
    WebElement entrOrgStartDate;

    @FindBy(xpath="//input[contains(@id,'-CurrentStartText')]")
    WebElement entrCurrentStrtDate;

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//button[contains(@id,'-EmployeeTypeButton')]")
    WebElement clkonEmplyeeTypeButton;

    //@FindBy(xpath="//table[@class='zds-select-table']//span[text()='EMP']")


    @FindBy(xpath="//input[contains(@id,'-EmployeeTypeInput')]")
    WebElement chooseEmpType;

    @FindBy(xpath="//input[contains(@id,'-TerminationText')]")
    WebElement entrTerminationDate;

    @FindBy(xpath="//input[contains(@id,'-EmpLeavingReasonInput')]")
    WebElement entrReasonForTermination;



    public void setEntrOrgStartDate(String date) throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrOrgStartDate.sendKeys(date);
        Actions act = new Actions(driver);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Thread.sleep(500);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Thread.sleep(500);
    }

    public void setEntrCurrentStrtDate(String date) throws InterruptedException {
        entrCurrentStrtDate.sendKeys(date);
        Actions act = new Actions(driver);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(1000);
    }

    public void setClkonEmplyeeTypeButton() throws InterruptedException {
        clkonEmplyeeTypeButton.click();
        Thread.sleep(1000);
    }

    public void setChooseEmpType(String empType) throws InterruptedException {
        chooseEmpType.sendKeys(empType);
        Thread.sleep(500);
        chooseEmpType.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);

    }

    public void setEntrTerminationDate(String date) throws InterruptedException {

        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrTerminationDate.sendKeys(date);
        Thread.sleep(500);
        entrTerminationDate.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);


    }

    public void setEntrReasonForTermination(String reason) throws InterruptedException {

        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrReasonForTermination.sendKeys(reason);
        Thread.sleep(500);
        entrReasonForTermination.sendKeys(Keys.TAB);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setClearTerminationDate() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrTerminationDate.clear();
        Thread.sleep(500);
        entrTerminationDate.clear();
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setClearLeavingReason() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrReasonForTermination.clear();
        Thread.sleep(700);
        entrReasonForTermination.clear();
        Thread.sleep(200);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

}
