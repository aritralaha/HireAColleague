package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class enterHomeAddressPage extends basePage {
    public enterHomeAddressPage(WebDriver driver){
        super(driver);
    }
    public Actions act = new Actions(driver);

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//input[contains(@id,'-COUNTRY-W2Input')]")
    WebElement entrCountry;

    @FindBy(xpath="//input[contains(@id,'-ADDRESS1-W2Text')]")
    WebElement entrAddressLine1;

    @FindBy(xpath="//input[contains(@id,'-ADDRESS2-W2Text')]")
    WebElement entrAddressLine2;

    @FindBy(xpath="//input[contains(@id,'-ADDRESS3-W2Text')]")
    WebElement entrAddressLine3;

    @FindBy(xpath = "//input[contains(@id,'-ADDRESS4-W2Text')]")
    WebElement entrAddressLine4;

    @FindBy(xpath = "//input[contains(@id,'ADDRESSR-W2Text')]")
    WebElement entrCounty;

    @FindBy(xpath = "//input[contains(@id,'ADDRESSM-W2Text')]")
    WebElement entrCountyforIE;

        @FindBy(xpath = "//input[contains(@id,'-ADDRESSPC-W2Text')]")
    WebElement entrPostCode;


    public void setEntrCountry() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
    }

    public void setEntrAddressLine1(String line1) throws InterruptedException {
        Thread.sleep(1000);
        entrAddressLine1.sendKeys(line1);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

    }

    public void setEntrAddressLine2(String line2) throws InterruptedException {
        Thread.sleep(1000);
        entrAddressLine2.sendKeys(line2);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
    }

    public void setEntrAddressLine3(String line3) throws InterruptedException {
        Thread.sleep(1500);
        entrAddressLine3.sendKeys(line3);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

    }

    public void setEntrAddressLine4(String line4) throws InterruptedException {
        Thread.sleep(1000);
        entrAddressLine4.sendKeys(line4);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

    }

    public void setEntrCounty(String county) throws InterruptedException {
        Thread.sleep(1000);
        entrCounty.sendKeys(county);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

    }

    public void setEntrCountyforIE(String county) throws InterruptedException {
        Thread.sleep(1000);
        entrCountyforIE.sendKeys(county);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

    }

    public void setEntrPostCode(String postcode) throws InterruptedException {
        Thread.sleep(1000);
        entrPostCode.sendKeys(postcode);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
    }


}
