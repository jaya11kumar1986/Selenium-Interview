package extentreportdemo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotOne {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReporter\\report.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(extentSparkReporter);

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/");

		String desPath = takesScreenShot("Tutorial Ninja HomePage");

		ExtentTest test = extent.createTest("Test one");
		test.log(Status.INFO, "Tutorials Ninja Home Page");
		test.addScreenCaptureFromPath(desPath,"Tutorials Ninja Home Page");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		String desPath2 = takesScreenShot("Tutorials Ninja Search Field");
		//test.addScreenCaptureFromPath(desPath2,"Tutorials Ninja Search Field");
		test.log(Status.INFO, MediaEntityBuilder.createScreenCaptureFromPath((desPath2),"Tutorials Ninja Search Field").build());
		//test.log(Status.INFO, "Test one is Completed");
		
		//test.log(Status.INFO,MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenShotBase(),"Tutorials Ninja Search Field" ).build());
		extent.flush();
		driver.quit();
		Desktop.getDesktop().browse(file.toURI());

	}

	public static String takesScreenShot(String fileName) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String desPath=System.getProperty("user.dir")+"//ScreenShot//"+fileName+".png";
		FileUtils.copyFile(src, new File(desPath));
		
		return desPath;
	}

	public static String takeScreenShotBase() {
		String screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return screenshotAs;
		
		
	}
}
