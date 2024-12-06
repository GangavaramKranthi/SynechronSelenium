package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsercommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

		//get command
	driver.get("https://www.selenium.dev/");
	
	//get title
	
	  String title=driver.getTitle();
	  
	  System.out.println(title);
	  
	  //get currenturl
	  
	String s=  driver.getCurrentUrl();
	  
	System.out.println(s);
	
	  //getpage soure
	
	String x= driver.getPageSource();
	
	System.out.println(x);
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	
	
		

	}

}
