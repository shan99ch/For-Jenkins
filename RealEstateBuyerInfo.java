package SeleniumDemo.SeleniumBasic_Maven;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RealEstateBuyerInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximizing the browser window
		driver.manage().window().maximize();
		
// System under TEST::
		//Navigation to URL
driver.get("https://www.mycontactform.com/samples/real_estate.php");
// CheckBox
driver.findElement(By.xpath("//input[@value=\"0\"]")).click();
driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
driver.findElement(By.xpath("//input[@value=\"3\"]")).click();
driver.findElement(By.xpath("//input[@value=\"4\"]")).click();
// TextBox
driver.findElement(By.name("q[1]")).sendKeys("ShAnjAshNik Ch"); //Name
driver.findElement(By.id("email")).sendKeys("cheer_asaa@gmail.com"); //Email_ID
driver.findElement(By.name("q[2]")).sendKeys("012-3456-789"); // Home Ph#
driver.findElement(By.name("q[3]")).sendKeys("987-6543-210"); //Bussiness Ph#
driver.findElement(By.name("q[4]")).sendKeys("333-4444-333"); // Mobile#
driver.findElement(By.name("q[5]")).sendKeys("5176 108th Ave");	//Address
driver.findElement(By.name("q[6]")).sendKeys("Franklin"); // City
// Drop Down Box
WebElement state = driver.findElement(By.name("q[7]")); // State
Select s = new Select(state);
s.selectByVisibleText("WI");
//Text Box
driver.findElement(By.name("q[8]")).sendKeys("45678"); // Zip Code
driver.findElement(By.name("q[9]")).sendKeys("Charter School"); // School District
// Radio Button
driver.findElement(By.xpath("//input[@value=\"Own\"]")).click();// own/rent
//Drop Down Box
WebElement movtym = driver.findElement(By.name("q[11]")); // Moving time Frame
Select time = new Select(movtym);
time.selectByVisibleText("Within One Month");
//Radio Button
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[17]/td/font/input[4]")).click(); //BedRooms
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[19]/td/font/input[5]")).click();//BathRooms
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[21]/td/font/input[1]")).click();//Parking
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[28]/td/font/input[2]")).click();
WebElement garage =driver.findElement(By.id("q[15]"));
Select parking = new Select(garage);
parking.selectByVisibleText("3 Car or Larger");
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[23]/td[2]/font/textarea")).sendKeys("No");
driver.findElement(By.id("q[17]")).sendKeys("300k"); 
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[26]/td/font/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[28]/td/font/input[2]")).click();
driver.findElement(By.xpath("//*[@id=\"center_col\"]/form/table/tbody/tr/td/table/tbody/tr[29]/td[2]/font/textarea")).sendKeys("No"); 
//WebElement code=driver.findElement(By.id("visver_code"));
//Select c = new Select(code);
//System.out.println(c);
driver.findElement(By.id("visver_code")).sendKeys("35CF86");
driver.findElement(By.name("submit")).click();

	
	}

	}
	


