package interviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://letcode.in/frame");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		WebElement li = driver.findElement(By.id("firstFr"));
		
		driver.switchTo().frame(li);
		
		driver.findElement(By.name("fname")).sendKeys("Tamil");
		
	
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("email")).sendKeys("Chuma");
		

	}

}
