package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class enterLegislationPage extends basePage {

    public enterLegislationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//button[contains(@id,'LegislationType-W2Button')]")
    WebElement clkOn3DotsForLegislation;

    @FindBy(xpath="//input[contains(@id,'LegislationType')]")
    WebElement tabThrulegislationType;

    @FindBy(xpath="//input[contains(@id,'-ResultCode-W3Text')]")
    WebElement enterLegislationType;

    @FindBy(xpath = "//div[contains(@class,'row zds-table__BS4-row')]//input[contains(@title,'IE')]")
    WebElement clkOnIELegislation;

    @FindBy(xpath="//span[text()='Select']")
    WebElement clkOnSelectButton;

    @FindBy(xpath="//span[contains(@id,'Exit')]")
    WebElement clkOnExitButtonFromLegislation;

    public void setClkOnExit() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        tabThrulegislationType.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
    }

    public void setClkOn3DotsForLegislation() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(700);
        clkOn3DotsForLegislation.click();
        Thread.sleep(700);
        driver.switchTo().defaultContent();
        Thread.sleep(500);

    }

   public void setEnterLegislationType(String countryCode) throws InterruptedException {
       driver.switchTo().frame(iframe);
       Thread.sleep(700);
       enterLegislationType.sendKeys(countryCode);
       Thread.sleep(500);
       enterLegislationType.sendKeys(Keys.TAB);
       Thread.sleep(500);
       String s  = clkOnIELegislation.getAttribute("value");
       if(s.equals("IE")){
           clkOnIELegislation.click();
       }
       driver.switchTo().defaultContent();
       Thread.sleep(500);
   }

   public void setClkOnExitButtonFromLegislation() throws InterruptedException {
       driver.switchTo().frame(iframe);
       Thread.sleep(700);
        clkOnExitButtonFromLegislation.click();
       Thread.sleep(700);
       driver.switchTo().defaultContent();
       Thread.sleep(1500);
   }
}
