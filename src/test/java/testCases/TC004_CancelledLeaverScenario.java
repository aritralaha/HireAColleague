package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.baseClass;
import utilities.dataProvider;

public class TC004_CancelledLeaverScenario extends baseClass{

    @Test(dataProvider = "dp4",dataProviderClass = dataProvider.class)
    public void cancelALeaver(String empNo) throws InterruptedException {
        try {
            openingPageRL orl = new openingPageRL(driver);
            orl.enterUsername(propertiesObj.getProperty("username"));
            orl.enterPassword(propertiesObj.getProperty("password"));
            orl.clickonLogin();


            clickOnContinuePage cp = new clickOnContinuePage(driver);
            cp.clickOnContinue();

            homepagePage hp = new homepagePage(driver);
            hp.setEntrFastpath("HREMPALL");
            hp.setClkOnDesiredFastpath();

            EnterEmployeeNumberPage eenp = new EnterEmployeeNumberPage(driver);
            baseClass bc = new baseClass();
            String convertedEmpNo = bc.convertTheString(empNo);
            eenp.setEntrEmpNo(convertedEmpNo);

            validationClicksPage vc = new validationClicksPage(driver);
            vc.setClickOnOKforLeaverScenario();

            LeftscrollPage lsp = new LeftscrollPage(driver);
            lsp.setClkOnBasicPayDetails();
            lsp.setClkOnEmpDetail();

            employeeDetailPage edp = new employeeDetailPage(driver);
            edp.setClearTerminationDate();
            edp.setClearLeavingReason();

            lsp.setClkOnSave();
            vc.setClkOnYes();

            EnterEmployeeNumberPage cnp = new EnterEmployeeNumberPage(driver);
            if (cnp.entrEmpNoVisibility() == true) {

                cnp.closeCreateNewEmpPage();
                cnp.setClkOnLogOutBtn();

            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            Assert.fail();
        }



    }
}
