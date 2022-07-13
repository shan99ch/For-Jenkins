package SeleniumDemo.SeleniumBasic_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerDemo {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		
		  /*WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();*/
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");



	
	}
}
