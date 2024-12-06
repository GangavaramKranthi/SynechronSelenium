package synechronTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestion {

	 String Expected ="Lambadatest";
	 
	 @Test
	public void autosugg() throws InterruptedException{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.gogoole.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	WebElement search=	driver.findElement(By.id("//textarea[@id='APjFqb']"));
	search.sendKeys("Lambada");
	
	Thread.sleep(2000);
	
	List<WebElement> autosuugestionlist=search.findElements(By.xpath(".//li"));
	
		
		for (WebElement listtext:autosuugestionlist)
			{
		
		WebElement term= listtext.findElement(By.xpath(".//span"));
		
		System.out.println(listtext.getText());
			}
			
	}
		
	}

