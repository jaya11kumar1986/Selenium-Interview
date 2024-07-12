package actionsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoelementDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement blog = driver.findElement(By.id("blogsmenu"));
		
		Actions act=new Actions(driver);
		act.moveToElement(blog).perform();
		
		WebElement link = driver.findElement(By.linkText("SeleniumByArun"));
		//act.moveToElement(link).click().build().perform();
		link.click();
		

	}

}
