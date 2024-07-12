package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo4HashMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);
		
		HashMap<String,Object> hmap1= new HashMap<String, Object>();
		hmap1.put("First Name", "Jai");
		hmap1.put("Last Name", "kumar");
		hmap1.put("Age", "36");
		hmap1.put("Experiance", "8");
		
		ExtentTest test = extent.createTest("Test One");
		test.log(Status.INFO, MarkupHelper.createOrderedList(hmap1));
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());

	}

}
