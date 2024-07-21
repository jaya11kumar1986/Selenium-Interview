package framesample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Letcodeframe {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement framename = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		
		driver.switchTo().frame(framename);
		
		driver.findElement(By.name("email")).sendKeys("Sample");
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.name("fname")).sendKeys("test");
		
		driver.findElement(By.linkText("Work-Space")).click();

	}

}
