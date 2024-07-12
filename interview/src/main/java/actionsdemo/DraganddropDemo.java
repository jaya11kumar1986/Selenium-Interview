package actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraganddropDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement From = driver.findElement(By.linkText("BANK"));
		
		WebElement to = driver.findElement(By.id("bank"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(From, to).perform();

	}

}
