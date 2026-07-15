package enable;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test 
	public void login() {
		System.out.println("Login");
	}
	
	@Test (dependsOnMethods = "login")
	public void dashboard() {
		System.out.println("Dashboard");
	}
	
	@Test (dependsOnMethods = "dashboard")
	public void payment() {
		System.out.println("Payment");
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
	@Test (dependsOnMethods = "payment")
	public void logout() {
		System.out.println("Logout");
	}

}
