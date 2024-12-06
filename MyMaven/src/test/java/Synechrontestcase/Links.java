package Synechrontestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List <WebElement> Links= driver.findElements(By.tagName("a"));
		
		int size=Links.size();
		
		for(WebElement Link: Links) {
			System.out.println(Link.getText());
		}
		
		
	}

}
