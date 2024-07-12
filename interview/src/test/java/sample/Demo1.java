package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("--Headless");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(opt);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		

	}

}
