package synechronTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase3 {

	@Test(groups=("santity"))
	public void dropdown() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		
		sel.selectByValue("option2");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Option3");
		
		Thread.sleep(2000);
		
		sel.deselectAll();
		
	}
}
