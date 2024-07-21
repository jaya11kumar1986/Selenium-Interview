package framesample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class omayoFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		
		driver.switchTo().frame("iframe2");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scroll(0,0)");
		
		driver.findElement(By.name("q")).sendKeys("Test");

	}

}
