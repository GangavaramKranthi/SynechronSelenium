package Synechrontestcase;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filedownload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement download= driver.findElement(By.linkText(("avatar.png")));
		
		download.click();
		
		File f=new File("C://Users//Kiosk_user//Downloads//avatar.png");
		
		if (f.exists()) {
			System.out.println("file is exist");
		}
		else {
			System.out.println("no file is exist");
		}
		
		driver.quit();
		
	
	}

}
