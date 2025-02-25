package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;

public class basePage {

    WebDriver driver;

    public basePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


}
