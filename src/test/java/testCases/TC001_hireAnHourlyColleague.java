package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.baseClass;
import utilities.dataProvider;

public class TC001_hireAnHourlyColleague extends baseClass {

    @Test(dataProvider = "dp1",dataProviderClass= dataProvider.class)
    public void hireColleague(String empNo,String surname,String firstname,String gender,String nino,String address1,String address2,String address3,String address4,String county,String postcode,String stuctureUnit,String date,String sortCode,String accno,String post,String empType,String salary) throws InterruptedException {
        try {
            openingPageRL orl = new openingPageRL(driver);
            orl.enterUsername(propertiesObj.getProperty("username"));
            orl.enterPassword(propertiesObj.getProperty("password"));
            orl.clickonLogin();


            clickOnContinuePage cp = new clickOnContinuePage(driver);

            cp.clickOnContinue();

            homepagePage hp = new homepagePage(driver);
            hp.setClkOnShortCuts();
            hp.setClkOnCreateNewEmp();


            EnterEmployeeNumberPage cnp = new EnterEmployeeNumberPage(driver);

            baseClass bc = new baseClass();
            String updatedEmpNo = bc.convertTheString(empNo);
            cnp.setEntrEmpNo(updatedEmpNo);
            bc.captureScreen(updatedEmpNo);
            cnp.setClkOnAdd();

            enterLegislationPage elp = new enterLegislationPage(driver);
            elp.setClkOnExit();

            personalDetailsPage pd = new personalDetailsPage(driver);
            pd.setEnterSurname(surname);
            pd.setClkOnTitleArrow();
            pd.setClkOnDrOption();
            pd.setEntrFirtstName(firstname);

            pd.setEnterGender(gender);
            pd.setEnterDOB(propertiesObj.getProperty("dob"));
            pd.setEnterNINo(nino);
            bc.captureScreen(updatedEmpNo);



            LeftscrollPage lsp = new LeftscrollPage(driver);
            lsp.setClkOnHomeAddress();


            enterHomeAddressPage ehpp = new enterHomeAddressPage(driver);
            ehpp.setEntrCountry();
            ehpp.setEntrAddressLine1(address1);
            ehpp.setEntrAddressLine2(address2);
            ehpp.setEntrAddressLine3(address3);
            ehpp.setEntrAddressLine4(address4);
            ehpp.setEntrCounty(county);
            ehpp.setEntrPostCode(postcode);
            bc.captureScreen(updatedEmpNo);

            lsp.setClkOnBasicPayDetails();

            enterBasicPayDetailsPage ebpp = new enterBasicPayDetailsPage(driver);
            ebpp.setEntrStructureUnit(stuctureUnit);

            String convertedDate = bc.dateConversion(date);
            payGroupEffectiveDatePage pgd = new payGroupEffectiveDatePage(driver);
            pgd.setEntreffectiveDate(convertedDate);

            lsp.setClkOncurrentFuturePost();

            enterBankDetailsPage ebdp = new enterBankDetailsPage(driver);
            ebdp.setEnterSortCode(sortCode);
            String convertedAccountNumber = bc.convertTheString(accno);
            ebdp.setEntrAccNo(convertedAccountNumber);
            ebdp.setClkOnDownArrow();
            ebdp.setClkOnZero();

            lsp.setClkOnEmpDetail();

            //validationClicksPage vcp =new validationClicksPage(driver);
            // vcp.setClkOnOK();

            employeeDetailPage edp = new employeeDetailPage(driver);
            edp.setEntrOrgStartDate(convertedDate);
            edp.setEntrCurrentStrtDate(convertedDate);
            edp.setClkonEmplyeeTypeButton();
            edp.setChooseEmpType(empType);
            bc.captureScreen(updatedEmpNo);

            lsp.setClkOncurrentFuturePost();

            currentFuturePostPage cfpp = new currentFuturePostPage(driver);
            cfpp.setEntrpostStartDate(convertedDate);
            bc.captureScreen(updatedEmpNo);
            String convertedPost = bc.convertedPost(post);
            cfpp.setEntrPost(convertedPost);


            validationClicksPage vc = new validationClicksPage(driver);
            vc.setClkOnOK();
            vc.setClkOnCrossButton();
            employeePostHoldingPage ephp = new employeePostHoldingPage(driver);
            ephp.setClkOnConditns();
            ephp.setClkOnPositionStatus();
            ephp.setClkOnAddButton();
            ephp.setClkOnStartDate();
            ephp.setClkOnPositionStatusDropdwn();
            ephp.setClkOnPositionStatus1();
            ephp.setClkOnExit();
            ephp.setclkOnGrade();
            ephp.setClkOn3DotsUnderGrade1();
            ephp.setClkOnEndDate();
            ephp.setClkon3DotsforGradePoints();
            ephp.setClkOnSelectGradePoint();
            ephp.setClkOnExitfromGrade();

            lsp.setClkOnSave();

            vc.setClkOnYes();

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

