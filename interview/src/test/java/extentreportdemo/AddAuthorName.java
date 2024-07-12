package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddAuthorName {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentReports extent=new ExtentReports();

		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setDocumentTitle("Tutorials Ninja Project");
		extentSparkReporter.config().setReportName("Automation Test");
		extentSparkReporter.config().setTimeStampFormat("dd-MM-yyy hh:mm:ss");
		extentSparkReporter.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
		extent.attachReporter(extentSparkReporter);

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/");

		ExtentTest test = extent.createTest("Test one","This is description of Test one");
		test.log(Status.INFO,"Test One execution started and Execution");
		test.log(Status.PASS,"Test one was Successfully Executed");
		test.assignAuthor("Jayakumar");
		test.assignCategory("Smoke Test");
		test.assignDevice("WKS121 Windows10 Chrome");

		ExtentTest test2 = extent.createTest("Test two","This is description of Test two");
		test2.log(Status.INFO, "Test two execution satarted and Execution");
		test2.log(Status.FAIL,"Test two was failed");
		test2.assignAuthor("Jayakumar");
		test2.assignCategory("Sanity Test");
		test2.assignDevice("WKS107 Windows10 Chrome");

		ExtentTest test3 = extent.createTest("Test three","This is description of Test three");
		test3.log(Status.INFO, "Test three execution satarted and Execution");
		test3.log(Status.SKIP,"Test three was skiped");
		test3.assignAuthor("Jayakumar");
		test3.assignCategory("Regression Test");
		test3.assignDevice("WKS107 Windows10 Firefox");

		ExtentTest test4 = extent.createTest("Test four","This is description of Test four");
		test4.log(Status.INFO, "Test four execution started and Execution");
		test4.log(Status.PASS,"Test four was successfully");
		test4.assignAuthor("SriVidhya","Tamil","ElaVenil");
		test4.assignCategory("Smoke","Regression");
		test4.assignDevice("WKS121 Windows10 Firefox");


		extent.flush();
		driver.quit();
		Desktop.getDesktop().browse(file.toURI());

	}

	public String getScreenShot(String testName) throws IOException  {

		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desFilepath=new File(System.getProperty("user.dir")+"\\ScreenShot\\"+testName+".png");
		FileUtils.copyFile(screenshotAs, desFilepath);

		return desFilepath.getAbsolutePath();
	}

}
