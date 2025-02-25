package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterEmployeeNumberPage extends basePage {

    public EnterEmployeeNumberPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath="//input[contains(@id,'EmployeeNumberText')]")
    WebElement entrempNo;

    @FindBy(xpath="//iframe[contains(@id,'iframe')]")
    WebElement iframe;

    @FindBy(xpath="//button[text()='Add']")
    WebElement clkOnAdd;

    @FindBy(xpath="//button[contains(@id,'btn-close-OPEN_CLIENT')]")
    WebElement clkOnCloseBtn;

    @FindBy(xpath = "//button[contains(@id,'header-button-sign-out')]")
    WebElement clkOnLogOutBtn;

    @FindBy(xpath="//button[text()='Search']")
    WebElement clkOnSearchbtn;




    public void setEntrEmpNo(String empno) throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1500);
        entrempNo.sendKeys(empno);
        Thread.sleep(500);
        entrempNo.sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

    }

    public void setClkOnAdd() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnAdd.click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(700);

    }

    public boolean entrEmpNoVisibility() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        Boolean b = entrempNo.isDisplayed();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        return b;
    }

    public void closeCreateNewEmpPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clkOnCloseBtn);
        Thread.sleep(1000);
    }

    public void setClkOnLogOutBtn() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",clkOnLogOutBtn);
        Thread.sleep(1000);
    }

    public void setClkOnSearchbtn() throws InterruptedException {
        clkOnSearchbtn.click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }





}
