package SeleniumDemo.SeleniumBasic_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_ExcelSheet {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\New folder\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		File f = new File("C:\\home\\AST\\data.xlsx"); 
		FileInputStream fis = new FileInputStream(f);  
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);  
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		HashSet<String> login = new HashSet<String>();
		//HashMap<String,String> login = new HashMap<String,String>();
		
		
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println(rowcount);
		for(int i=1;i<rowcount;i++)
		{
			Row row = sheet.getRow(i);  
			for(int j=3;j<row.getLastCellNum();j++) 
			{
				login.add(row.getCell(j).getStringCellValue()); 
				
			}
			System.out.println();
		}
		
		
		Iterator<String> itr = login.iterator();
		String password = itr.next();
		String userID = itr.next();
		System.out.println("ID : "+userID);
		System.out.println("Password :"+password);
		
		driver.findElement(By.id("txtUsername")).sendKeys(userID);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		

	}

	
}
