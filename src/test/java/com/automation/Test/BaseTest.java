package com.automation.Test;

import com.automation.Pages.AddToCartPage;
import com.automation.Pages.HomePage;
import com.automation.Pages.LoginPage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    HomePage homePage;
    AddToCartPage addToCartPage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        DriverManager.createDriver();
        ConfigReader.initConfig();
        homePage=new HomePage();
        addToCartPage=new AddToCartPage();
        loginPage = new LoginPage();
    }
}
