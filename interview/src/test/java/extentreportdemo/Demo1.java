package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);
		
		ExtentTest test1=extent.createTest("Test one");
		//test1.pass("Test one passed");
		
		test1.log(Status.PASS,"Test one is passed");
		test1.log(Status.INFO,"Chrome is launched");
		test1.log(Status.WARNING,"Page Load time is high");
		
		ExtentTest test2=extent.createTest("Test two");
		//test2.fail("Test two is fail");
		test2.log(Status.FAIL,"Test two is failed");
		
		ExtentTest test3=extent.createTest("Test three");
		//test3.skip("Test three is skip");
		test3.log(Status.SKIP,"Test three is skipped");
		extent.flush();
		
		Desktop.getDesktop().browse(file.toURI()); //Automatically report open

	}

}
