package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//WebElement source= driver.findElement(By.xpath("//a[contain(text()='Practice Test Atomation')"])));
		WebElement source= driver.findElement(By.xpath("//a[text()='Practice Test Automation.']"));
				
		Actions act= new Actions(driver);
		
		act.scrollToElement(source).perform();
		
		Thread.sleep(2000);
		source.click();
		
	}

}
