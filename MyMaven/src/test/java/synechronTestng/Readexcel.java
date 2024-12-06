package synechronTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Readexcel {

	
	WebDriver drvier;
	
	XSSFWorkbook workbook;
	
	XSSFSheet sheet;
	XSSFCell cell;
	
	public void login() throws IOException, InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/v1/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	File src= new File("C://Users//Kiosk_user//eclipse-workspace-Kranthi//MyMaven//Kranthi.xlsx");
			
			//load the file
			
		FileInputStream fis= new FileInputStream(src);
	
	//load work book
	
	workbook =new XSSFWorkbook(fis);
	
	sheet =workbook.getSheetAt(0);
	
	for(int i=1; i<=sheet.getLastRowNum(); i++) {
		
	
		cell= sheet.getRow(i).getCell(0);
	
	WebElement Username = driver.findElement(By.xpath("(//input[@id='user-name'])[1]"));
	
	 Username.sendKeys(cell.getStringCellValue());
	 
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	
	password .sendKeys(cell.getStringCellValue());
	
	WebElement login= driver.findElement(By.xpath(" //input[@id='login-button']"));
	
	login.click();
	
	//write excel
	
	 
	FileOutputStream fos=new  FileOutputStream(src);
	
	String title =driver.getTitle();
	
	//create the cell where the data need added
	
	sheet.getRow(i).createCell(2).setCellValue(title);
	
	workbook.write(fos);
	fos.close();
	
	}
	}
	
}
			
			
	
	
