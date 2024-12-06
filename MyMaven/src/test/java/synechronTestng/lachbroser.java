package synechronTestng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class lachbroser {
	
	WebDriver driver;
	loginpage fp=new loginpage(driver);
	
	@Test
	public void lunch() throws InterruptedException{
	
	
		fp.login();
	
	
	
	}

}
