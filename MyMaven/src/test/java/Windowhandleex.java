import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String Parentwindow=driver.getWindowHandle();
		
		System.out.println(Parentwindow);
		
		WebElement Clickhere=driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		
		Clickhere.click();
		
		Set<String> allwindow= driver.getWindowHandles();
		System.out.println(allwindow);
		
		Iterator<String> itr= allwindow.iterator();
		
		while(itr.hasNext()) {
			
			String Childwindow=itr.next();
			if(!Parentwindow.equals(Childwindow)) {
				
				driver.switchTo().window(Childwindow);
				
				String text=driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
				System.out.println(text);
				
				driver.close();
				
				//driver.switchTo().defaultContent();
				
			}
			
		}
		
	}

}
