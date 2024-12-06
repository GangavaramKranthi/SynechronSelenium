package synechronTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters1 {

		@Test
		@Parameters("browser")
		public void lauchbrowser(String browser) {
			
			if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver= new FirefoxDriver();
				
				driver.get("https://practicetestautomation.com/practice-test-login");
			}
			else if (browser.equals("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.selenium.dev");
				
			}
			
		}
}
