package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css=".ico-login")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@class='email']")
    WebElement emailInput;

    @FindBy(id="Password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginSubmit;

    @FindBy(css=".ico-account")
    WebElement myAccount;

    public void doLogin(){
        loginBtn.click();
        emailInput.sendKeys(ConfigReader.getConfigProperty("email"));
        passwordInput.sendKeys(ConfigReader.getConfigProperty("password"));
        loginSubmit.click();

    }

    public boolean isLogin(){
        return myAccount.isDisplayed();
    }
}
