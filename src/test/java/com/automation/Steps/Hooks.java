package com.automation.Steps;

import com.automation.Utils.ConfigReader;
import com.automation.Utils.DriverManager;
import com.automation.Utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {

        ReportManager.initReporter(scenario);
        DriverManager.createDriver();
        ConfigReader.initConfig();
    }
    @After
    public void cleanUp(Scenario scenario) {
        if(scenario.isFailed()){
            ReportManager.attachScreenshot();

        }

    }


}
