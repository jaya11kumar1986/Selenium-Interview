package interviewQuestions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://letcode.in/windows");
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.id("home")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String s:windowHandles) {
			
			driver.switchTo().window(s);
		}
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.switchTo().window(parent);
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);

	}

}
