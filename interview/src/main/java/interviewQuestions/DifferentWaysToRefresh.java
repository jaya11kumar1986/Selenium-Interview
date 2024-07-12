package interviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWaysToRefresh {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("tamil");
		
		driver.navigate().refresh();
		
		driver.get(driver.getCurrentUrl());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("location.reload(true)");
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.F5);

	}

}
