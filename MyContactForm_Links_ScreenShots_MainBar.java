

// Ensure whether all Hyperlinks are opening properly on clicking them..if not should show the error in 'ScreenShot'folder.

package SeleniumDemo.SeleniumBasic_Maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyContactForm_Links_ScreenShots_MainBar {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		int size=driver.findElements(By.xpath("//*[@id=\"header\"]/ul/li/a")).size();
		System.out.println(size);
		for(int i=1;i<=size;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"header\"]/ul/li["+i+"]/a")).click();
			TakesScreenshot img = (TakesScreenshot)driver; // to take Screen shots of Hyper_links in webpage while execution 
			File source = img.getScreenshotAs(OutputType.FILE);  // Storing all ScreenShots in 'source' for output 
			//FileUtils.copyFile(source,new File("C:\\Users\\admin\\Desktop\\ScreenShot\\screen.jpg")); each time pic will restore by next pic..finally we can find last pic only in the folder 
			FileUtils.copyFile(source,new File("C:\\Users\\admin\\Desktop\\ScreenShot\\screen"+System.currentTimeMillis()+"jpg")); //copying all screen shots in local folder // all pics (6) will be stored in folder
			//checking hyper_links in HOME page
			//driver.close();
			
		}
	}
}
//XPath::
//*[@id="left_col_top"]/ul/li[1]/a
//*[@id="left_col_top"]/ul/li[2]/a
//*[@id="left_col_top"]/ul/li[3]/a
//*[@id="left_col_top"]/ul/li[4]/a
//*[@id="left_col_top"]/ul/li[5]/a
//*[@id="left_col_top"]/ul/li[6]/a






