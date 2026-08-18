package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            String reportPath = System.getProperty("user.dir")
                    + "/reports/ExtentReport.html";

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(reportPath);

            spark.config().setReportName("Regression Automation Report");
            spark.config().setDocumentTitle("IQIGAI Automation");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Md Irfan");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Browser", "Chrome");
        }

        return extent;
    }
}