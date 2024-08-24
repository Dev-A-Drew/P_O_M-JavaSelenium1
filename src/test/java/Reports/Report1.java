package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Report1 {
    public static void main(String[] args) throws IOException {
        // Some kind like engine, which is the instantiation of the ExtendReports Class
        ExtentReports extentReportA = new ExtentReports();


        //OPTION 1 TO GENERATE REPORT: Path to generate the html report by String path
        /*
        ExtentSparkReporter sparkReporterB = new ExtentSparkReporter
                                             ("E:\\Java IntelliJ\\P_O_M-JavaSelenium1\\src\\ReportNameOfTestOrSuit.html");
        extentReportA.attachReporter(sparkReporterB);
        extentReportA.flush(); //Method to generate the html report
        Desktop.getDesktop().browse(new File("E:\\Java IntelliJ\\P_O_M-JavaSelenium1\\src\\ReportNameOfTestOrSuit.html").toURI());
        */


        //OPTION 2 TO GENERATE REPORT: Using File instance

        File fileC = new File("E:\\Java IntelliJ\\P_O_M-JavaSelenium1\\src\\ReportNameOfTestOrSuit.html");
        ExtentSparkReporter sparkReporterB = new ExtentSparkReporter(fileC);
        extentReportA.attachReporter(sparkReporterB);

        ExtentTest testD1 = extentReportA.createTest("TestCase - 1");
        testD1.pass("This Test1 is passed");

        ExtentTest testD2 = extentReportA.createTest("TestCase - 2");
        testD2.log(Status.FAIL, "This is a failed test, as the developer why");

        extentReportA.createTest("Test 3").skip("This is a manipulated skipped test");


        extentReportA.flush();
        Desktop.getDesktop().browse(new File("E:\\Java IntelliJ\\P_O_M-JavaSelenium1\\src\\ReportNameOfTestOrSuit.html").toURI());


        



    }
}
