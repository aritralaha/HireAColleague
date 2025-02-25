package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.baseClass;
import utilities.dataProvider;

public class TC003_leaverScenario extends baseClass {


@Test(dataProvider="dp3",dataProviderClass= dataProvider.class)
    public void leaverScenario(String empNo,String leavingDate, String leavingReason) throws InterruptedException {
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

            LeftscrollPage lsp = new LeftscrollPage(driver);
            lsp.setClkOnBasicPayDetails();
            lsp.switchToDefaultContent();
            lsp.setClkOnEmpDetail();

            employeeDetailPage edp = new employeeDetailPage(driver);
            String convertedDate = bc.dateConversion(leavingDate);
            edp.setEntrTerminationDate(convertedDate);

            validationClicksPage vcp = new validationClicksPage(driver);
            vcp.setClkOnCrossButton();


            edp.setEntrReasonForTermination(leavingReason);

            lsp.setClkOnSave();
            vcp.setClkOnYes();
            lsp.setClkOnFooterContinue();

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
