package com.automation.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ExtentReportManager {

    private static ExtentReports extentReports;
    public static ExtentTest test;

    public static void initExtendReporter(){
        String path = System.getProperty("user.dir") + "\\extentReports\\extentReport.html";
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path);
        sparkReporter.config().setTheme(Theme.DARK);
        extentReports.attachReporter(sparkReporter);
    }

    public static void flush(){
        extentReports.flush();
    }
    public static void createTest(String name){
        test=extentReports.createTest(name);
    }
    public static ExtentTest getTest(){
        return test;
    }

    public static void attachScreenShot(){

        try {
            test.addScreenCaptureFromPath(takeScrennshot());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String takeScrennshot() throws IOException {
        TakesScreenshot ts= (TakesScreenshot) DriverManager.getDriver();
        File file = ts.getScreenshotAs(OutputType.FILE);
        String fileName ="src/test/resources"+"/screenshot.png";
        FileUtils.copyFile(file,new File(fileName));
        return System.getProperty("user.dir")+"/"+fileName;
    }
}

