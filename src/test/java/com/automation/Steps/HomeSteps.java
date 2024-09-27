package com.automation.Steps;

import com.automation.Pages.HomePage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        homePage.openWebsite();
    }

    @Then("verify user is on website")
    public void verify_user_is_on_website() throws IOException {
        ReportManager.attachScreenshot();
        ReportManager.log("Got a screenshot");
        homePage.isInHomePage();
    }




}
