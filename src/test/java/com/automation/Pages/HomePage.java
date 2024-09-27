package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement inHomePage;

    @FindBy(css=".ico-register")
    WebElement regBtn;

    @FindBy(id="gender-female")
    WebElement gender;

    @FindBy(id="FirstName")
    WebElement firstName;

    @FindBy(id="LastName")
    WebElement lastName;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
    WebElement day;

    @FindBy(xpath="//select[@name='DateOfBirthMonth']")
    WebElement month;

    @FindBy(xpath="//select[@name='DateOfBirthYear']")
    WebElement year;

    @FindBy(xpath = "//div[@class='inputs']/input[@type='email']")
    WebElement email;

    @FindBy(id="Company")
    WebElement company;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(id="ConfirmPassword")
    WebElement cnfPassword;


    @FindBy(id="register-button")
    WebElement submitReg;

    @FindBy(xpath = "//div[@class='result']")
    WebElement regMsg;





    public boolean isInHomePage() throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File(System.getProperty("user.dir")+"//src/test/resources/Screenshot/img1.png"));

        return inHomePage.isDisplayed();

    }

    public void openWebsite(){
        driver.get("https://demo.nopcommerce.com/");

    }
    public void userRegister(){
        regBtn.click();
        gender.click();
        firstName.sendKeys(ConfigReader.getConfigProperty("FirstName"));
        lastName.sendKeys(ConfigReader.getConfigProperty("LastName"));

        Select dropdown=new Select(day);
        dropdown.selectByVisibleText("22");


        Select monthDropdown=new Select(month);
        monthDropdown.selectByVisibleText("May");

        Select yearDropDown=new Select(year);
        yearDropDown.selectByVisibleText("2001");

        email.sendKeys(ConfigReader.getConfigProperty("email"));
        company.sendKeys(ConfigReader.getConfigProperty("company"));
        password.sendKeys(ConfigReader.getConfigProperty("password"));
        cnfPassword.sendKeys(ConfigReader.getConfigProperty("password"));
        submitReg.click();

    }
    public boolean isRegistrationSuccessful(){
        return regMsg.isDisplayed();
    }


}
