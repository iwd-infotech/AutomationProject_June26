package enable;

import org.testng.annotations.Test;

public class AlwaysRunTrue {
	
//	Priority -> It controls execution order
//	dependsOnMethods -> It executes only after another method succeeds
//	Enabled -> enable or disable the tests

	@Test 
	public void login() {
		System.out.println("Login");
	}
	
	@Test (dependsOnMethods = "login")
	public void dashboard() {
		System.out.println("Dashboard");
	}
	
	@Test (dependsOnMethods = "dashboard", priority = 2)
	public void payment() {
		System.out.println("Payment");
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
	@Test (alwaysRun = true)
	public void logout() {
		System.out.println("Logout");
	}

}
