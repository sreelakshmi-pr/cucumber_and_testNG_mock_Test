package com.automation.Utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class AllureReportManager {


    public static  void attachScreenShot() {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("screenshot",new ByteArrayInputStream(screenShot));
    }


    public static void  attachLog(String message) {
        Allure.addAttachment("Log",message);
    }
}
