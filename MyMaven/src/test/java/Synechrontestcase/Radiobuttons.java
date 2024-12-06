package Synechrontestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement radio=driver.findElement(By.xpath("(//input[@name='radioButton'])[1]"));
		
		radio.click();
		
		WebElement checkbok=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		checkbok.click();
		
		
		//for loop check book
		
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size=checkbox.size();
		
		System.out.println(size);
		
		for(int i =0; i<=size; i++) {
			
		checkbox.get(i).click();
		}
		
//		 WebElement logo=driver.findElement(By.className("custom-logo"));
//		 if(logo.isEnabled())
//		  {
//			  System.out.println("Home page is page");
//		  }
//		  else {
//			  System.out.println("not display");
//		  }
//		
		driver.quit();
		
		
	}
	

}