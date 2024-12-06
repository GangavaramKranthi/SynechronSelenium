package synechronTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listenerex.class)
public class HardAssertion {
	
	@Test
	public void softassertion() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		String esxpectedtitle ="SwagLabs";
		
		String actualTitl=driver.getTitle();
		
		
		
		
		//Hard Assertion
		
		Assert.assertEquals(actualTitl, esxpectedtitle);
	
		
		WebElement Username = driver.findElement(By.xpath("(//input[@id='user-name'])[1]"));
		
		 Username.sendKeys("standard_user");
		 
		 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		password .sendKeys("secret_sauce");
		
		WebElement login= driver.findElement(By.xpath(" //input[@id='login-button']"));
		
		login.click();
		
	}

}
