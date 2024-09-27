package com.automation.Test;

import com.automation.Pages.BasePage;
import com.automation.Pages.HomePage;
import com.automation.Utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void userLogin(){
        ExtentReportManager.getTest().pass("Open Website");
        homePage.openWebsite();
        loginPage.doLogin();
        ExtentReportManager.getTest().pass("Login successfull");
        Assert.assertTrue(loginPage.isLogin());


    }
}
