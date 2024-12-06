package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynanmicid {

	public static void main(String[] args) {



		//WebDriver driver= new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
	//driver.get("https://www.selenium.dev");
		
		//dyanamic ids
		
		//input[@name=takeorder-56768787]

		//input[@name=56768787-takeorder]

		//start with
		WebElement Username= driver.findElement(By.xpath("//input[strat-with[@name='takeorder-']]"));
		

		//ends-with
		//input[ends-with[@name='-takeorder']]
		
		WebElement Username1= driver.findElement(By.xpath("////input[ends-with[@name='-takeorder']]"));

		//contains(text()
		//input[contains(text(),'takeorder-')]
		
		WebElement Username2= driver.findElement(By.xpath("//input[contains(text(),'takeorder-')]"));

	}

}
