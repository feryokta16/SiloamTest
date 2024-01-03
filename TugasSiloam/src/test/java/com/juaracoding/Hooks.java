package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.utils.Constans;
import com.juaracoding.utils.TestCases;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class Hooks {
     static WebDriver driver;

     static ExtentTest extentTest ;

     static  ExtentReports reports = new ExtentReports("target/extent-report.html");



    @Before
    public  static void setup() {
        DriverSingleton.getInstance(Constans.CHROME);
        driver = DriverSingleton.getDriver();
        TestCases[] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screenshotpath = Utils.getScreenshot(driver,scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"+
                    extentTest.addScreenCapture(screenshotpath));
        }
    }
    @After
    public void endTestcase(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.classObjectInstance();
    }

}
