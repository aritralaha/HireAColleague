package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftscrollPage extends basePage {
    public LeftscrollPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//span[text()='Home Address']")
    WebElement clkOnHomeAddress;

    @FindBy(xpath="//span[contains(text(),'Basic Pay Details')]")
    WebElement clkOnBasicPayDetails;

    @FindBy(xpath="//span[contains(text(),'Current/Future Post')]")
    WebElement clkOncurrentFuturePost;

    @FindBy(xpath="//span[contains(text(),'Employment Detail')]")
    WebElement clkOnEmpDetail;

    @FindBy(xpath="//span[text()='Save']")
    WebElement clkOnSave;

    @FindBy(xpath="//div[@class='navigation-footer']//z-ui-btn//span[text()='Continue']")
    WebElement clkOnFooterContinue;


    public void setClkOnHomeAddress(){
        clkOnHomeAddress.click();
    }

    public void  setClkOnBasicPayDetails() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        clkOnBasicPayDetails.click();
        Thread.sleep(1000);
    }

    public void switchToDefaultContent() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }

    public void setClkOncurrentFuturePost(){
        clkOncurrentFuturePost.click();
    }

    public void setClkOnEmpDetail() throws InterruptedException {

        driver.switchTo().defaultContent();
        Thread.sleep(500);
        clkOnEmpDetail.click();
        Thread.sleep(1000);
    }

    public void setClkOnSave() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", clkOnSave);
        Thread.sleep(500);
    }

    public void setClkOnSave1() throws InterruptedException {
        clkOnSave.click();
        Thread.sleep(1000);
    }

    public void setClkOnFooterContinue(){
        clkOnFooterContinue.click();
    }
}
