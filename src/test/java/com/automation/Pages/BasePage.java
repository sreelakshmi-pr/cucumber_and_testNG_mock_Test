package com.automation.Pages;

import com.automation.Test.BaseTest;
import com.automation.Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(){

        driver = DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }


}
