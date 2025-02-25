package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.baseClass;
import utilities.dataProvider;

public class TC006_hireAROISalariedColleague extends baseClass {

@Test(dataProvider = "dp5", dataProviderClass = dataProvider.class)
    public void hireColleague(String empNo,String surname,String firstname,String gender,String nino,String address1,String address2,String address3,String address4,String county,String postcode,String email,String stuctureUnit,String date,String iban,String post,String empType,String salary) throws InterruptedException {
        try {
            openingPageRL orl = new openingPageRL(driver);
            orl.enterUsername(propertiesObj.getProperty("username"));
            orl.enterPassword(propertiesObj.getProperty("password"));
            orl.clickonLogin();
            baseClass bc = new baseClass();


            clickOnContinuePage cp = new clickOnContinuePage(driver);

            cp.clickOnContinue();

            homepagePage hp = new homepagePage(driver);
            hp.setClkOnShortCuts();
            hp.setClkOnCreateNewEmp();


            EnterEmployeeNumberPage cnp = new EnterEmployeeNumberPage(driver);
            String updatedEmpNo = bc.convertTheString(empNo);
            cnp.setEntrEmpNo(updatedEmpNo);
            cnp.setClkOnAdd();

            enterLegislationPage elp = new enterLegislationPage(driver);
            elp.setClkOn3DotsForLegislation();
            elp.setEnterLegislationType("IRELAND");
            elp.setClkOnExitButtonFromLegislation();

            personalDetailsPage pd = new personalDetailsPage(driver);
            pd.setEnterSurname(surname);
            pd.setClkOnTitleArrow();
            pd.setClkOnDrOption();
            pd.setEntrFirtstName(firstname);

            pd.setEnterGender(gender);
            pd.setEnterDOB(propertiesObj.getProperty("dob"));
            pd.setEnterNINo(nino);

            LeftscrollPage lsp = new LeftscrollPage(driver);
            lsp.setClkOnHomeAddress();


            enterHomeAddressPage ehpp = new enterHomeAddressPage(driver);
            ehpp.setEntrCountry();
            ehpp.setEntrAddressLine1(address1);
            ehpp.setEntrAddressLine2(address2);
            ehpp.setEntrAddressLine3(address3);
            ehpp.setEntrAddressLine4(address4);
            ehpp.setEntrCountyforIE(county);
            ehpp.setEntrPostCode(postcode);

            //emailAddressPageforIE eie = new emailAddressPageforIE(driver);
            //eie.setClkOnBackButton();
            //eie.setClkOnEmailAddress();
            // eie.setEnteremailAddress(email);

            lsp.setClkOnBasicPayDetails();

            enterBasicPayDetailsPage ebpp = new enterBasicPayDetailsPage(driver);
            ebpp.setEntrStructureUnit(stuctureUnit);


            String convertedDate = bc.dateConversion(date);
            payGroupEffectiveDatePage pgd = new payGroupEffectiveDatePage(driver);
            pgd.setEntreffectiveDate(convertedDate);

            lsp.setClkOncurrentFuturePost();

            enterBankDetailsForIE ebie = new enterBankDetailsForIE(driver);
            ebie.setClkon3DotsForBICCode();
            ebie.setClkOn3DotsforCountryId();
            ebie.setEnterNarrCodeforIE("IE");
            ebie.setclkOnSelectButton();
            ebie.setTabThruCountryId();
            ebie.setTabThruBICCode();
            ebie.setGetTabThruBICCode2();
            ebie.setTabThruAccountName();
            ebie.setEnterIBANForIE(iban);


            lsp.setClkOnEmpDetail();

            //validationClicksPage vcp =new validationClicksPage(driver);
            // vcp.setClkOnOK();

            employeeDetailPage edp = new employeeDetailPage(driver);
            edp.setEntrOrgStartDate(convertedDate);
            edp.setEntrCurrentStrtDate(convertedDate);
            edp.setClkonEmplyeeTypeButton();
            edp.setChooseEmpType(empType);

            lsp.setClkOncurrentFuturePost();

            currentFuturePostPage cfpp = new currentFuturePostPage(driver);
            cfpp.setEntrpostStartDate(convertedDate);

            String convertedPost = bc.convertedPost(post);
            cfpp.setEntrPost(convertedPost);

            validationClicksPage vc = new validationClicksPage(driver);
            vc.setClkOnOK();
            vc.setClkOnCrossButton();
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
            ephp.setClkOnArrowUnderGrade();
            ephp.setEnterbasicSalary1(salary);
            vc.setClkOnOK();
            ephp.setEnterbasicSalary2(salary);
            ephp.setClkOnExitfromGrade();
            vc.setClkOnOK();

            lsp.setClkOnSave();

            vc.setClkOnYes();
            vc.setClkOnOK();

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

