package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.baseClass;
import utilities.dataProvider;

public class TC009_Modification extends baseClass {


@Test(dataProvider="dp6",dataProviderClass= dataProvider.class)
    public void modificationMethod(String empNo) {
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

            personalDetailsPage pd = new personalDetailsPage(driver);
            String updatedSurname = bc.randomStringGenerator();
            pd.clearAndEnterSurname(updatedSurname);

            LeftscrollPage lsp = new LeftscrollPage(driver);
            lsp.setClkOnSave();
            validationClicksPage vcp = new validationClicksPage(driver);
            vcp.setClkOnYes();

            if (eenp.entrEmpNoVisibility() == true) {

                eenp.closeCreateNewEmpPage();
                eenp.setClkOnLogOutBtn();

            }
        }
    catch(Exception e){
            System.out.println(e.getMessage());
            Assert.fail();
    }

    }
}
