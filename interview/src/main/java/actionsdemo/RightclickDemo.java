package actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightclickDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement link = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		driver.switchTo().alert().accept();

	}

}
