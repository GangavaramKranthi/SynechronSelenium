package synechronTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Testcase4 {

	@Test
	public void Balidationcommands() {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		
		WebElement userName = driver.findElement(By.id("username"));
		
		userName.sendKeys("student");
		
		WebElement Password =driver.findElement(By.id("password"));
		
		Password.sendKeys("Password123");
		
		WebElement login= driver.findElement(By.xpath("//button[@id='submit']"));
		
		  login.click();
		  ////img[@class='custom-logo']
		  
		  WebElement logo=driver.findElement(By.className("custom-logo"));
		 
		  
		  
		  if(logo.isDisplayed())
		  {
			  System.out.println("Home page is page");
		  }
		  else {
			  System.out.println("not display");
		  }
	}
}