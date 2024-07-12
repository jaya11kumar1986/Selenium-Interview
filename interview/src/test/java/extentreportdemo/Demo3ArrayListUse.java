package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo3ArrayListUse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);

		ArrayList<String> aList=new ArrayList<String>();
		aList.add("SunDay");
		aList.add("MonDay");
		aList.add("TueDay");
		aList.add("WedDay");
		aList.add("ThuDay");
		aList.add("FriDay");
		aList.add("SatDay");

		ExtentTest test = extent.createTest("Test one");
		test.log(Status.INFO, MarkupHelper.createOrderedList(aList));//number icon
		//UnorderList
		ArrayList<String> aList2=new ArrayList<String>();
		aList2.add("SunDay");
		aList2.add("MonDay");
		aList2.add("TueDay");
		aList2.add("WedDay");
		aList2.add("ThuDay");
		aList2.add("FriDay");
		aList2.add("SatDay");

		ExtentTest test2 = extent.createTest("Test one");
		test2.log(Status.INFO, MarkupHelper.createUnorderedList(aList2));//bullet icon

		extent.flush();
		Desktop.getDesktop().browse(file.toURI());//Report open automatically
		
		//Note :We can HashSet instead of ArrayList -Result different only in Unorder list

	}

}
