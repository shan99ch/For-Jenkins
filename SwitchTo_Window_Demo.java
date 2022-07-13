
// to print the message which is in 2nd window.
//Beginning 1st window will be opened then 2nd window will be opened then we should get & printed message in 2nd window

package SeleniumDemo.SeleniumBasic_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows"); // Path for 1st Window
		driver.findElement(By.id("windowButton")).click();// Path for 2nd Window
		//driver.findElement(By.id("messageWindowButton")).click();
		Set<String> window_list=driver.getWindowHandles();// using set collections to collect(read) windows. "getWindowHandles" method
		Iterator <String> itr = window_list.iterator();  // using Iterator method for output. // output Methods in collection (for each, Iterator)
		String window1=itr.next();
		String window2=itr.next();
		//String window3=itr.next();
		driver.switchTo().window(window2); // asking driver handle that window to work on it. //SwitchTo().window(window2) represents 'TargetTo.window2'
		//now driver is handling window2...its time to get its msg
		WebElement msg = driver.findElement(By.id("sampleHeading")); // storing msg in "msg"
		System.out.println(msg.getText());  // to printout messsage of window2
		//driver.switchTo().defaultContent(); // defaultcontent represents parent window. targetTo.parentWindow(window1)
	    driver.switchTo().window(window1);
	   // WebElement msg1 = driver.findElement(By.xpath("/html/body"));
	   // System.out.println(msg1.getText());
		//driver.close();
	}

}
