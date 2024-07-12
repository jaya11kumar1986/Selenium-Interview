package interviewexcelpractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData {
WebDriver driver;
	@DataProvider(name="Login")
	public Object[][] supplyData() throws IOException {
		
		Object [][] data1=ReadExcel.getData();
		
		return data1;
	}
	@Test(dataProvider = "Login")
	public void setTest(String id,String password) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	
	
	
	
}
