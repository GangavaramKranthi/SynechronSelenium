package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement mouse= driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		WebElement top= driver.findElement(By.xpath("//a[normalize-space()='Top']"));
		
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		
		act.doubleClick(mouse).perform();
		Thread.sleep(2000);
		act.moveToElement(top).perform();
		
		
				
		
		
	}

}
