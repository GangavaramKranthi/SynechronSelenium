package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesex {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		////label[normalize-space()='New York']
		
		
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//driver.switchTo().frame("demo-frame");
		
		
		WebElement newyork= driver.findElement(By.xpath("label[contains(text(),'New York']"));
		
		
		
		newyork.click();
		
		
		//add frame path
		
		
		
		
		//indexing
		//driver.switchTo().frame(0);
		
		// name or id
		
		
		
	}

}
