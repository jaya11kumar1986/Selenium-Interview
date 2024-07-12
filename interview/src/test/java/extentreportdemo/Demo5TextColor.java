package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo5TextColor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);
		
		ExtentTest test = extent.createTest("Test One");
		test.log(Status.INFO, "Test oNe Started");
		
	
		test.log(Status.INFO, MarkupHelper.createLabel("Test Color",ExtentColor.GREEN));//Create backround color of text
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());

	}

}
