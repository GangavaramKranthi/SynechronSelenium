package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardex {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
		
		Actions act= new Actions(driver);
		
		Actions seriesfact=act.moveToElement(Username).keyDown(Username, Keys.SHIFT).sendKeys("hello");
		
		seriesfact.build().perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
