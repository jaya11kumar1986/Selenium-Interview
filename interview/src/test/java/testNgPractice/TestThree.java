package testNgPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestThree {
	
	@Test
	public void doSteps() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String color = driver.findElement(By.xpath("//*[text()=' Login ']")).getCssValue("background-color");
		
		System.out.println(color);
		
		Color fromString = Color.fromString(color);
		
		System.out.println(fromString.asHex());
	}


}
