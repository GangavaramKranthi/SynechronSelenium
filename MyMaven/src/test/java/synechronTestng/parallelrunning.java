package synechronTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelrunning {

	@Test	
	public void launchbrowser(){
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		
		
		
}


		@Test	
	public void launchbrowser1(){
		
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver driver= new FirefoxDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login");
}
}
