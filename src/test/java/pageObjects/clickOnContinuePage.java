package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clickOnContinuePage extends basePage {
    public clickOnContinuePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;
    @FindBy(xpath = "//p[text()='Active session exists']")
    WebElement isActiveSessionExists;

    @FindBy(xpath="//span[text()='Yes']")
    WebElement clickOnYes;
    @FindBy(xpath="//span[text()='Continue']")
    WebElement clkOnContinue;

    public void clickOnContinue(){
        clkOnContinue.click();
    }

    public boolean isActiveSessionExists() throws InterruptedException {

        Boolean bool = isActiveSessionExists.isEnabled();

        //String s = isActiveSessionExists.getText();
        if(bool==true){
            return true;
        }
        else{
            return false;
        }
    }

    public void clickOnYes() throws InterruptedException {
        clickOnYes.click();
    }

}
