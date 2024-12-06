package synechronTestng;

import org.testng.annotations.Test;

public class Depndsmethod {
	
	@Test
	public void login() {
		
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void addcart() {
		
		System.out.println("addcart");
	}

}
