package SeleniumDemo.SeleniumBasic_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyContactForm_Valid_Locators {

	public static void main(String[] args) {
		// Launch the Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximizing the browser window
		driver.manage().window().maximize();
		
// System under TEST::
		//Navigation to URL
driver.get("https://www.mycontactform.com/samples.php");

//Check Box :: we can select/click more than 1 checkboxes.// SEND TO
driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();

// Text Box //SUBJECT
driver.findElement(By.id("subject")).sendKeys("my contacts");

// Text Box // EMAIL ID
driver.findElement(By.id("email")).sendKeys("shanthi@gmail.com");

// Drop Down :: 1. list drop down  2. select 1 option
WebElement dd = driver.findElement(By.id("q3")); // import webElement//1. List DropDown
Select s = new Select(dd);                      //import select // 2. Choose only 1 option
s.selectByVisibleText("Third Option");         // always use ByVisibleText
//s.selectByIndex(1);
//s.selectByValue("Third Option");

    //Radio Button :: RadioButton coding done by creating as a single group so all Elements are Unique. Need to create own Path
    // Customized XPath SYNTAX: TagName[@property=value]----> to activate its path press CTRL+f-->type customized Xpath in that box
driver.findElement(By.xpath("//input[@value =\"Second Option\"]")).click();
// Check Box:: // SINGLE ANSWER
driver.findElement(By.id("q5")).click();
//Check Box:: // MULTIPLE ANSWER
driver.findElement(By.xpath("//input[@value=\"First Check Box\"]")).click();
driver.findElement(By.xpath("//input[@value=\"Second Check Box\"]")).click();
driver.findElement(By.xpath("//input[@value=\"Third Check Box\"]")).click();
driver.findElement(By.xpath("//input[@value=\"Fourth Check Box\"]")).click();
driver.findElement(By.xpath("//input[@value=\"Fifth Check Box\"]")).click();

// Text Box with Calender :: DATE SELECTOR
driver.findElement(By.id("q7")).click();

// DROP DOWN :: 1.list DropDown  2. Choose only 1 Option.  // US STATES
WebElement dd1=driver.findElement(By.id("q8"));
Select s1 = new Select(dd1);
s1.selectByVisibleText("PA");
//s1.selectByIndex(0);
//s1.selectByValue("IL");

//DROP DOWN :: 1. list DropDown   2. Choose only 1 option  // COUNTRIES
WebElement country=driver.findElement(By.id("q9"));
Select s2 = new Select(country);
//s2.selectByVisibleText("India");
s2.selectByValue("United States of America");
//s2.selectByIndex(4)	;

// DROP DOWN :: Canadian Provencies
WebElement canada = driver.findElement(By.id("q10"));
Select s3 = new Select(canada);
s3.selectByIndex(2);
//s3.selectByVisibleText("Ontario");
//s3.selectByValue("British Columbia");

//DROP DOWN :: TEXT BOXES 2 // NAME
WebElement name = driver.findElement(By.xpath("//select[@name=\"q11_title\"]"));
Select s4 = new Select(name);
s4.selectByVisibleText("Mrs.");
driver.findElement(By.xpath("//input[@name=\"q11_first\"]")).sendKeys("Shanthi"); // first name
driver.findElement(By.xpath("//input[@name=\"q11_last\"]")).sendKeys("Cheerla");  // Last name
	
//DROP DOWN :: 3 // DATE OF BIRTH
WebElement month = driver.findElement(By.xpath("//select[@name=\"q12_month\"]"));
Select s5 = new Select(month);
s5.selectByVisibleText("6");
WebElement day = driver.findElement(By.xpath("//select[@name=\"q12_day\"]"));
Select s6 = new Select(day);
s6.selectByVisibleText("24");
WebElement year= driver.findElement(By.xpath("//select[@name=\"q12_year\"]"));
Select s7 = new Select(year);
s7.selectByVisibleText("1994");
	
	}


}
