package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Candalerdate {

	public static void main(String[] args) throws InterruptedException {


	WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		////label[normalize-space()='New York']
		
		
		WebElement frame= driver.findElement(By.xpath(" //iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//driver.switchTo().frame("demo-frame");
		
		
		WebElement Date= driver.findElement(By.id("datepicker"));
		
		Date.click();
		
		
		
		
	WebElement Date1= driver.findElement(By.xpath("//a[normalize-space()='12']"));
		Date1.click();
		
		Date.clear();
		
		WebElement Date2= driver.findElement(By.xpath("//a[normalize-space()='12']"));
		Date2.click();
		
		
		//add frame path
		
		
		
		
		//indexing
		//driver.switchTo().frame(0);
		
		// name or id
		
	}

}
