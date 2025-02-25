package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.baseClass;
import utilities.dataProvider;

public class TC002_transferHourlyToHourly extends baseClass {

 @Test(dataProvider="dp2",dataProviderClass= dataProvider.class)

    public void transferAColleague(String empNo,String postStartdate2, String post2,String salary) throws InterruptedException {
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
            lsp.setClkOncurrentFuturePost();

            currentFuturePostPage cfpp = new currentFuturePostPage(driver);
            cfpp.setClkOnAddButton();

            String convertedDate = bc.dateConversion(postStartdate2);
            cfpp.setEntrPost2StartDate(convertedDate);
            String convertedPost = bc.convertedPost(post2);
            cfpp.setEntrPost2(convertedPost);

            validationClicksPage vc = new validationClicksPage(driver);
            vc.setClkOnOK();

            cfpp.setClkOnCopyPostTypesDrpDwn();
            cfpp.setCopyPosttype();
            cfpp.setTabThruSelectedCopyPostType();
            cfpp.setClkOnSelectPost();
            vc.setClkOnCrossButton();
            cfpp.setClkOnYesButton();

            employeePostHoldingPage ephp = new employeePostHoldingPage(driver);
            ephp.setClkOnConditns();
            ephp.setClkOnPositionStatus();
            ephp.setClkOnPositionStatusDropdwn();
            ephp.setTabThruEndDate();
            //ephp.setClkOnExistingPositionStatus();
            ephp.setClkOnPositionStatusDropdwn();
            ephp.setClkOnPositionStatus1();
            ephp.setClkOnExit();

            lsp.setClkOnSave();
            vc.setClkOnYes();
            lsp.setClkOnFooterContinue();
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
