package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyanamicwebtable {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver= new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/contacts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Username = driver.findElement(By.name("email"));
		
		 Username.sendKeys("gangavaram.kranthi3@gmail.com");
		 
		 WebElement password = driver.findElement(By.name("password"));
		
		password .sendKeys("Chinna@16");
		
		 WebElement login = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		 
		 login.click();
		 
		// driver.switchTo().frame("Mainpanel");
		 
		 Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("//a[href='/contacts']")).click();
		  
		  String beforexpath="//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[";
		  String afterxpath= "/td[2]";
		  
		  for (int i=1; i<=4;i++ ) {
			  String name=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
			  
			  System.out.println(name);
			  
			  if(name.contains("gopi")) {
				  driver.findElement(By.xpath("table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr["+i+"]/td[1]")).click();
				  
				  
			  }
			  
		  }
		 
	}

}