package synechronTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shadowwebelement {

	WebDriver diver;
	
	@Test
	public void getshadow() throws InterruptedException {
		

		WebDriver driver= new ChromeDriver();
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement host =driver.findElement(By.cssSelector("#shadow_host"));
		
		SearchContext contex= host.getShadowRoot();
		
		WebElement text = contex.findElement(By.cssSelector("#shadow_content"));
		
		String tex1 =text.getText();
		
		System.out.println(tex1);
		
		
	}
}
