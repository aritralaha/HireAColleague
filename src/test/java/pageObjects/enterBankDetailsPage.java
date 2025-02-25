package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class enterBankDetailsPage extends basePage {

    public enterBankDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[contains(@id,'-SORTCODE-W2Input')]")
    WebElement enterSortCode;

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//input[contains(@id,'-AccountNo-W2Text')]")
    WebElement entrAccNo;

    @FindBy(xpath="//input[contains(@id,'-AccountName-W2Text')]")
    WebElement entrAccname;

    @FindBy(xpath="//input[contains(@id,'-AccountType-W2Input')]")
    WebElement entrAccountType;

    @FindBy(xpath="//button[contains(@id,'-AccountType-W2Button')]")
    WebElement clkOnDownArrow;

    @FindBy(xpath="//table//span[text()='0']")
    WebElement clkOnZero;



    public void setEnterSortCode(String sortCode) throws InterruptedException {
        driver.switchTo().frame(iframe);
        enterSortCode.sendKeys(sortCode);
        Actions act = new Actions(driver);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Thread.sleep(500);
    }

    public void setEntrAccNo(String accno) throws InterruptedException {
        entrAccNo.sendKeys(accno);
        Actions act = new Actions(driver);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        Thread.sleep(1500);

    }


    public void setClkOnDownArrow() throws InterruptedException {
        clkOnDownArrow.click();
        Thread.sleep(500);
    }
    public void setClkOnZero() throws InterruptedException {
        clkOnZero.click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }










}
