package synechronTestng;

import org.testng.annotations.Test;

public class Priopritysetting {

	@Test(priority=2)
	public void lauchbrowser() {
		
		System.out.println("lauchbrowser(");
	}
	
	
	@Test(enabled=false)
	public void login() {
		
		System.out.println("login");
	}
	
	
	@Test(priority=0)
	public void product() {
		
		System.out.println("product");
	}
}
