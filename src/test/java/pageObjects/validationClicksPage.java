package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class validationClicksPage extends basePage {
    public validationClicksPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[text()='OK']")
    WebElement clkOnOK;

    @FindBy(xpath="//button[contains(@id,'-Window1Close')]")
    WebElement clkOnCrossButton;

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//button[contains(@id,'_Yes')]")
    WebElement clkOnYes;

    @FindBy(xpath="//div[contains(text(),'Warning - Employee ')]")
    WebElement LeaverWarningVisibility;



    public void setClkOnOK() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        clkOnOK.click();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }

    public void setClkOnCrossButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(iframe);
        Thread.sleep(1500);
        clkOnCrossButton.click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

    }

    public void setClkOnYes() throws InterruptedException {
        driver.switchTo().frame(iframe);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", clkOnYes);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

    }

    public void setClickOnOKforLeaverScenario() throws InterruptedException {
        Thread.sleep(500);
        driver.switchTo().frame(iframe);
        if(LeaverWarningVisibility.getText().contains("Warning - Employee")){
            clkOnOK.click();
        }
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }



}
