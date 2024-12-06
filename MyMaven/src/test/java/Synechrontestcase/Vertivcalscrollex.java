package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertivcalscrollex {

	
		public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//vectrol 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2000", "");
		
		
		//scroll up
		
		js.executeScript("window.scrollBy(0,-1000", "");
		
		//horization
		
//		js.executeScript("window.scrollBy(900,0", "");
//		
//		//horization left
//		
//		js.executeScript("window.scrollBy(-700,0", "");
		

		}
				
	
}
