package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class praticedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Username = driver.findElement(By.xpath("(//input[@id='user-name'])[1]"));
		
		 Username.sendKeys("standard_user");
		 
		 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password .sendKeys("secret_sauce");
		
		WebElement login= driver.findElement(By.xpath(" //input[@id='login-button']"));
		
		login.click();
		WebElement Backpack= driver.findElement(By.xpath("//button[text()='ADD TO CART'][1]"));
		
		Backpack.click();
		
		
		
		//addart
		WebElement add= driver.findElement(By.cssSelector("path[fill='currentColor']"));
		
		 add.click();
		 
		 WebElement Backpack1= driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		 
		 String s=Backpack1.getText();
			System.out.println(s);

			String excepttext="Sauce Labs Backpack";
			
			if(s.equalsIgnoreCase(excepttext)){
				
				System.out.println("matches");
			}
			else {
				System.out.println("not matches");
			}
		 
		 WebElement Checkout= driver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']"));
		 
		 Checkout.click();
		 
		 WebElement Fristname= driver.findElement(By.xpath("//input[@id='first-name']"));
			
		 Fristname.sendKeys("Kranthi");
		 
		 WebElement Lastname= driver.findElement(By.xpath("//input[@id='last-name']"));
			
		 Lastname.sendKeys("Gangavram");
		 
		 WebElement Zip= driver.findElement(By.xpath("//input[@id='postal-code']"));
			
		 Zip.sendKeys("30005");
		 
		 WebElement Continue= driver.findElement(By.xpath("//input[@value='CONTINUE']"));
			
		 Continue.click();
		 
		 WebElement Finish= driver.findElement(By.xpath("//a[normalize-space()='FINISH']"));
			
		 Finish.click();
		 
		 WebElement Text= driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']"));
			
		Text.click();
		 
		 
		 
		 
		 
		
		
		
	}

}
