package synechronTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationEX {
	
	
	@Test
	public void testcase1() {
		
		System.out.println("testcase1");
		
	}
	
	
	@Test
	public void testcase2() {
		
		System.out.println("testcase2");
		
	}
	
	@Test
	public void testcase3() {
		
		System.out.println("testcase3");
		
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("launch browser");
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("Closing browser");
		
	}
	
	 
	 @BeforeClass
		public void BeforeeClass() {
			
			System.out.println("Db Connection");
			
		}
		
	 
	 @AfterClass
		public void AterClass() {
			
			System.out.println("Db closed");
			
		}
}
