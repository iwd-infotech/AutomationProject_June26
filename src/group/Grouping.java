package group;

import org.testng.annotations.Test;

public class Grouping {

	@Test (groups = "smoke")
	public void login() {
		System.out.println("Smoke Testing");
	}

	@Test (groups = "smoke")
	public void logout() {
		System.out.println("Smoke Testing");
	}

	@Test (groups = {"smoke", "regression"})
	public void dashboard() {
		System.out.println("Smoke & Regression Testing");
	}

	@Test (groups = "regression")
	public void payment() {
		System.out.println("Regression Testing");
	}

	@Test (groups = "regression")
	public void address() {
		System.out.println("Regression Testing");
	}

}
