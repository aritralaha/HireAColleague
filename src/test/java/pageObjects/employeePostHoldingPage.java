package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class employeePostHoldingPage extends basePage{
    public employeePostHoldingPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//a[@title='Conditions of Service']")
    WebElement clkOnConditns;

    @FindBy(xpath="//iframe[contains(@id,'_iframe')]")
    WebElement iframe;

    @FindBy(xpath="//button[contains(@id,'-POS_STAT-W2Button')]")
    WebElement clkOnPositionStatus;

    @FindBy(xpath="//input[contains(@id,'-STDATE_1Text')]")
    WebElement clkOnStartDate;

    @FindBy(xpath="//input[contains(@id,'-EmpPostPosnStatEndDate_1Text')]")
    WebElement tabThruEndDate;

    @FindBy(xpath="//button[contains(@class,'-primary rlfm-button')]")
    WebElement clkOnAddButton;

    @FindBy(xpath="//button[contains(@id,'-EmpPostPositionStatus_1Button')]")
    WebElement clkOnPositionStatusDropdwn;

    @FindBy(xpath="//input[contains(@id,'-PostLongDesc-W3Text')]")
    WebElement getLongDesc;

    @FindBy(xpath="//span[contains(@id,'-W3Text_Exit')]")
    WebElement clkOnExit;

    @FindBy(xpath="//a[@title='Grade Details']")
    WebElement clkOnGrade;

    @FindBy(xpath="//button[contains(@id,'-GRADEW-W2Button')]")
    WebElement clkOn3DotsUnderGrade;

    @FindBy(xpath="//button[contains(@id,'-GRDPOINT_1Button')]")
    WebElement clkon3DotsforGradePoints;

    @FindBy(xpath="//span[text()='Add']")
    WebElement clkOnAdd;

    @FindBy(xpath="//input[contains(@id,'-ENDDT_1Text')]")
    WebElement clkOnEndDate;

    @FindBy(xpath="//span[text()='Select']")
    WebElement clkOnSelect;

    @FindBy(xpath="//span[contains(@id,'-W3Text_Exit')]")
    WebElement clkOnExitfromGrade;

    @FindBy(xpath="//input[contains(@id,'-EmpPostPositionStatus_1Input')]")
    WebElement clkOnExistingPositionStatus;

    @FindBy(xpath="//button[contains(@id,'W2_proiv_MD47G40-CyclePagingPagingArea-W3Node_grid0_gridHeaderCell')]")
    WebElement clkOnArrowUnderGrade;

    @FindBy(xpath="//input[contains(@id,'-GradeBasicAmount_')]")
    WebElement enterbasicSalary;


    public void setClkOnConditns() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        clkOnConditns.click();
        Thread.sleep(500);
    }

    public void setClkOnPositionStatus() throws InterruptedException {
        clkOnPositionStatus.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setClkOnAddButton() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        clkOnAddButton.click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
    }

    public void setClkOnStartDate() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnStartDate.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setTabThruEndDate() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        tabThruEndDate.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
    }

    public void setClkOnExistingPositionStatus() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnExistingPositionStatus.clear();
        Thread.sleep(500);
        driver.switchTo().defaultContent();

    }


    public void setClkOnPositionStatusDropdwn() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        clkOnPositionStatusDropdwn.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setClkOnPositionStatus1() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(500);
        String value = getLongDesc.getAttribute("value");
        List<WebElement> listofPositionStatus = driver.findElements(By.xpath("//div[contains(@id,'EmpPostPositionStatus_1Input_')]//tr[*]//td[4]//span[2]"));
        if(value.contains("37.5")){
            for(int i =0;i< listofPositionStatus.size();i++){
                if(listofPositionStatus.get(i).getText().contains("37.5")){
                    listofPositionStatus.get(i).click();
                }

            }
        }

        else if (value.contains("40")) {
            for(int i=0;i< listofPositionStatus.size();i++){
                if(listofPositionStatus.get(i).getText().contains("40")){
                    listofPositionStatus.get(i).click();
                }
            }

        } else if (value.contains("Manager")) {
            for(int i =0;i< listofPositionStatus.size();i++){
                if(listofPositionStatus.get(i).getText().contains("36")){
                    listofPositionStatus.get(i).click();
                } else if (listofPositionStatus.get(i).getText().contains("39")) {
                    listofPositionStatus.get(i).click();
                }
            }
        }


        Thread.sleep(500);

        }

    public void setClkOnExit() throws InterruptedException {
        clkOnExit.click();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setclkOnGrade() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        clkOnGrade.click();
        Thread.sleep(500);


    }

    public void setClkOn3DotsUnderGrade() throws InterruptedException {

        clkOn3DotsUnderGrade.click();
        Thread.sleep(500);
    }

    public void setClkOn3DotsUnderGrade1() throws InterruptedException {

        clkOn3DotsUnderGrade.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(800);
    }



    public void setClkOnEndDate() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(800);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", clkOnEndDate);
      //  clkOnEndDate.click();
        Thread.sleep(900);
    }

    public void setClkon3DotsforGradePoints() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", clkon3DotsforGradePoints);
        //clkon3DotsforGradePoints.click();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }

    public void setClkOnSelectGradePoint() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", clkOnSelect);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
    }

    public void setClkOnExitfromGrade() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", clkOnExitfromGrade);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

    }

    public void setClkOnArrowUnderGrade() throws InterruptedException {
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        clkOnArrowUnderGrade.click();
        Thread.sleep(500);
    }

    public void setEnterbasicSalary1(String salary) throws InterruptedException {
        enterbasicSalary.sendKeys(salary);
        Thread.sleep(500);
        enterbasicSalary.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
    }

    public void setEnterbasicSalary2(String salary) throws InterruptedException {
        Thread.sleep(500);
        driver.switchTo().frame(iframe);
        Thread.sleep(700);
        enterbasicSalary.sendKeys(salary);
        Thread.sleep(500);
        enterbasicSalary.sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(900);

    }





























}
