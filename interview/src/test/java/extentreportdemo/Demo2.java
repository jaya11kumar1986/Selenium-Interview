package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);

		ExtentTest test1=extent.createTest("Test one");
		
		test1.log(Status.INFO,"<b>Test one Started<b>");//Test one started is displayed Bold letter
		test1.log(Status.PASS,"<i>Test one Passed<i>");//displayed italic
		test1.log(Status.WARNING,"<u>Button should align properly<u>");//displayed with underline
		test1.log(Status.SKIP,"<h1>Table is skipped<h1>");//displayed with heading
		test1.log(Status.FAIL,"<q>Testone is failed<q>");







		extent.flush();

		Desktop.getDesktop().browse(file.toURI()); //Automatically report open

	}

}
