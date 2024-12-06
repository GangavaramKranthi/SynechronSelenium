package Synechrontestcase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionex {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement download= driver.findElement(By.linkText("Practice"));
		

		Actions  act = new Actions(driver);
		
		act.doubleClick(download).perform();;
		
		driver.navigate().back();
		
		WebElement download1= driver.findElement(By.linkText(("Blog")));
		
		Actions  act1 = new Actions(driver);
		
		act1.doubleClick(download1).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
