package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class currentFuturePostPage extends basePage {
    public currentFuturePostPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath = "//input[contains(@id,'-DATE_1Text')]")
    WebElement entrpostStartDate;

    @FindBy(xpath="//input[contains(@id,'DATE_2Text')]")
    WebElement entrPost2StartDate;

    @FindBy(xpath = "//input[contains(@id,'-POST_1Input')]")
    WebElement entrPost;

    @FindBy(xpath="//input[contains(@id,'-POST_2Input')]")
    WebElement entrPost2;

    @FindBy(xpath="//span[text()='Add']")
    WebElement clkOnAddButton;

    @FindBy(xpath="//button[contains(@id,'-CopyPostTypes-')]")
    WebElement clkOnCopyPostTypesDrpDwn;

    @FindBy(xpath="//input[contains(@id,'-CopyPostTypes-W2Input')]")
    WebElement tabThruSelectedCopyPostType;

    @FindBy(xpath="//button[contains(@id,'W2_proiv_MD48G17-160-W3TextPanel')]")
    WebElement clkOnSelectPost;

    @FindBy(xpath="//button[text()='Yes']")
    WebElement clkOnYesButton;


    public void setEntrpostStartDate(String date) throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrpostStartDate.click();
        Thread.sleep(1000);
        entrpostStartDate.sendKeys(date);
        Thread.sleep(1000);
        entrpostStartDate.sendKeys(Keys.TAB);
        Thread.sleep(1000);
    }

    public void setEntrPost(String post) throws InterruptedException {
        entrPost.click();
        entrPost.sendKeys(post);
        Thread.sleep(500);
        entrPost.sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();

    }

    public void setClkOnAddButton() throws InterruptedException {
        Thread.sleep(500);
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnAddButton.click();
        Thread.sleep(300);
        driver.switchTo().defaultContent();
    }

    public void setEntrPost2StartDate(String date) throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        entrPost2StartDate.click();
        Thread.sleep(1000);
        entrPost2StartDate.sendKeys(date);
        Thread.sleep(1000);
        entrPost2StartDate.sendKeys(Keys.TAB);
        Thread.sleep(1000);
    }

    public void setEntrPost2(String post) throws InterruptedException {
        entrPost2.click();
        entrPost2.sendKeys(post);
        Thread.sleep(500);
        entrPost2.sendKeys(Keys.TAB);
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(500);

    }

    public void setClkOnCopyPostTypesDrpDwn() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnCopyPostTypesDrpDwn.click();
        Thread.sleep(300);
    }

    public void setCopyPosttype() throws InterruptedException {
        List<WebElement> clkOnCopyPostTypes = driver.findElements(By.xpath("//div[contains(@id,'-CopyPostTypes-')]//tbody//span[2]"));
        for(int i =0; i<clkOnCopyPostTypes.size();i++){
            if(clkOnCopyPostTypes.get(i).getText().equals("General Post Copy")){
                clkOnCopyPostTypes.get(i).click();

            }

        }
        Thread.sleep(500);
    }

    public void setTabThruSelectedCopyPostType() throws InterruptedException {
        tabThruSelectedCopyPostType.sendKeys(Keys.TAB);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

    }

    public void setClkOnSelectPost() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnSelectPost.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
    }

    public void setClkOnYesButton() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnYesButton.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();

    }




}

