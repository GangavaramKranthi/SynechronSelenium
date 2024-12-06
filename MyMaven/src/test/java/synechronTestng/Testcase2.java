package synechronTestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	@Test
	public void radiobutton() {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().window().maximize();
	
	
	WebElement radio=driver.findElement(By.xpath("(//input[@name='radioButton'])[1]"));
	
	radio.click();
	
	WebElement checkbok=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	
	checkbok.click();
	
	
	//for loop check book
	
	List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	int size=checkbox.size();
	
	System.out.println(size);
	
	for(int i =0; i<=size; i++) {
		
	checkbox.get(i).click();
	

	
	}
	
	}
	
}