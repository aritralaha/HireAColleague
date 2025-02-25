package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class emailAddressPageforIE extends basePage {

    public emailAddressPageforIE(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;
    @FindBy(xpath="//span[text()='Back']")
    WebElement clkOnBackButton;

    @FindBy(xpath="//span[contains(text(),'Email Address')]")
    WebElement clkOnEmailAddress;

    @FindBy(xpath="//input[contains(@id,'-Email-W2Text')]")
    WebElement enteremailAddress;

    public void setClkOnBackButton() throws InterruptedException {
        clkOnBackButton.click();
        Thread.sleep(1000);
    }

    public void setClkOnEmailAddress() throws InterruptedException {
        clkOnEmailAddress.click();
        Thread.sleep(1000);
    }

    public void setEnteremailAddress(String email) throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        enteremailAddress.sendKeys(email);
        Thread.sleep(400);
        enteremailAddress.sendKeys(Keys.TAB);
        Thread.sleep(800);
    }





}
