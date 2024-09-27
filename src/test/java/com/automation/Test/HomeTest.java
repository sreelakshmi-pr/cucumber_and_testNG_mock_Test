package com.automation.Test;

import com.automation.Pages.BasePage;
import com.automation.Utils.AllureReportManager;
import com.automation.Utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomeTest extends BaseTest{

    @Test
    public void userLogin() throws IOException {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isInHomePage());
    }

    @Test
    public void userRegistration(){
        homePage.openWebsite();
        homePage.userRegister();
//        ExtentReportManager.attachScreenShot();
        AllureReportManager.attachLog("failed");
        AllureReportManager.attachScreenShot();
        Assert.assertTrue(homePage.isRegistrationSuccessful());
//        ExtentReportManager.getTest().fail()
    }




}
