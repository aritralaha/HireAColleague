package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class enterBankDetailsForIE extends basePage{

    public enterBankDetailsForIE(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//button[contains(@id,'-BICCODE-W2Button')]")
    WebElement clkon3DotsForBICCode;

    @FindBy(xpath="//button[contains(@id,'-CountryID-W3Button')]")
    WebElement clkOn3DotsforCountryId;

    @FindBy(xpath="//input[contains(@id,'-ResultCode-W4Text')]")
    WebElement enterNarrCodeforIE;

    @FindBy(xpath= "//span[text()='Select']")
    WebElement clkOnSelectButton;

    @FindBy(xpath="//input[contains(@id,'-CountryID-W3Input')]")
    WebElement tabThruCountryId;

    @FindBy(xpath="//input[contains(@id,'-BICCode-W3Text')]")
    WebElement tabThruBICCode;

    @FindBy(xpath="//input[contains(@id,'-BICCODE-W2Input')]")
    WebElement getTabThruBICCode2;

    @FindBy(xpath="//input[contains(@id,'B-Iban-W2Text')]")
    WebElement enterIBANForIE;

    @FindBy(xpath = "//input[contains(@id,'-AccountName-W2Text')]")
    WebElement tabThruAccountName;

    public void setClkon3DotsForBICCode() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkon3DotsForBICCode.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }

    public void setClkOn3DotsforCountryId() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOn3DotsforCountryId.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

    }

    public void setEnterNarrCodeforIE(String narrCode) throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        enterNarrCodeforIE.sendKeys(narrCode);
        Thread.sleep(500);
        enterNarrCodeforIE.sendKeys(Keys.TAB);
        Thread.sleep(500);
    }

    public void setclkOnSelectButton() throws InterruptedException {
        clkOnSelectButton.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }

    public void setTabThruCountryId() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        tabThruCountryId.sendKeys(Keys.TAB);
        Thread.sleep(500);
    }

    public void setTabThruBICCode() throws InterruptedException {
        tabThruBICCode.sendKeys(Keys.TAB);
        Thread.sleep(500);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }

    public void setGetTabThruBICCode2() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        getTabThruBICCode2.sendKeys(Keys.TAB);
        Thread.sleep(800);
    }

    public void setTabThruAccountName() throws InterruptedException {
        tabThruAccountName.sendKeys(Keys.TAB);
        Thread.sleep(500);
    }

    public void setEnterIBANForIE(String Iban) throws InterruptedException {
        enterIBANForIE.sendKeys(Iban);
        Thread.sleep(1200);
        enterIBANForIE.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }








}
