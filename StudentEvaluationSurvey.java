package SeleniumDemo.SeleniumBasic_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentEvaluationSurvey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples/student_eval.php");
		driver.findElement(By.name("q[1]")).sendKeys("AshNik");
		driver.findElement(By.name("q[2]")).sendKeys("Preetham");
		driver.findElement(By.name("q[3]")).sendKeys("MBBS");
		driver.findElement(By.name("q[4]")).sendKeys("3rd Year");
		// Radio Button// Multiple blogs having same options " above Average, Average & Below Average" thats y taking name & value for XPath 
		driver.findElement(By.xpath("//input[@name=\"q[5]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[6]\"][@value=\"Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[7]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[8]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[9]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[10]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[11]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q[12]\"][@value=\"Above Average\"]")).click();
		driver.findElement(By.id("visver_code")).sendKeys("788D98");
		driver.findElement(By.name("submit")).submit();
		//driver.findElement(By.name("reset")).click();
		
//driver.close();
	}

}

/* Active Participation in Class: *
Above Average     //input[@name=\"q[5]\"][@value=\"Above Average\"]
Average           //input[@name=\"q[5]\"][@value=\"Average\"]
Below Average    //input[@name=\"q[5]\"][@value=\"Below Average\"]

Completion of Assigned Tasks: *
Above Average   //input[@name=\"q[6]\"][@value=\"Above Average\"]
Average         //input[@name=\"q[6]\"][@value=\"Average\"]
Below Average   //input[@name=\"q[6]\"][@value=\"Below Average\"]

Self-Motivation: *
Above Average   //input[@name=\"q[7]\"][@value=\"Above Average\"]
Average         //input[@name=\"q[7]\"][@value=\"Average\"]
Below Average   //input[@name=\"q[7]\"][@value=\"Below Average\"]

Cooperation / Teamwork: *
Above Average  //input[@name=\"q[8]\"][@value=\"Above Average\"]..so on
Average
Below Average

Desire to Learn: *
Above Average   //input[@name=\"q[9]\"][@value=\"Above Average\"].. so on
Average
Below Average

Preparedness: *
Above Average   //input[@name=\"q[10]\"][@value=\"Above Average\"]..so on
Average
Below Average

Effective Use of Time: *
Above Average     //input[@name=\"q[11]\"][@value=\"Above Average\"]..so on
Average
Below Average

Grasp of Knowledge: *
Above Average     //input[@name=\"q[12]\"][@value=\"Above Average\"]..so on
Average
Below Average */

