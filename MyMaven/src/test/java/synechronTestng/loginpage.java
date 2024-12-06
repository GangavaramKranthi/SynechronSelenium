package synechronTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class loginpage {

	private WebDriver driver;
	//locators and the  methods on the login page
	
	private By email=By.xpath("//input[@id='user-name']");
	
	private By password =By.xpath("//input[@id='password']");
	
	private By login  =By.xpath("//input[@id='login-button']");
	
	public loginpage (WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	@Test
	public void login() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		
		WebElement username = driver.findElement(email);
				username.sendKeys("standard_user");
		
		WebElement password1 = driver.findElement(password);
		password1.sendKeys("secret_sauce");
		
		WebElement login1 = driver.findElement(login);
		login1.click();
	}
	
}