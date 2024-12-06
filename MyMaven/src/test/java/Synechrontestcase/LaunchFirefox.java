package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriver driver= new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
	//driver.get("https://www.selenium.dev");
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	//by id
	WebElement userName = driver.findElement(By.id("username"));
	
	userName.sendKeys("student");
	
	WebElement Password =driver.findElement(By.id("password"));
	
	Password.sendKeys("Password123");
	
	WebElement login= driver.findElement(By.xpath("//button[@id='submit']"));
	
	  login.click();
	  
	  //linkText
	  
	  //WebElement Logout =driver.findElement(By.linkText("Log out"));
	 // Logout.click();
	  
	  //partial linkText
	  WebElement Logout1 =driver.findElement(By.partialLinkText("Log"));
	  Logout1.click();
		Thread.sleep(2000);
		
		
		driver.close();
		
		driver.quit();
		
	}

}
