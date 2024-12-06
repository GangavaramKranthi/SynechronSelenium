package Synechrontestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wetableex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//fecth number of rows
		
		List<WebElement> rowno=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		int size= rowno.size();
		System.out.println(size);
				
		List<WebElement> colno=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		
		int size1= colno.size();
		System.out.println(size1);
		
		WebElement celldata=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]"));
		
		String s=celldata.getText();
		System.out.println(s);

		String excepttext="jason";
		
		if(s.equalsIgnoreCase(excepttext)){
			
			System.out.println("matches");
		}
		else {
			System.out.println("not matches");
		}
		
		driver.quit();
	}

}
