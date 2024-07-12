package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo7AddDescription {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);
		
		ExtentTest test = extent.createTest("Test One","This is Discription");//Description added
		test.log(Status.INFO,"<b>This is first step<b>");
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());

	}

}
