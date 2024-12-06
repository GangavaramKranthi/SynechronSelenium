package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement fileupload=driver.findElement(By.id("file-upload"));
		
		fileupload.sendKeys("D://Kranthi.txt");
		
		WebElement Submit=driver.findElement(By.id("file-submit"));
		
		Submit.click();
		Thread.sleep(2000);
		
		WebElement fileupload1=driver.findElement(By.id("uploaded-files"));
		
		if(fileupload1.isDisplayed()) {
			System.out.println("is uploaded");
		}
		
		else {
			System.out.println("not uploaded");
		}
		
		driver.quit();
		
	}

}
