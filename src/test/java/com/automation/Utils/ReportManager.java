package com.automation.Utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportManager {

    static Scenario scenario;

    public static void initReporter(Scenario scenario){
        ReportManager.scenario=scenario;
    }

    public static void attachScreenshot(){
        scenario.attach(takeScreenShot(),"image/png","Failed Test Snap");
    }

    public static byte[] takeScreenShot(){
        TakesScreenshot ts =(TakesScreenshot) DriverManager.getDriver();
        byte[] screenShot=ts.getScreenshotAs(OutputType.BYTES);
        return screenShot;

    }

    public static void log(String message){
        scenario.log(message);
    }
}
