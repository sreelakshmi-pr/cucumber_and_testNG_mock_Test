package com.automation.Listners;

import com.automation.Utils.ExtentReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListener implements ITestListener {


        public void onFinish(ITestContext context) {
            ExtentReportManager.flush();
        }

        public void onStart(ITestContext context) {
           ExtentReportManager.initExtendReporter();
        }

        public void onTestStart(ITestResult result) {
            ExtentReportManager.createTest(result.getMethod().getMethodName());
        }

        public void onTestSuccess(ITestResult result) {
            ExtentReportManager.getTest().pass("test passed");
            // if we need a screenshot of every passwd testcase
            // call attachScreenshot()
        }

        public void onTestFailure(ITestResult result) {
            ExtentReportManager.getTest().fail("test failed\n"+ result.getThrowable().getMessage());
            ExtentReportManager.attachScreenShot();

        }

        public void onTestSkipped(ITestResult result) {
            ExtentReportManager.getTest().skip("test Skipped");

        }

}

