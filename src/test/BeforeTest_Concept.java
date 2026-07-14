package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeTest_Concept {

	@Test (priority = 1)
	public void loginTest() {
		System.out.println("Login test");
	}

	@Test (priority = 2)
	public void searchTest() {
		System.out.println("search test");
	}

	@Test (priority = 3)
	public void Payment() {
		System.out.println("Payment test");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

}
