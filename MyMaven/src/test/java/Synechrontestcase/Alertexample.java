package Synechrontestcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		 
		//simple alert
		WebElement simplealert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		
		simplealert.click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		
		//confrim alert
		
		WebElement confrimalert=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		
		confrimalert.click();
		
		Alert alt1=driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(2000);
		
		
		//promot alert
		WebElement promotalert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		
		promotalert.click();
		
		Alert alt2=driver.switchTo().alert();
		
		String aletext=alt2.getText();
		
		System.out.println(aletext);
		
		alt2.sendKeys("Kranthi");
		Thread.sleep(3000);
		alt2.accept();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}