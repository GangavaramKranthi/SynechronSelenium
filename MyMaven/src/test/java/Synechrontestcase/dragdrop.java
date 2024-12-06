package Synechrontestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement source= driver.findElement(By.id("column-a"));
		
		WebElement deste= driver.findElement(By.id("column-b"));
		
		Actions act =new Actions(driver);
		
		
		act.dragAndDrop(source, deste).perform();
		

	}

}
