package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class openingPageRL extends basePage {

    public openingPageRL(WebDriver driver){
        super(driver);
    }

 @FindBy(xpath="//input[@id='j_username']")
    WebElement entrusrname;

 @FindBy(xpath="//input[@id='j_password']")
    WebElement entrpswrd;

 @FindBy(xpath="//button[@id='doLogin']")
 WebElement clkLogin;


 public void enterUsername(String username){
     entrusrname.sendKeys(username);
 }

 public void enterPassword(String password){
     entrpswrd.sendKeys(password);
 }

 public void clickonLogin(){
     clkLogin.click();
 }


}
