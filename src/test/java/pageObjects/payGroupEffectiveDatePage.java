package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class payGroupEffectiveDatePage extends basePage {
    public payGroupEffectiveDatePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//input[@title='Enter effective date of Pay Group change']")
    WebElement entreffectiveDate;

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    public void setEntreffectiveDate(String effectiveDate) throws InterruptedException {

        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        entreffectiveDate.sendKeys(effectiveDate);
        Actions act = new Actions(driver);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }
}
