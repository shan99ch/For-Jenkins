
//when path is correct but its throwing "no such element" exception then need to use switchToFrame concept


package SeleniumDemo.SeleniumBasic_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Selectable")).click();
		WebElement frame=driver.findElement(By.className("demo-frame")); // asking driver find frame locator// in xml source code find a tagname with either 'iframe' or 'frame' , use that code for locator.
		driver.switchTo().frame(frame);     //asking driver handle that frame to work. TargetTo.frame 
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click(); //1st opinion // though no problem in 'locator' its throwing 'no element found' exception thats y need to take 2nd opinion with 'locator' of 'iframe' or 'frame'
	//driver.close();
	}

}
//<iframe src="/resources/demos/selectable/default.html" class="demo-frame"></iframe>

